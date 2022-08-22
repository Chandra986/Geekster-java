import java.util.Scanner;
 public class Uncoman_char {
  //  static int max_char=26;
    public static void matching_str(String str,String str2){
     int[]fre=new int[26];
    for(int i=0; i<26; i++){
        fre[i]=0;

    }
    int l1=str.length();
    int l2=str.length();
    for(int i=0; i<l1; i++){
        fre[str.charAt(i)-'a']=1;
    }
    for(int i=0; i<l2; i++){

        if(fre[str2.charAt(i)-'a']==1||fre[str2.charAt(i)-'a']==-1){
            fre[str2.charAt(i)-'a']=-1;

        }
        else{
            fre[str2.charAt(i)-'a']=2;
        }
        
    }
    for(int i=0; i<26;i++){
        if(fre[i]==1||fre[i]==2){
            System.out.print((char)(i+'a')+" ");
        }
    }

        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter first string ");
        String str=scn.nextLine();
        System.out.println("Enter Secondab string ");
        String str2=scn.nextLine();
        matching_str(str,str2);
        
    }
    
}
