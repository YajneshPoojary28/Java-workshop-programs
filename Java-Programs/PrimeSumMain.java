import java.util.Scanner;

class PrimeSum {
    int n, m;
    int sum = 0;

    // Parameterized Constructor
    PrimeSum(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // Method to find and display prime numbers
    void calculate() {

        System.out.println("Prime Numbers:");

        for (int i = n; i <= m; i++) {

            boolean prime = true;

            if (i < 2)
                prime = false;
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println();
    }

    // Method to display sum
    void display() {
        System.out.println("Sum of Prime Numbers = " + sum);
    }
}

public class PrimeSumMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int n = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int m = sc.nextInt();

        // Create object
        PrimeSum obj = new PrimeSum(n, m);

        // Calculate and display
        obj.calculate();
        obj.display();

        sc.close();
    }
}