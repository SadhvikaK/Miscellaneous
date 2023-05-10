/*Gene and Minne are playing with the words. Minne is always sure that his word will be equal to the Genes word, after moving few letters of the Genes word to the end.
Help Minne to solve the problem.

The first line of input contains the Genes word followed by Minne word. 
If it matches print true else print false


Sample Test Case - 1
input = abcde 
eabcd
output = true 


After performing the Genes word abcde-bcdea-cdeab-deabc-eabcd.


Sample Test Case - 2
input = abcdef
fedcba
output = false

Explanation -
After performing the Genes word  abcdef bcdefa cdefab defabc efabcd fabcde 
which doesnt match with the Minne word so the output is false 
 */
import java.util.*;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            String res=str.charAt(str.length()-1)+str.substring(0,str.length()-1);
            if(str1.equals(res)){
                count++;
            }
            else{
                count+=0;
            }
            str=res;
        }
        if(count>=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
