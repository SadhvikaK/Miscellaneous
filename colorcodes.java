/*
There are numerous possible combinations of HTML colour codes, and each one is 
given a specific identification number. Each codes[i] in the list,  
is an HTML colour code that was chosen by the web designer. The list may 
contain duplicate codes.

The web designer's customer made the decision to eliminate P number of 
consecutive codes from the list. However, the web designer wants to preserve as 
many distinctive colour codes as he can. Find out how many unique colour codes 
the web designer can preserve, and print the count of unique color codes.


Input Format:
-------------
Line-1: Comma separated integers, codes[], HTML color codes
Line-2: An integer P.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
2,3,2,6,3,3,7,1
4

Sample Output-1:
----------------
4

Explanation: 
------------
The unique color codes he can preserve are, [2,3,7,1]
by removing [2,6,3,3].


Sample Input-2:
---------------
1,2,1,2,3,3,2,1,2,1
6

Sample Output-2:
----------------
2

Explanation: 
------------
The unique color codes he can preserve are, [2,1,2,1] or [1,2,1,2]
by removing 6 contiguous codes.
*/ 
import java.util.*;
class colorcodes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(",");
        ArrayList<Integer> al1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al1.add(Integer.parseInt(arr[i]));
        }
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=al1.size()-n;i++){
            ArrayList<Integer> al=new ArrayList<>();
            al.addAll(al1);
            for(int j=i;j<(i+n);j++){
                al.set(j,0);
            }
            HashSet<Integer> hs=new HashSet<>();
                for(int j=0;j<al.size();j++){
                    hs.add(al.get(j));
                }
                if(hs.size()>count){
                    count=hs.size();
                }
            }
            System.out.println(count-1);
        }
    }
    