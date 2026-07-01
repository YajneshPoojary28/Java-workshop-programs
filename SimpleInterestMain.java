import java.util.Scanner;

class SimpleInterest {
    double principal;
    double rate;
    double time;

    // Parameterized Constructor
    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Method to calculate and display Simple Interest
    void calculateSI() {
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }
}

public class SimpleInterestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        // Create object
        SimpleInterest obj = new SimpleInterest(p, r, t);

        // Call method
        obj.calculateSI();

        sc.close();
    }
}