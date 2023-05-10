/*Given a line s, reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Example 1:
Input: hello
Output: holle


Example 2:
Input: Keshavmemorial
Output: Kashivmomerael

Example 3:
Input: variations
Output: voriatians
 */
import java.util.*;
class vowels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                sb.append(str.charAt(i));
                al.add(i);
                sb1.append(str.charAt(i));
            }
            else{
                sb1.append(str.charAt(i));
                continue;
            }
        }
            sb.reverse();
        for(int i=0;i<al.size();i++){
            char ch=sb.charAt(i);
            sb1.replace(al.get(i),al.get(i)+1,String.valueOf(ch));
        }
            System.out.println(sb1.toString());
    }
}