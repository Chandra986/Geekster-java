import java.util.Scanner;

public class Decimal_To_Binary {
    public static String Decimal_convert(int n){
        String binary="";
        while(n!=0){
            int rem=n%2;
            binary=rem+binary;
            n=n/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String ans=Decimal_convert(n);
        System.out.println(ans);
    }
}
