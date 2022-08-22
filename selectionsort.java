import java.util.Scanner;

/**
 * sorting
 */
public class selectionsort {
    public static void swap(int[] arr,int i, int min_idx) {
        int temp=arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] =temp;
    }
    public static void sort_array(int[] arr, int n){
        for(int i=0; i<n; i++){
            int min_idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            swap(arr, i, min_idx);
        }
        
    }

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0; i<n; i++){
            arr[i] =scn.nextInt();
           // sort_array(arr, n);

        }
        System.out.println("Before sorting array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
        sort_array(arr, n);
        System.out.println("After sorting array");
        
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }


        
    }

    
}