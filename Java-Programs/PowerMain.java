import java.util.Scanner;

class Power {
    int x, n;
    long result;

    // Parameterized Constructor
    Power(int x, int n) {
        this.x = x;
        this.n = n;
        result = 1;
    }

    // Method to calculate x^n
    void calculate() {
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
    }

    // Method to display result
    void display() {
        System.out.println(x + " raised to the power " + n + " = " + result);
    }
}

public class PowerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        // Create object
        Power obj = new Power(x, n);

        // Calculate and display
        obj.calculate();
        obj.display();

        sc.close();
    }
}