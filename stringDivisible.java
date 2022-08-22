import java.util.Scanner;

public class stringDivisible {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int n= str.length();
        if(n%3==0){
            System.out.println("string divisible");
        }
        else{
            System.out.println("string  not divisible");

        }
    }
}
