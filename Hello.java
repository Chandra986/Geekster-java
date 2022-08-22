import java.util.Scanner;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i= n-1; i>=0; i--){
            arr[i]=scn.nextInt();
            System.out.println(arr[i]);
        
        
            
        }
        
       
    }

}  

