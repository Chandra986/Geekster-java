import java.util.Scanner;

/**
 * Hello
 */
public class floor {
    
    public static int factorial(int n){
        int m=30;
        int f=1;
    for(int i=1; i<=n; i++){
        f = (f*i)%m;

        
    }
    return f;
}

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
         int ans=factorial(n); 
         System.out.println(ans);  
        
        
       
    }

}  
