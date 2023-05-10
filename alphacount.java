/*Given an list of words you should print all the characters that show up in all strings within the list (including duplicates).  

suppose character occurs 3 times in all words but not 4 times, you need to include that character three times in output

Assume the input will contains all lower case alphabets (a-z)

Print the output in alphabetic order with space separated
If you dont match any characters print -1


input =baba bbaa baaabb
output = a a b b */
import java.util.*;
class alphacount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int count=0;
        HashSet<Character> hm=new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            if(!Character.isWhitespace(str.charAt(i))){
            hm.add(str.charAt(i));
        }
    }
        for(int i=0;i<arr.length;i++){
            String st=arr[i];
            HashMap<Character,Integer> hs=new HashMap<>();
            for(int j=0;j<st.length();j++){
                if(hs.containsKey(st.charAt(j))){
                    hs.put(st.charAt(j),hs.get(st.charAt(j))+1);
                }
                else{
                    hs.put(st.charAt(j),1);
                }
            }
        }
        System.out.println(hm);
            
    }
}

