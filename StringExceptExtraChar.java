import java.util.*;
public class StringExceptExtraChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str=sc.nextLine();       
        String resultstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<=122)
                resultstr=resultstr+str.charAt(i);
        }
        System.out.println("String without Extra characters is : "+resultstr); 
    }
}
