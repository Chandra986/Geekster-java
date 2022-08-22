import java.util.Scanner;

class insertion_sort {
    public static void swep(int[] arr,int i, int j){
        int temp= arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
    public static void array_sort(int[] arr, int n){
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swep(arr ,j-1 , j);
                }
                else{
                    break;
                }
            }
        }

    }
     public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
          System.out.println("Enter the size of array");
         int n=scn.nextInt();
         int[] arr= new int[n];
        // System.out.println("Enter the size of array");

         for(int i=0; i<n; i++){
             arr[i]=scn.nextInt();
         }
         System.out.println("Before the sorting");
         for(int i=0; i<n; i++){
             System.out.println(arr[i]+" ");
         }

         array_sort(arr, n);
         System.out.println("After sorting the array");
         for(int i=0; i<n; i++){
             System.out.println(arr[i]+" ");
         }

     }
    
}
