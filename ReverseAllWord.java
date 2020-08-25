import java.util.*;
public class ReverseAllWord {
    
    static void palindromestring(String str){
        
        String[] words=str.split(" ");
        String revstr="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String revword="";
            
            for(int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);
            }
            revstr=revstr+revword+" ";
        }
        System.out.println("Sentence with all word as Palindrome : "+revstr);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str=sc.nextLine();
        palindromestring(str);
    }
}   
