import java.util.*;
public class RemoveVowels {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str=sc.nextLine();
        
        System.out.println("String with vowels : "+ str);
        System.out.println("String without vowels : " + vowel(str));
    }
    static String vowel(String str) 
    { 
         return str.replaceAll("[aeiouAEIOU]", ""); 
    }
}
