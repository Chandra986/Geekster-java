import java.util.Scanner;

public class Balance_string {
    public static boolean check_Balancestring(String str){
        int n=str.length();
        int first_half=0;
        int last_half=0;
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                char ch=str.charAt(i);
                int val=ch-'0';
                first_half=first_half+val;
            }
            for(int i=n/2; i<n; i++){
                char ch=str.charAt(i);
                int val=ch-'0';
                last_half=last_half+val;
            }

        }
        else{
            for(int i=0; i<n/2; i++){
                char ch=str.charAt(i);
                int val=ch-'0';
                first_half=first_half+val;
            }
            for(int i=n/2+1; i<n; i++){
                char ch=str.charAt(i);
                int val=ch-'0';
                last_half=last_half+val;
            }
        }
            if(first_half==last_half){
                return true;
            }
            else{
                return false;
            }
            

        
        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        boolean ans= check_Balancestring(str);
        if(ans==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
