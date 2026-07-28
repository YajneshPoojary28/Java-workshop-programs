class MultipleOfSeven {

    // Method to find required multiples
    void findMultiples() {

        int count = 0;
        int number = 7;

        while (count < 4) {

            if (number % 2 == 1 &&
                number % 3 == 1 &&
                number % 4 == 1 &&
                number % 5 == 1 &&
                number % 6 == 1) {

                count++;

                if (count == 1)
                    System.out.println("1st Multiple = " + number);
                else if (count == 2)
                    System.out.println("2nd Multiple = " + number);
                else if (count == 4)
                    System.out.println("4th Multiple = " + number);
            }

            number += 7;
        }
    }
}

public class MultipleOfSevenMain {

    public static void main(String[] args) {

        // Create object
        MultipleOfSeven obj = new MultipleOfSeven();

        // Find and display multiples
        obj.findMultiples();
    }
}