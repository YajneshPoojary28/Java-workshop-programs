import java.util.Scanner;

class BinaryToDecimal {
    int binary;
    int decimal = 0;

    // Parameterized Constructor
    BinaryToDecimal(int binary) {
        this.binary = binary;
    }

    // Method to convert binary to decimal
    void convert() {

        int temp = binary;
        int power = 0;

        while (temp > 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            temp /= 10;
        }
    }

    // Method to display result
    void display() {
        System.out.println("Binary Number  = " + binary);
        System.out.println("Decimal Number = " + decimal);
    }
}

public class BinaryToDecimalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        // Create object
        BinaryToDecimal obj = new BinaryToDecimal(binary);

        // Convert and display
        obj.convert();
        obj.display();

        sc.close();
    }
}