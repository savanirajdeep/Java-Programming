import java.util.Scanner;
public class Sum_Of_First_n_numbers 
{
    public static void main(String[] args)
    {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        n=sc.nextInt();
        sum=(n*(n+1))/2;
        System.out.println("Sum of first "+n+" number is "+sum);
    }    
}
