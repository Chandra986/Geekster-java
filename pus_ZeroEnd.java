import java.util.Scanner;

/**
 * pus_ZeroEnd
 */
public class pus_ZeroEnd {

    

public static void pushZerosToEnd(int res[],int arr[], int n)
    {
      
    int ind=0;
        for (int i = 0; i < n; i++){
            if (arr[i] != 0){
                res[ind] = arr[i];
                ind++;  
            }
      
                    }
    for(int i=ind;i<n;i++)
        res[i]=0;
   

}
    
    

    public static void main(String[] args) {
       
  Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int res[]=new int[n];
        pushZerosToEnd(res,arr,n);
        for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
        }
        }
    }
