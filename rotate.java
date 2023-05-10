import java.util.*;
class rotate{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=sc.next();
        int r=sc.nextInt();
        String ab="abcdefghijklmnopqrstuvwxyz";
        String s1=ab.substring(0,r);
        String s2=ab.substring(r,ab.length());
        String s3=s2+s1;
        StringBuilder sb=new StringBuilder();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                str1=str.toLowerCase();
                sb.append(s3.charAt(ab.indexOf(str1.charAt(i))));
        }
        else{
            sb.append(str1.charAt(i));
        }
    }
    for(int i=0;i<sb.length();i++){
        if(Character.isUpperCase(str.charAt(i))){
            sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
        }
    }
    System.out.println(sb.toString());
}
}