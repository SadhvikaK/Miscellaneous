/*Mr. Bob is a Military Encoders. 
Mr. Bob writes a word as shown below and then merges them. 
Help Bob to write the code. 

Mr. Bob will be given a word 'w' and a number 'n' 

Sample Test Case - 1
input = 
ABCDE
2
output = ACEBD


This is How Bob writes the letters of the word 
A    C    E
   B    D

Now concatenate the two rows and ignore spaces in every row. We get ACEBD


Sample Test Case - 2
input = system
3
output = seytms

s         e
  y    t    m
     s

Now concatenate the 3 rows we get seytms */
import java.util.*;
class P3{
        public String change(String st,int n){
            if(st.length()<=1||n==1){
                return st;
            }
            StringBuilder s=new StringBuilder();
            for(int i=0;i<n;i++){
                for(int j=i;j<st.length();j+=n+(n-2)){
                    s.append(st.charAt(j));
                    if((i!=0 && i!=n-1) && j+(2*(n-i-1))<=st.length()){
                        s.append(st.charAt(j+(2*(n-i-1))));
                    }
                }
            }
            return s.toString();
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=sc.nextInt();
        P3 sol=new P3();
        System.out.println(sol.change(str,num));
    }
}