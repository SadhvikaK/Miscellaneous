import java.util.*;
class nthlarge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            al.add(arr[i]);
        }
        int n=sc.nextInt();
        int len=al.size();
        int count=0;
        while(len>0){
            int max=0;
            for(int i=0;i<al.size();i++){
                if(max<al.get(i)){
                    max=al.get(i);
                }
            }
            Collections.replaceAll(al,max,0);
            count++;
            System.out.println(al);
            if(count==n){
                System.out.println(max);
                break;
            }
            len--;
        }
    }
}