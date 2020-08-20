import java.util.*;
public class RemoveDuplicateElements {
   
   public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    int shiftLeft = j;
                    for (int k=j+1;k<n;k++,shiftLeft++) {
                        a[shiftLeft] = a[k];
                    }
                    n--;
                    j--;
                    }
            }
        }
       
       System.out.print("This is the list without duplicate elements : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}
