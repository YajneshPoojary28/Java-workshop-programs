import java.util.Scanner;

class ReverseString {
    String str;
    String reverse = "";

    // Parameterized Constructor
    ReverseString(String str) {
        this.str = str;
    }

    // Method to reverse the string
    void reverseString() {
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
    }

    // Method to display result
    void display() {
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse);
    }
}

public class ReverseStringMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Create object
        ReverseString obj = new ReverseString(str);

        // Reverse and display
        obj.reverseString();
        obj.display();

        sc.close();
    }
}