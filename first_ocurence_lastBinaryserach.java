import java.util.Scanner;

public class first_ocurence_lastBinaryserach {
    public static void binar_serch_occurnce(int[]arr, int n, int tar){
        int first_occuence=-1;
        int last_occurence=-1;
        int left=0;
        int right=n-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(tar==arr[mid]){
                first_occuence=mid;
                right=mid-1;
            }

          else if(tar<arr[mid]){
            right=mid-1;


            }
            else{
                left=mid+1;
            }
        }
        left=0;
        right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(tar==arr[mid]){
                last_occurence=mid;
            left=mid+1;
            }

          else if(tar<arr[mid]){
            right=mid-1;


            }
            else{
                left=mid+1;
            }
        }
        int count=last_occurence-first_occuence;
        System.out.println(count);
      //  System.out.println("first occurence="+first_occuence);
      //  System.out.println("Last occurence="+last_occurence);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        binar_serch_occurnce(arr,n, tar);
    }
}
