import java.util.Scanner;

class LargestNumber {
    int a, b, c;
    int largest, secondLargest;

    // Parameterized Constructor
    LargestNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to find largest and second largest
    void findLargest() {
        if (a >= b && a >= c) {
            largest = a;
            secondLargest = (b >= c) ? b : c;
        } else if (b >= a && b >= c) {
            largest = b;
            secondLargest = (a >= c) ? a : c;
        } else {
            largest = c;
            secondLargest = (a >= b) ? a : b;
        }
    }

    // Method to display result
    void display() {
        System.out.println("Largest Number = " + largest);
        System.out.println("Second Largest Number = " + secondLargest);
    }
}

public class LargestNumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Create object
        LargestNumber obj = new LargestNumber(a, b, c);

        // Find and display result
        obj.findLargest();
        obj.display();

        sc.close();
    }
}