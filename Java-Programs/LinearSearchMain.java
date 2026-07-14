import java.util.Scanner;

class LinearSearch {
    int[] arr;
    int n;

    // Parameterized Constructor
    LinearSearch(int n) {
        this.n = n;
        arr = new int[n];
    }

    // Method to accept array elements
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to display array
    void display() {
        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to perform linear search
    void search(int key) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
}

public class LinearSearchMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        LinearSearch obj = new LinearSearch(n);

        obj.accept();
        obj.display();

        System.out.print("Enter Number to Search: ");
        int key = sc.nextInt();

        obj.search(key);

        sc.close();
    }
}