import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner; 

public class AgeCalculator{
    public static void main(String[] args){
       
        LocalDate today = LocalDate.now();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year of your Birth : ");
        int yearOfBirth = sc.nextInt();
        System.out.print("Enter Month of your Birth : ");
        int MonthOfBirth = sc.nextInt();
        System.out.print("Enter date of your Birth : ");
        int dateOfBirth = sc.nextInt();
        
        LocalDate BirthDate = LocalDate.of(yearOfBirth, MonthOfBirth, dateOfBirth);
        int years = Period.between(BirthDate, today).getYears();
        
        System.out.println("\n\n***** This is result *****\n");
        System.out.println("This is today's Date : " + today);
        System.out.println("This is your Birthdate : " + BirthDate);
        System.out.println("This is your Age : " + years);
    }
}
