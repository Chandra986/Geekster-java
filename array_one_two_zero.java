import java.util.Scanner;

public class array_one_two_zero {
    
    public static void array_travse(int[] arr, int n){
        int p1=-1;
        int p2=0;
        int p3=n-1;
        while(p2<=p3){
            if(arr[p2]==0){
                p1++;
                swap(arr, p1, p2);
                p2++;
                
            }
            else if(arr[p2]==2){
                swap(arr, p2, p3);
                p3--;
            }
            else{
                p2++;
            }
        }

    }

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[j] = arr[i];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array values");
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("printing array before sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
         array_travse(arr, n);

    System.out.println("printing array after sorting");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
}
