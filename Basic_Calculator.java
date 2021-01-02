import java.util.*;

public class Basic_Calculator {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a : ");
        double a=in.nextDouble();
        System.out.print("Enter b : ");
        double b=in.nextDouble();
        double ans;
        System.out.println("Select Operation you want to perform : ");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Division");
        int k=in.nextInt();
        switch(k){
            case 1:
                System.out.println("Addition of "+a+" and "+b+" = "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of "+a+" and "+b+" = "+(a-b));
                break;
            case 3:
                System.out.println("Addition of "+a+" and "+b+" = "+(a*b));
                break;
            case 4:
                if(b==0){
                    System.out.println("b should no zero..");
                }
                else 
                    System.out.println("Division of "+a+" and "+b+" = "+(a/b));
                break;
            default:
                System.out.println("Invalid choise...");
                break;
        }
    }
}
