import java.util.Scanner;
public class ReversingNumber{  
 public static void main(String args[])
{  
    int temp;
    int number;
    int number2=0;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number for reversing number : ");
    number = in.nextInt();    
    while(number!=0)
    {
        temp=number%10;
        number2=number2*10+temp;
        number=number/10;
    }
    System.out.print("This is the number of reverse number : "+number2);    
 }  
}  
