import java.util.Scanner;
public class umnatchchar2 {
    static int max_char=26;
    public static String matching_str(String str, String str2){
        String ans="";
        int[]fre1=new int[max_char];
        int[]fre2=new int[max_char];
        for(int i=0; i<str.length(); i++){
            fre1[str.charAt(i)-'a']=1;
        }
        for(int i=0; i<str2.length(); i++){
            fre2[str.charAt(i)-'a']=1;
        }
        
        for(int i=0; i<26; i++){
            if((fre1[i] ^ fre2[i])!=0){
                ans=ans+ (char)(i + 'a');

            }
        }
        if(ans==""){
            return "-1";

        }
        else{
       
        return ans;
        }

    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter first string ");
        String str=scn.nextLine();
        System.out.println("Enter Secondab string ");
        String str2=scn.nextLine();
    String ans=  matching_str(str,str2);
     System.out.print(ans);
        
    }
    
}
