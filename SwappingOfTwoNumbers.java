import java.util.Scanner;
public class Swap2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);        
        System.out.println("Before swapping number "+n1+" and "+n2);
        n1=n1+n2;  
        n2=n1-n2;  
        n1=n1-n2;
        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);        
        System.out.println("Before swapping number "+n1+" and "+n2); 
    }
}
