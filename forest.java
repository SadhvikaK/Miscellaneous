/*In a forest, There are N redwoord trees in a row.
You are given the heights of the trees as heights[],

You are task is to find the longest tree arrangement as follows:
	- Minimum size of the tree arrangement is 3.
	- And there exist a Tree-'i' with heights[i], where 0 < i < N-1.
		- heights[0] < heights[1] < heights[2] <...< heights[i] and
		-  heights[i] > heights[i+1] > heights[i+2] >...>heights[N-1] 

And return the length of the longest tree arrangement.
If there is no such arrangement, return 0.

Input Format:
-------------
Line-1: An integer N, number of elements.
Line-2: N space separated integers, value of the elements.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
8
4 2 5 7 4 2 3 6

Sample Output-1:
----------------
5

Explanation:
------------
The longest tree arrangement is : 2 5 7 4 2


Sample Input-2:
---------------
4
2 4 5 7

Sample Output-2:
----------------
0
*/
import java.util.*;
class forest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        //ArrayList<Integer> al=new ArrayList<>();
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            ArrayList<Integer> al1=new ArrayList<>();
            if(arr[i]<arr[i+1]){
                al1.add(arr[i]);
                int k=i;
                while(arr[k]<arr[k+1] && k<arr.length-2){
                    al1.add(arr[k+1]);
                    k++;
                }
                //res+=arr[k];
                for(int l=k;l<arr.length-2;l++){
                    if(arr[l]>arr[l+1]){
                        al1.add(arr[l+1]);
                        //System.out.println(arr[l]);
                    }
                else{
                    break;
                }
            }
            System.out.println(al1);
            if(al1.size()>max){
                max=al1.size();
            }
        }
        if(max<=3){
            max=0;
        }
    }
       System.out.println(max);
    }
}
