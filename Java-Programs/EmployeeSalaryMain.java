import java.util.Scanner;

class Employee {
    String name;
    int empId;
    double basic, allowance, bonusPercent, monthlyInvestment;
    double grossMonthlySalary, annualSalary, bonus;
    double grossAnnualSalary, annualInvestment;
    double taxableIncome, tax, netAnnualSalary;

    // Parameterized Constructor
    Employee(String name, int empId, double basic,
             double allowance, double bonusPercent,
             double monthlyInvestment) {

        this.name = name;
        this.empId = empId;
        this.basic = basic;
        this.allowance = allowance;
        this.bonusPercent = bonusPercent;
        this.monthlyInvestment = monthlyInvestment;
    }

    // Method to calculate salary
    void calculate() {

        grossMonthlySalary = basic + allowance;
        annualSalary = grossMonthlySalary * 12;

        bonus = (annualSalary * bonusPercent) / 100;
        grossAnnualSalary = annualSalary + bonus;

        annualInvestment = monthlyInvestment * 12;

        // Maximum exemption allowed = 1,00,000
        if (annualInvestment > 100000)
            annualInvestment = 100000;

        taxableIncome = grossAnnualSalary - annualInvestment;

        if (taxableIncome <= 100000)
            tax = 0;
        else if (taxableIncome <= 150000)
            tax = taxableIncome * 0.20;
        else
            tax = taxableIncome * 0.30;

        netAnnualSalary = grossAnnualSalary - tax;
    }

    // Method to display details
    void display() {
        System.out.println("\nEmployee Name      : " + name);
        System.out.println("Employee ID        : " + empId);
        System.out.println("Annual Gross Salary: " + grossAnnualSalary);
        System.out.println("Tax Payable        : " + tax);
        System.out.println("Annual Net Salary  : " + netAnnualSalary);
    }
}

public class EmployeeSalaryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Special Allowance: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter Bonus Percentage: ");
        double bonusPercent = sc.nextDouble();

        System.out.print("Enter Monthly Tax Saving Investment: ");
        double investment = sc.nextDouble();

        // Create object
        Employee emp = new Employee(name, empId, basic,
                                    allowance, bonusPercent,
                                    investment);

        emp.calculate();
        emp.display();

        sc.close();
    }
}