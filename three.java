/*write a java program to print the elements of
3-d matrix using enhanced for loop

input = 
2 3 4
1 2 3 4
5 6 7 8
9 8 7 6
1 8 7 6
4 3 2 1
9 8 7 6
output =
1 2 3 4
5 6 7 8
9 8 7 6
1 8 7 6
4 3 2 1
9 8 7 6 */
import java.util.*;
class three{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][][] mat=new int[num][row][col];
        for(int i=0;i<num;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    mat[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int[][] i:mat){
            for(int[] j:i){
                for(int k:j){
                    System.out.print(k+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
