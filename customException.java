import java.util.*; 

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

class Main{

   static void validate(int age)throws InvalidAgeException{
     if(age<18){
        throw new InvalidAgeException("not valid");   
     }
     else{
        System.out.println("Welcome to Vaccincation");
        int n=10;
        int relation[]=new int[n];
        Random rand = new Random();
        int i,j;
        for (i = 0; i < n; i++){
                relation[i] = rand.nextInt(100);
        }
        System.out.println("----Generated Matrix----\n");
        System.out.println("Center\tAvailable Vaccines");
        for (i = 0; i < n; i++) {
                System.out.print(i+"\t"+relation[i]);
            System.out.println();
        }
    
   }
   }

   
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            System.out.print("Enter age for COWIN platform : ");
            int age = sc.nextInt();
        try{
                validate(age);
        }catch(Exception m){
            System.out.println("Exception occured: "+ m );
        }

        System.out.println("rest of the code...");
    }
}