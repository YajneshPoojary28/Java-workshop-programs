import java.util.Scanner;

class FractionValue {
    double number;
    int whole;
    double fraction;

    // Parameterized Constructor
    FractionValue(double number) {
        this.number = number;
    }

    // Method to separate whole and fractional parts
    void separate() {
        whole = (int) number;
        fraction = number - whole;

        System.out.println("Whole Value = " + whole);
        System.out.println("Fractional Value = " + fraction);
    }
}

public class FractionValueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double n = sc.nextDouble();

        // Create object
        FractionValue obj = new FractionValue(n);

        // Call method
        obj.separate();

        sc.close();
    }
}