import java.util.Scanner;

public class bubleSort {
    public static void swap(int[] arr, int idx, int i){
        int temp=arr[idx];
        arr[idx] = arr[idx+1];
        arr[idx+1] =temp;

    }
    public static void sort_array(int[]arr, int n) {
        for(int i=0; i<n-1; i++){
            for(int idx=0; idx<n-1-i; idx++){
                if(arr[idx]>arr[idx+1]){
                    swap(arr, idx, i);

                }
            }
        
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
    

