/*You are given an alphanumeric word W.
You need to find the number of words that can be formed from W.

The words have the following properties:
    - It should be a substring of W of any length, minimum 1.
    - All the letters in the word should be same.


Input Format:
-------------
Single String W.

Output Format:
--------------
Print an integer, the number of words can be formed


Sample Input-1:
---------------
paddy
 
Sample Output-1:
----------------
6

Explanation:
------------
The words are : p, a, d, d, dd, y


Sample Input-2:
---------------
abcde

Sample Output-2:
----------------
5

Explanation:
------------
The words are : a,b,c,d,e
 */
import java.util.*;
class P12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //HashMap<Character,Integer> hs=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        int count=str.length();
        //System.out.println(al);
        //System.out.println(count);
        for(int i=0;i<str.length()-1;i++){
                int res=0;
            if(str.charAt(i)==str.charAt(i+1)){
                int j=i+1;
                char ch=str.charAt(i);
                while(j<str.length() && str.charAt(j)==ch){
                    res++;
                    j++;
                    }
                al.add(res);
                }
            }
        /*for(int i=0;i<al.size();i++){
            int fact=0;
            int res=al.get(i);
            for(int j=1;j<=res;j++){
                fact=fact+j;
            }
                //System.out.println(fact);
            count+=fact;
        }*/
        for(int i=0;i<al.size();i++){
            count+=al.get(i);
        }
        System.out.println(count);
    }
}
