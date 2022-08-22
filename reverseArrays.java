import java.util.*;
 class reverseArrays {
    public static void reverse_array(int[] arr, int n){
        
        for(int i=0; i<n/2; i++){
        
    
             int temp= arr[i];
             arr[i]=arr[n-i-1];
             arr[n-i-1]= temp;
          

            
        }
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        

        int[] arr; // declaration
        arr=new int[n]; // initialization6
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }  
        
        reverse_array(arr, n);

        System.out.println("After reversing the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
