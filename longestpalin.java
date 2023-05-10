/*
Mr. Gnanesh is working with words. He has given a list of words. 
Each word in the list contains only two lowercase letters [a-z].

He wants to create the biggest word BW, by concatenating words from the list, which 
is a palindrome too. He is allowed to use each word from the list at most once.

Return the length of the biggest word that can be formed using the list.
If it is impossible to create a such word, return 0.

Input Format:
-------------
Space separated strings, words[], two letter words.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
ab ba dd

Sample Output-1:
----------------
6

Explanation: 
------------
The biggest word is, ab,dd,ba => abddba, which is a palindrome.


Sample Input-2:
---------------
pq rs sr mk km pq

Sample Output-2:
----------------
8

Explanation: 
------------
The biggest word is, rs,sr,mk,km => rsmkkmsr or mkrssrkm..etc, 
which is a palindrome.


Sample Input-3:
---------------
aa bb cc

Sample Output-3:
----------------
2
*/
import java.util.*;
class longestpalin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        ArrayList<String> al=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            String st=arr[i];
            if(st.charAt(0)==st.charAt(1)){
                al.add(st);
            }
            else{
                String str1=st.substring(1)+st.substring(0,1);
                if(str.contains(str1)){
                    count+=str1.length();
                }
            }
        }
        if(al.size()>=1){
            System.out.println(count+2);
        }
        else{
            System.out.println(count);
        }
    }
}

