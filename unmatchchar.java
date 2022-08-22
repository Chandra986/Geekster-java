import java.util.Scanner;

public class unmatchchar {
    public static void matching_str(String str,String str2){
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
     for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        if(str2.indexOf(ch)<0){
            sb.append(ch);
        }
     }
     for(int i=0; i<str2.length(); i++){
        char ch=str2.charAt(i);
        if(str.indexOf(ch)<0){
            sb1.append(ch);
        }
     }
     if(sb.toString().length()==0 && sb1.toString().length()==0){
        System.out.println("No mis match");
     }
     else{
        System.out.println(sb.toString()+""+sb1.toString());
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
