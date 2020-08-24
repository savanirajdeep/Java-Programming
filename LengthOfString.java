import java.util.*;
public class LengthOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String str=sc.nextLine();
        int temp=0; 
        for(char c:str.toCharArray()){
            temp++;   
        }
        System.out.println(temp);
    }
}

