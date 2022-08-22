import java.util.Scanner;

public class mountainArray {
    
    public static boolean check_arrayMountain(int [] arr, int n){
        if(n<3) return false;
        int i=-1;
        for(i=1; i<n; i++ ){
            if(arr[i-1]>=arr[i]){
                break;
            }

        }
        if(i==1 || i==n){
            return false;
        }
        for(; i<n; i++){
            if(arr[i-1]<=arr[i]){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the  array Value");
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        boolean array= check_arrayMountain(arr, n);
        if(array){
            System.out.println("Yes it is mountain array ");
        }else{
            System.out.println("No it is not mountain array");
        }
        
    }
}
