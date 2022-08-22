import java.util.Scanner;

public class Gcd_lcm {


    public static int gcd_lcm(int n,int n1){
        int divisor=n;
        int dividend=n1;
        while(divisor>0){
       
        int rem=dividend%divisor;
        dividend=divisor;
        divisor=rem;
        

        }
        return n*n1/dividend;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int n1=scn.nextInt();
        int ans=gcd_lcm(n,n1);
        System.out.println(ans);
    }
}
