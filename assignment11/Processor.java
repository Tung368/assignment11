package assignment11;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EMP_LIST employeeList = new EMP_LIST();
         while (true) {
            System.out.println(" Employee Management System");
            System.out.println("1. Add New Employee");
            System.out.println("2. Update Employee Information");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select Employee Type to Add:");
                    System.out.println("1. Full-time Employee");
                    System.out.println("2. Part-time Employee");
                    System.out.print("Your choice: ");
                    int empType = scanner.nextInt();
                    scanner.nextLine();
                    if (empType == 1) {
                        EMP_FULLTIME fullTimeEmployee = new EMP_FULLTIME() {};
                        fullTimeEmployee.Input();
                        employeeList.AddNew(fullTimeEmployee);
                        System.out.println("Full-time employee added successfully!");
                    } else if (empType == 2) {
                        EMP_PARTTIME partTimeEmployee = new EMP_PARTTIME() {};
                        partTimeEmployee.Input();
                        employeeList.AddNew(partTimeEmployee);
                        System.out.println("Part-time employee added successfully!");
                    } else {
                        System.out.println("Invalid employee type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Update: ");
                    scanner.nextLine();
                    String updateID = scanner.nextLine();
                    employeeList.Update(updateID);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Delete: ");
                    scanner.nextLine(); 
                    String deleteID = scanner.nextLine();
                    employeeList.Delete(deleteID);
                    System.out.println("Employee deleted successfully!");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Find: ");
                    scanner.nextLine(); 
                    String findID = scanner.nextLine();
                    EMPLOYEE foundEmployee = employeeList.Find(findID);
                    if (foundEmployee != null) {
                        foundEmployee.Output();
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 5:
                    System.out.println("Displaying All Employees:");
                    employeeList.DisplayAll();
                    break;

                case 6:
                    System.out.println("Exiting the program");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
                    