import java.util.Scanner;

class OddSum {
    int n;
    int sum;

    // Parameterized Constructor
    OddSum(int n) {
        this.n = n;
    }

    // Method to calculate sum of odd numbers
    void calculate() {
        sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
    }

    // Method to display result
    void display() {
        System.out.println("Sum of Odd Numbers from 1 to " + n + " = " + sum);
    }
}

public class OddSumMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Create object
        OddSum obj = new OddSum(n);

        // Calculate and display
        obj.calculate();
        obj.display();

        sc.close();
    }
}