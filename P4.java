import java.util.*;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //ArrayList<String> al=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int count=0;
        int i=0;
        while(i<str.length()){
            count=0;
            if(str.charAt(i)=='+'){
                if(str.charAt(i)==str.charAt(i+1) && i!=count){
                    sb.append('-');
                    sb.append('-');
                    sb.append(str.substring(i+2,str.length()-1));
                    count=i;
                    i=i+2;
                }
                else if(str.charAt(i)==str.charAt(i+1) && i==count){
                    i++;
                }
                else{
                    sb.append(str.charAt(i));
                    i++;
                }
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}

