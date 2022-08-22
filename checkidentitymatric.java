import java.util.Scanner;

public class checkidentitymatric {
    public static boolean checkIdentityMatrix(int[][] arr, int n, int m){
        if(n!=m){
            return false;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        return false;

                    }
                }
                else{
                    if(arr[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        boolean ans=checkIdentityMatrix(arr, n, m);
        System.out.println(ans);
        
    }
    
}

