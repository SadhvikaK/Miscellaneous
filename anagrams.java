/*Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 

input =cbaebabacd
abc
output =0 6
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

input=abab
ab
output =0 1 2

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

 */
import java.util.*;
class anagrams{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String tar=sc.next();
        char[] arr=tar.toCharArray();
        for(int i=0;i<=str.length()-tar.length();i++){
            ArrayList <Character> al=new ArrayList <>();
            for(int j=0;j<tar.length();j++){
                al.add(str.charAt(i+j));
            }
            Collections.sort(al);
            //System.out.println(al);
            Arrays.sort(arr);
            int m=0,n=0,ct=0;
            while(m<al.size() && n<arr.length){
                
                if(al.get(m)==arr[n]){
                    ct++;
                }
                m++;
                n++;
            }
            if(ct==arr.length){
                System.out.println(i);
               // break;
            
            }
        }
    }
}