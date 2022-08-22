import java.util.Scanner;

public class reversestring {
    public static String reverse(String s){
        String ans=" ";
        int n=s.length();
        for(int i=n-1; i>=0; i--){
            ans=ans+s.charAt(i);
        }
return ans;

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String[]arr= str.split(" ");
        for(int i=0; i<arr.length; i++){
            String s=arr[i];
            String rev= reverse(s);
            System.out.print(rev+" ");
        }
        
    }
}
