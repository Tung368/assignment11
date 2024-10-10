package assignment11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {
     private ArrayList<EMPLOYEE> list = new ArrayList<>();
      public void AddNew(EMPLOYEE emp) {
        list.add(emp);
    }
    public void Update(String empID) {
        for (EMPLOYEE emp : list) {
            if (emp.getEmpID().equals(empID)) {
                emp.Input();
                return;
            }
        }
        System.out.println("Employee not found!");
    }
    public void Delete(String empID) {
        list.removeIf(emp -> emp.getEmpID().equals(empID));
    }
    public EMPLOYEE Find(String empID) {
        for (EMPLOYEE emp : list) {
            if (emp.getEmpID().equals(empID)) {
                return emp;
            }
        }
        return null;
    }
    public void DisplayAll() {
        for (EMPLOYEE emp : list) {
            emp.Output();
        }
    }
     public void Menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employee");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Full-time Employee");
                    System.out.println("2. Part-time Employee");
                    System.out.print("Choose type: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();  
                    if (type == 1) {
                        EMP_FULLTIME ft = new EMP_FULLTIME() {};
                        ft.Input();
                        AddNew(ft);
                    } else if (type == 2) {
                        EMP_PARTTIME pt = new EMP_PARTTIME() {};
                        pt.Input();
                        AddNew(pt);
                    }
                    break;
                case 2:
                    System.out.print("Employee ID to Update: ");
                    scanner.nextLine();
                    String updateID = scanner.nextLine();
                    Update(updateID);
                    break;
                case 3:
                    System.out.print("Employee ID to Delete: ");
                    scanner.nextLine();
                    String deleteID = scanner.nextLine();
                    Delete(deleteID);
                    break;
                case 4:
                    System.out.print("Employee ID to Find: ");
                    scanner.nextLine();
                    String findID = scanner.nextLine();
                    EMPLOYEE emp = Find(findID);
                    if (emp != null) {
                        emp.Output();
                        } else {
                        System.out.println("Employee not found!");
                    }
                    break;
                case 5:
                    DisplayAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}