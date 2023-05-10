/*Somu is playing a game. The Game Rules are as follows 

A word will be given, where Ramu has to replace the letters of the word with V/C
If the letter is a vowel it will be de denoted by upper case letter ‘V’ and 
if the letter is a consonant it will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Letters will be only(a-z/A-Z)

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV 

 */
import java.util.*;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder res1=new StringBuilder(str);
        for(int i=0;i<res1.length();i++){
            char ch1=res1.charAt(i);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                res1.setCharAt(i,'V');
            }
            else{
                res1.setCharAt(i,'C');
            }
        }
        int j=1;
        for(int i=0;i<res1.length()-1;i++){
            if(j<res1.length()){
                if(res1.charAt(i)==res1.charAt(j)){
                    res1.deleteCharAt(i);
                    j++;
                }
                else{
                    j++;
                }
        }
        }
        System.out.println(res1.toString());
    }
}
