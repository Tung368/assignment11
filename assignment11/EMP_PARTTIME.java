package assignment11;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class EMP_PARTTIME extends EMPLOYEE implements IEMPLOYEE{
    private int numberOfWorkdays;
    
    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }
    
     public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }
     
    @Override
      public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee ID: ");
        EmpID = scanner.nextLine();
        System.out.print("Employee Name: ");
        EmpName = scanner.nextLine();
        System.out.print("Date of Birth: ");
        LocalDate EmpDateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.print("Start Date: ");
        LocalDate StartDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Number of Workdays: ");
        numberOfWorkdays = scanner.nextInt();
    }
      
    @Override
    public void Output() {
        System.out.println("Part-time Employee ID: " + EmpID);
        System.out.println("Part-time Employee Name: " + EmpName);
        System.out.println("Date of Birth: " + EmpDateOfBirth);
        System.out.println("Start Date: " + StartDate);
        System.out.println("Number of Workdays: " + numberOfWorkdays);
        System.out.println("Salary: " + CalculateSalary());
        System.out.println("Allowance: " + CalculateAllowance());
    }
    
    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * numberOfWorkdays / 26 + CalculateAllowance();
    }
    
    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        } else {
            return 0;
        }
    }
}