import java.util.*;
public class LargestPalindrome{
    public static boolean isPalindrome(int a){
        int num=a;
        int r,sum=0;
        while(a>0){    
            r=a%10;  
            sum=(sum*10)+r;    
            a=a/10;    
        }  
        if(sum==num){
            return true;
        }  
        else
            return false;
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max=0;
        System.out.println("Enter length of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter element of array : ");
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(isPalindrome(temp)){
                if(max<temp){
                    max=temp; 
                }
            }
        }
        System.out.println("Largest Palindrome Number is : "+max);
    }
}
