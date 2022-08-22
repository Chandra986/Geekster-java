import java.util.Scanner;
public class twoDarra {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the  rows number");
        int n= scn.nextInt();
        System.out.println("Enter the column number");
        int m= scn.nextInt();
        int[] [] arr=new int[5][3];
        System.out.println("Enter the "+m*n+" value of array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            arr[i][j] = scn.nextInt();
        }
       
        }
        System.out.println("print the two d array");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();

    }
    System.out.println("Sum of two d array");
    int sum=0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
       int elemnt=arr[i][j];
       sum=sum+elemnt;

    }
    
}
System.out.print("print the sum"+sum);
    System.out.println("");
}
}
        
    
    

