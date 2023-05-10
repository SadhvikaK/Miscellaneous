import java.util.*;
class P11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        HashMap<String,String> hs=new HashMap<>();
        for(int i=0;i<num;i++){
            String str=sc.next();
            String[] arr=str.split(",");
            hs.put(arr[0],arr[1]);
        }
        String str1=sc.next();
        int count=0;
        String str2="";
        for(Map.Entry<String,String> entry1:hs.entrySet()){
            if(Objects.equals(entry1.getValue(),str1)){
                str2=entry1.getKey();
                System.out.println(str2);
        ArrayList<String> al=new ArrayList<>();
        for(Map.Entry<String,String> entry:hs.entrySet()){
            al.add(entry.getKey());
            al.add(entry.getValue());
            System.out.println(al);
            if(al.get(1).equals(str2)){
                System.out.println(al.get(0));
                count++;
            }
            al.clear();
            }
            }
        }
        System.out.println(count);
}
}

