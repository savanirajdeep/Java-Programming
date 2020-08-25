import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to convert Binary number : ");
        int n=sc.nextInt();
        long bn=0;
        int r,i=1,step=1;

        while (n!=0)
        {
            r=n%2;
            n/=2;
            bn+=r*i;
            i*=10;
        }
        System.out.println("Binary number of the given number : "+bn);
    }    
}
