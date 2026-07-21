import java.util.Scanner;

class SwapNumbers {
    int a, b;

    // Parameterized Constructor
    SwapNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to display numbers
    void display() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    // Method to swap numbers
    void swap() {
        int temp = a;
        a = b;
        b = temp;
    }
}

public class SwapNumbersMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        SwapNumbers obj = new SwapNumbers(x, y);

        System.out.println("\nBefore Swapping:");
        obj.display();

        obj.swap();

        System.out.println("\nAfter Swapping:");
        obj.display();

        sc.close();
    }
}