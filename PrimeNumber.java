import java.util.Scanner;
 public class PrimeNumber {
public static void main(String[] args) {
    

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // boolean isprime=true;
        for(int num=2; num<=n; num++){
            boolean isprime=true;
            for(int factor=2; factor<=(n-1); factor++){
                if(num%factor==0){
                    boolean isPrime=false;
                }
                if(isprime==true){
                    System.out.println(num);
                }
            }
        }


    
        
    }
    
}
