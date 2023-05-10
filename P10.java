import java.util.*;
class P10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int[] arr1=arr[0];
            int max=arr1[0];
            int in=0;
            for(int j=0;j<arr1.length;j++){
                if(max<arr1[j]){
                    in=j;
                    max=arr1[j];
                }
            }
            
            int min=arr[in][0];
            for(int k=0;k<row;k++){
                if(min>arr[k][in]){
                    min=arr[k][in];
                }
            }
            if(min==max){
                System.out.println(min);
                break;
            }
        if(min!=max){
            System.out.println(-1);
            break;
        }
        }
    }
}
