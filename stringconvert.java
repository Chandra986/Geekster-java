import java.util.Scanner;
public class stringconvert {
    public static String converString(String str){
        String ans="";
        //Character ch=str.charAt(0);
        Character ch=str.charAt(0);
        if('a'<=ch&& ch<='z'){
            ch= Character.toUpperCase(ch);
         //ans=   ans+ch;

        }
        ans=   ans+ch;
        for(int i=1; i<str.length(); i++){
            ch=str.charAt(i);
            if('A'<=ch && ch<='Z'){
                ch=Character.toLowerCase(ch);

            }
            ans=ans+ch;

            

        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         String str=scn.nextLine();
         String[] arr= str.split(" ");
         for(int i=0; i<arr.length; i++){
            String s=arr[i];

            String ans=converString(s);
            System.out.println(ans+" ");

         } 
        
    }
    
}
