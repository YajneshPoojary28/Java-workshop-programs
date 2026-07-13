import java.util.Scanner;

class Billing {

    double grandTotal = 0;

    // Method to calculate bill
    void calculateBill() {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter Item Code: ");
            int code = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Item Description: ");
            String description = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            double itemTotal = qty * price;

            System.out.println("Item Total = " + itemTotal);

            grandTotal += itemTotal;

            System.out.print("Do you want to add another item (y/n)? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        if (grandTotal > 10000) {
            grandTotal = grandTotal - (grandTotal * 10 / 100);
        }

        sc.nextLine();

        System.out.print("Payment Mode (Cash/Card): ");
        String payment = sc.nextLine();

        if (grandTotal < 1000 && payment.equalsIgnoreCase("Card")) {
            grandTotal = grandTotal + (grandTotal * 2.5 / 100);
        }

        System.out.println("\nFinal Grand Total = Rs. " + grandTotal);

        sc.close();
    }
}

public class BillingMain {

    public static void main(String[] args) {

        Billing obj = new Billing();

        obj.calculateBill();
    }
}