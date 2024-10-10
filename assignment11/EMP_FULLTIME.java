package assignment11;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class EMP_FULLTIME extends EMPLOYEE implements IEMPLOYEE{
    private double coefficientSalary;
    
    public double getCoefficientSalary() {
        return coefficientSalary;
    }
    
    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
     
    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        EmpID = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        EmpName = scanner.nextLine();
        System.out.print("Enter Date of Birth: ");
        LocalDate EmpDateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter Start Date: ");
        LocalDate StartDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter Coefficient Salary: ");
        coefficientSalary = scanner.nextDouble();
    }
    
    @Override
    public void Output() {
        System.out.println("Full-time Employee ID: " + EmpID);
        System.out.println("Full-time Employee Name: " + EmpName);
        System.out.println("Date of Birth: " + EmpDateOfBirth);
        System.out.println("Start Date: " + StartDate);
        System.out.println("Coefficient Salary: " + coefficientSalary);
        System.out.println("Salary: " + CalculateSalary());
        System.out.println("Allowance: " + CalculateAllowance());
    }
    
    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficientSalary + CalculateAllowance();
    }
    
    @Override
     public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        } else {
            return 0;
        }
    }

    void Input() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

