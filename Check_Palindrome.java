import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        
        if(rev==m)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number not is Palindrome");
     
    }
}
