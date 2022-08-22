import java.util.Scanner;

public class firstlastcuurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     System.out.println("enter the size of array");
        int n=sc.nextInt();
        
       
        int [] arr;
        
        arr=new int[n];
        System.out.println("enter array values");
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the target value");
        int targ=sc.nextInt();
        int last=-1;
        int first=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==targ){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println("fist occurence is="+first);
        System.out.println("last occurence is ="+last);
        
    }
    
}
