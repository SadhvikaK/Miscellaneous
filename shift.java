/*We define the following operations on a string 

Left Shift : A single circular rotation of the string in which the first character becomes the last character and all other characters are shited 
one index to the left. For example, abcde becomes bcdea after one left shift and cdeab after two left shifts

Right Shift : A single circular rotation of the string in which the last character becomes the first character and all other characters are shifted 
one index to the right. For example, abcde becomes eabcd after one right shift and deabc after two right shifts.

The Program should print the string s after performing the stated shifts.

The first line of input contains s, the string to shift.
The second line contains an integer leftShifts
The third line contains an integer, right Shifts


input = abcd
1
2
output = dabc 


Initially s is abcd, we perform 
1. leftShifts = 1 : abcd -> bcda 
2. rightShifts = 2 : bcda -> abcd -> dabc

The program should print dabc 

input = abcde
2
3
output = eabcd

Explanation -

abcde --> 2 Left Shift 
bcdea
cdeab

3 times Right Shift 
cdeab

bcdea
abcde
eabcd

 */
import java.util.*;
class shift{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int left=sc.nextInt();
        int right=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        int k=0;
        while(k<left){
            sb.deleteCharAt(0);
            sb.insert(sb.length(),str.charAt(k));
            k++;
        }
        int l=0;
        sb1=sb;
        while(l<right){
            char ch=sb.charAt(sb.length()-1);
            sb1.deleteCharAt(sb.length()-1);
            sb1.insert(0,ch);
            sb=sb1;
            l++;
        }
        System.out.println(sb.toString());
    }
}