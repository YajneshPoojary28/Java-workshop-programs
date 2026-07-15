import java.util.Scanner;

class NumberInWords {
    String number;

    // Parameterized Constructor
    NumberInWords(String number) {
        this.number = number;
    }

    // Method to display digits in words
    void displayWords() {

        System.out.print("Number in Words: ");

        for (int i = 0; i < number.length(); i++) {

            switch (number.charAt(i)) {

                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
        System.out.println();
    }
}

public class NumberInWordsMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String num = sc.nextLine();

        // Create object
        NumberInWords obj = new NumberInWords(num);

        // Display number in words
        obj.displayWords();

        sc.close();
    }
}