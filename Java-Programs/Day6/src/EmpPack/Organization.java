package EmpPack;

import java.util.Scanner;
import PEmpPack.PEmp;
import TEmpPack.TEmp;

public class Organization {
    Emp[] employees;
    int empCount;

    public Organization() {
        employees = new Emp[5];
        empCount = 0;
    }

    // Main menu loop
    public void runMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        char cont;

        do {
            System.out.println("Menu:");
            System.out.println("1) Add Employee");
            System.out.println("2) Display Employees");
            System.out.println("3) Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    AddEmployee();
                    break;
                case 2:
                    DisplayDetails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; // exit the loop
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            cont = sc.next().charAt(0);

        } while (cont == 'y' || cont == 'Y');
    }

    // Add employees with repeat option
    public void AddEmployee() {
        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            if (empCount >= employees.length) {
                System.out.println("No more registrations allowed.");
                return;
            }

            System.out.println("Add Employee: 1) Permanent  2) Temporary");
            int choice = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();
            System.out.println("Enter Designation:");
            String desig = sc.next();

            if (choice == 1) {
                System.out.println("Enter HRA:");
                int hra = sc.nextInt();
                employees[empCount++] = new PEmp(IDGenerator.getID(), name, 3000, desig, hra);
            } else if (choice == 2) {
                System.out.println("Enter Duration (months):");
                int duration = sc.nextInt();
                employees[empCount++] = new TEmp(IDGenerator.getID(), name, 2000, desig, duration);
            }

            System.out.print("Do you want to add another employee? (yes/no): ");
            cont = sc.next();

        } while (cont.equalsIgnoreCase("yes"));
    }

    // Display employees with repeat option
    public void DisplayDetails() {
        if (empCount == 0) {
            System.out.println("No employees registered.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            System.out.println("Display: 1) All  2) Permanent Only  3) Temporary Only");
            int choice = sc.nextInt();

            for (int i = 0; i < empCount; i++) {
                if (choice == 1) {
                    employees[i].display();
                } else if (choice == 2 && employees[i] instanceof PEmp) {
                    employees[i].display();
                } else if (choice == 3 && employees[i] instanceof TEmp) {
                    employees[i].display();
                }
                System.out.println("--------------------");
            }

            System.out.print("Do you want to display again? (yes/no): ");
            cont = sc.next();

        } while (cont.equalsIgnoreCase("yes"));
    }
}
