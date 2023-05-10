import java.util.*;
class P8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num  = sc.next();
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"");
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        if(num.length()==1){
            int n = Integer.valueOf(num);
            String v = hm.get(n);
            for(int i =0;i<v.length()-1;i++)
            {
                System.out.print(v.charAt(i)+" ");
            }
            System.out.print(v.charAt(v.length()-1));
        }
        if(num.length()==2)
        {
            ArrayList<Character> al = new ArrayList<>();
            char c=num.charAt(0);
           // String v1 = hm.get(num2);
            //String v2 = hm.get(Integer.valueOf(num.charAt(1)));
            /*for(int i =0;i<v1.length();i++)
            {
                for(int j=0;j<v2.length();j++)
                {
                    System.out.print((v1.charAt(i)+v2.charAt(j))-'0');      
                }
            }
            //System.out.println(al);*/
            System.out.println(c);
        }
    }
}
