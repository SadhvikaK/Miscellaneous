/*Write a Program to read a Line from the user and convert it into a Encoded string
A string can be made into Encoded string if the alphabets are changed 
in the given manner : a->z or z->a , b->y or y->b and so on.  

Note: All the alphabets in the string are in lowercase.


input =hello i am good
output = svool r zn tllw

Encoded string of "hello i am good " will be "svool r zn tllw" since h->s, e->v, l->o and So on

input = varun 
output = ezifm

Explanation 
Encoded string of "varun" will be "ezifm" since v->e , a->z , r->i , u->f and n->m.

input = akshay
output = zphszb

Explanation
Encoded string of "akshay" will be "zphszb" since a->z , k->p , s->h , h->s , a->z and y->b.

 */
import java.util.*;
class count{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String abc="abcdefghijklmnopqrstuvwxyz";
        String xyz="zyxwvutsrqponmlkjihgfedcba";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
            char ch=str.charAt(i);
            int num=abc.indexOf(ch);
            char ch1=xyz.charAt(num);
            sb.append(ch1);
            }
            else if(Character.isWhitespace(str.charAt(i))){
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }
}