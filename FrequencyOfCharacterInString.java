import java.util.*;
public class FrequencyOfCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String str=sc.nextLine();
        int l=str.length();
        int[] freq= new int[l];
        //convert string into character array 
        char s[]=str.toCharArray(); 
        
        for(int i=0;i<l;i++){
            freq[i]=1;
            for(int j=i+1;j<l;j++){
                if(s[i]==s[j])
                    freq[i]++;
            }
        }
       
        System.out.println("Final String : ");
        int m=freq.length;
        for(int i=0;i<m;i++){
            System.out.println(s[i] + " is "+ freq[i]+" times");
        }
    }
}
