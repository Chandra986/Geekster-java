import java.util.Scanner;
public class Arrays2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr;
        
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int v=arr[i];
            if(v%2==0){
                System.out.println(arr[i]);
            }
        }
 
       

}

}  



    