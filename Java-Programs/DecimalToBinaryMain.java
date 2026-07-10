import java.util.Scanner;

class DecimalToBinary {
    int decimal;
    String binary = "";

    // Parameterized Constructor
    DecimalToBinary(int decimal) {
        this.decimal = decimal;
    }

    // Method to convert decimal to binary
    void convert() {

        if (decimal == 0) {
            binary = "0";
            return;
        }

        int temp = decimal;

        while (temp > 0) {
            int remainder = temp % 2;
            binary = remainder + binary;
            temp = temp / 2;
        }
    }

    // Method to display result
    void display() {
        System.out.println("Decimal Number = " + decimal);
        System.out.println("Binary Number  = " + binary);
    }
}

public class DecimalToBinaryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        // Create object
        DecimalToBinary obj = new DecimalToBinary(num);

        // Convert and display
        obj.convert();
        obj.display();

        sc.close();
    }
}