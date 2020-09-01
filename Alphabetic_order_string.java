import java.util.Scanner;
public class Alphabetic_order_string {
    public static void main(String[] args){
        
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n Value : ");
        int n=sc.nextInt();
        
        String names[] = new String[n+1];
        System.out.print("Enter "+ n +" Names : ");
        
        for(int i=0;i<=n;i++){
            names[i] = sc.nextLine();
        }
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(names[j-1].compareTo(names[j])>0){
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
        
        System.out.print("\nAlphabetic Ordered List is : ");
        for(int i=0;i<=n;i++){
            System.out.println(names[i]);
        }
    }
}
