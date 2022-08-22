import java.util.Scanner;

public class Binary_to_decimal {
    public static int Decimal_convert(String str){
        int n=str.length();
        int current_pow=1;
        int ans=0;
        for(int i=n-1; i>=0; i--){
            char ch=str.charAt(i);
            if(ch=='1'){
                ans=ans+current_pow;
            }
            current_pow=current_pow*2;


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int ans= Decimal_convert(str);
        System.out.println(ans);


    }
}
