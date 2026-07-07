import java.util.Scanner;

class EvenOdd {
    int number;

    // Parameterized Constructor
    EvenOdd(int number) {
        this.number = number;
    }

    // Method to check even or odd
    void checkNumber() {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number.");
        } else {
            System.out.println(number + " is an Odd Number.");
        }
    }
}

public class EvenOddMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        EvenOdd obj = new EvenOdd(n);

        // Call method
        obj.checkNumber();

        sc.close();
    }
}