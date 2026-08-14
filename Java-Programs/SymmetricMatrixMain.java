import java.util.Scanner;

class SymmetricMatrix {

    int matrix[][];
    int n;

    // Parameterized Constructor
    SymmetricMatrix(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    // Method to accept matrix elements
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    void display() {
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to check symmetric matrix
    void checkSymmetric() {

        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }

            }
        }

        if (symmetric)
            System.out.println("\nIt is a Symmetric Matrix.");
        else
            System.out.println("\nIt is Not a Symmetric Matrix.");
    }
}

public class SymmetricMatrixMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order of Matrix: ");
        int n = sc.nextInt();

        // Create Object
        SymmetricMatrix obj = new SymmetricMatrix(n);

        obj.accept();
        obj.display();
        obj.checkSymmetric();

        sc.close();
    }
}