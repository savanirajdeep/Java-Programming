import java .util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1=sc.nextLine();
        System.out.println("Enter second String : ");
        String str2=sc.nextLine();
        
        int l1=str1.length();
        int l2=str2.length();
        if(l1==l2){
            int[] freq1= new int[l1];
            char[] s1=str1.toCharArray();  
            for(int i=0;i<l1;i++){
                freq1[i]=1;
                for(int j=i+1;j<l1;j++){
                    if(s1[i]==s1[j])
                        freq1[i]++;
                }
            }        
            int[] freq2= new int[l2];
            char[] s2=str2.toCharArray(); 
            for(int i=0;i<l2;i++){
                freq2[i]=1;
                for(int j=i+1;j<l2;j++){
                    if(s2[i]==s2[j])
                        freq2[i]++;
                }
            }
            int m1=freq1.length;
            int m2=freq2.length;
            if(m1==m2){
                System.out.println("Strings are Anagram...");
            }
            else
                System.out.println("Strings are Not Anagram..");
        }
        else    
            System.out.println("Not Anagram..");    
    }
}
    
