import java.util.Scanner;

public class minmax_vowelsdistace {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
   int n=str.length();
   int first_ocuurence=-1;
   int last_occurence=-1;
   int last=-1;
   int min_distace=Integer.MAX_VALUE;
   for(int i=0; i<n; i++){
    char ch=str.charAt(i);
    if(isVowel(ch)==true){
        if(first_ocuurence==-1){
            first_ocuurence=i;
        }
        
            last_occurence =i;
        
        if(last==-1){
            last =i;
        }
        else{
            int distace=i-last;
              min_distace=Math.min(min_distace,distace);

             

            last=i;
        }

    }

   }
   int max_distance=last_occurence-first_ocuurence;

        System.out.println("Minimum distance between two vowels is: "+min_distace);
        System.out.println("Maximum distance between two vowels is: "+max_distance);

    }
}
