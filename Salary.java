import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int bonus, salary;
       double bonuspercent = 0.1, taxpercent = 0.05, calculation; 
       System.out.println("Enter monthly salary: ");
       salary = input.nextInt();
       System.out.println("Enter bonus: ");
       bonus = input.nextInt();
       calculation = (salary / bonuspercent) + (bonus / taxpercent);
        System.out.println("Calculated bonus and salary: " + calculation);

      
    }
}
