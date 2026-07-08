import java.util.Scanner;

class ReverseNumber {
    int number;
    int reverse;

    // Parameterized Constructor
    ReverseNumber(int number) {
        this.number = number;
        reverse = 0;
    }

    // Method to find reverse
    void calculate() {
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
    }

    // Method to display reverse
    void display() {
        System.out.println("Original Number = " + number);
        System.out.println("Reverse Number = " + reverse);
    }
}

public class ReverseNumberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        ReverseNumber obj = new ReverseNumber(n);

        // Calculate and display
        obj.calculate();
        obj.display();

        sc.close();
    }
}