import java.util.Scanner;
public class BinarytoDecimal{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number : ");
        long num1 = sc.nextLong();
        int decimal = convertBinaryToDecimal(num1);
        System.out.printf("%d in binary = %d in decimal", num1, decimal);
        
        System.out.println("\nEnter Decimal number : ");
        int num2=sc.nextInt();
        long binary = convertDecimalToBinary(num2);
        System.out.printf("%d in decimal = %d in binary", num2, binary);
    }

    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
    
    public static long convertDecimalToBinary(int n)
    {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n!=0)
        {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
    
}
