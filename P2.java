/*Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script. Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 


Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y 
*/
import java.util.*;
class P2{
    static void Encoder(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            int ch=(int)str.charAt(i);
            System.out.println(ch);
            if(ch==97||ch==101||ch==105||ch==111||ch==117||ch==65||ch==69||ch==73||ch==79||ch==85){
                res=res+str.charAt(i);
            }
            else{
                res=res+str.charAt(i)+"#"+str.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Encoder(str);
    }
}