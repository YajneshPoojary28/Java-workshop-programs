import java.util.Scanner;

class BinarySearch {
    int arr[];
    int n;

    // Parameterized Constructor
    BinarySearch(int n) {
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

    // Method to sort array (Ascending Order)
    void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method for Binary Search
    void search(int key) {
        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = true;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
}

public class BinarySearchMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        BinarySearch obj = new BinarySearch(n);

        obj.accept();
        obj.display();

        obj.sort();

        System.out.print("Enter Number to Search: ");
        int key = sc.nextInt();

        obj.search(key);

        sc.close();
    }
}