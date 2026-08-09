import java.util.Scanner;

class Project {
    double vendorHours, vendorRate;
    double hardwareCost, softwareCost;
    double consultantHours, consultantRate;
    String softwareType, clientHardware;

    double revenue, expense, consultantCost, profitLoss;

    // Parameterized Constructor
    Project(double vendorHours, double vendorRate,
            double hardwareCost, double softwareCost,
            String softwareType, String clientHardware,
            double consultantHours, double consultantRate) {

        this.vendorHours = vendorHours;
        this.vendorRate = vendorRate;
        this.hardwareCost = hardwareCost;
        this.softwareCost = softwareCost;
        this.softwareType = softwareType;
        this.clientHardware = clientHardware;
        this.consultantHours = consultantHours;
        this.consultantRate = consultantRate;
    }

    // Method to calculate profit/loss
    void calculate() {

        revenue = vendorHours * vendorRate;

        if (clientHardware.equalsIgnoreCase("Yes"))
            revenue += hardwareCost * 0.30;

        if (softwareType.equalsIgnoreCase("Common"))
            revenue += softwareCost * 0.50;
        else
            revenue += softwareCost;

        consultantCost = consultantHours * consultantRate;

        expense = hardwareCost + softwareCost + consultantCost;

        profitLoss = revenue - expense;
    }

    // Method to display result
    void display() {

        System.out.println("\nRevenue : $" + revenue);
        System.out.println("Expense : $" + expense);

        if (profitLoss > 0)
            System.out.println("Profit  : $" + profitLoss);
        else if (profitLoss < 0)
            System.out.println("Loss    : $" + Math.abs(profitLoss));
        else
            System.out.println("No Profit No Loss");
    }
}

public class ProjectProfitMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vendor Hours: ");
        double vendorHours = sc.nextDouble();

        System.out.print("Enter Vendor Rate per Hour: ");
        double vendorRate = sc.nextDouble();

        System.out.print("Enter Hardware Cost: ");
        double hardwareCost = sc.nextDouble();

        System.out.print("Enter Software Cost: ");
        double softwareCost = sc.nextDouble();

        sc.nextLine();

        System.out.print("Software Type (Common/Proprietary): ");
        String softwareType = sc.nextLine();

        System.out.print("Client Bears Hardware Cost? (Yes/No): ");
        String clientHardware = sc.nextLine();

        System.out.print("Enter Consultant Hours: ");
        double consultantHours = sc.nextDouble();

        System.out.print("Enter Consultant Rate per Hour: ");
        double consultantRate = sc.nextDouble();

        // Create object
        Project obj = new Project(vendorHours, vendorRate,
                hardwareCost, softwareCost,
                softwareType, clientHardware,
                consultantHours, consultantRate);

        obj.calculate();
        obj.display();

        sc.close();
    }
}