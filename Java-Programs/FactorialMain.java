import java.util.Scanner;

class Factorial {
    int number;
    long fact = 1;

    // Parameterized Constructor
    Factorial(int number) {
        this.number = number;
    }

    // Method to calculate factorial
    void calculate() {

        if (number < 0) {
            System.out.println("Factorial of a negative number is not possible.");
        } else if (number == 0) {
            fact = 1;
            System.out.println("Factorial = " + fact);
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}

public class FactorialMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        Factorial obj = new Factorial(n);

        // Calculate factorial
        obj.calculate();

        sc.close();
    }
}