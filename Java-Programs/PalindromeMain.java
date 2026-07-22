import java.util.Scanner;

class Palindrome {
    String str;
    String reverse = "";

    // Parameterized Constructor
    Palindrome(String str) {
        this.str = str;
    }

    // Method to check palindrome
    void checkPalindrome() {

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse))
            System.out.println("The String is a Palindrome.");
        else
            System.out.println("The String is Not a Palindrome.");
    }
}

public class PalindromeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Create object
        Palindrome obj = new Palindrome(str);

        // Check palindrome
        obj.checkPalindrome();

        sc.close();
    }
}