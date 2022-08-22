import java.util.Scanner;

public class stringAnagram {
    public static boolean pangram(String str , String str1){
        int n1=str.length();
        int[]fre1=  new int[26];
        for(int i=0; i<n1; i++){
            char ch=str.charAt(i);
            int idx=ch-'a';
            fre1[idx]++;
        }
        int n2=str1.length();
        int[]fre2=  new int[26];
        for(int i=0; i<n1; i++){
            char ch=str.charAt(i);
            int idx=ch-'a';
            fre2[idx]++;
        }
        for(int i=0; i<26; i++){
            if(fre1[i]!=fre2[i]){
                return false;
            }
        }
        return true;

    }

   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    String str1=scn.nextLine();
    boolean ans= pangram(str,str1);
    if(ans==true){
        System.out.println("True");
    }
    else {
        System.out.println("False");
    }
   } 
}
