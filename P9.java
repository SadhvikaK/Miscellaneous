import java.util.*;
class P9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            al.add(str.charAt(i)-'0');
        }
        int len=al.size()-2;
        if(al.get(len)>=0 && al.get(len)>=al.get(len+1)){
            len--;
        }
        if(al.get(len)>=0 && al.get(len)<al.get(len+1)){
            List<Integer> al1=al.subList(len+1,al.size());
            int j=al.get(len)+1;
            System.out.println(len);
            System.out.println(j);
            if(al1.contains(j)){
                int l=al.indexOf(j);
                System.out.println(al1);
                System.out.println(l);
                Collections.swap(al,len,l);
                
            }
        }
        System.out.println(al);
    }
}
