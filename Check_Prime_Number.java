
import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String[] args)
    {
        int n,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n=sc.nextInt();
        for(int i=2;i<n/2;++i)
        {
            if(n%i==0){
                temp=1;
                break;
            }
        }
        if(n==1){
            System.out.println("1 is neither prime nor composite");
        }
        else{
            if (temp==0)
                System.out.println( n +" is a prime number \n");
            else    
                System.out.println( n +" is not a prime number \n");
        }
    }
}
