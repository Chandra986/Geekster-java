import java.util.Scanner;

public class palindromestring {
    public static boolean checkPalindrome(String str){
        int n=str.length();
        int i=0; 
        int j=n-1;
        while(i<j){
            char charAti=str.charAt(i);
            char charAtj=str.charAt(j);
            if(charAti!=charAtj){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine(); 
        boolean ans=checkPalindrome(str);
        System.out.println(ans);
          
    }
    
}


