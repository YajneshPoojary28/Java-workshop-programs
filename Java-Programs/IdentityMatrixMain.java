import java.util.Scanner;

class IdentityMatrix {

    int matrix[][];
    int n;

    // Parameterized Constructor
    IdentityMatrix(int n) {
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

    // Method to check identity matrix
    void checkIdentity() {

        boolean identity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    if (matrix[i][j] != 1)
                        identity = false;
                } else {
                    if (matrix[i][j] != 0)
                        identity = false;
                }
            }
        }

        if (identity)
            System.out.println("\nIt is an Identity Matrix.");
        else
            System.out.println("\nIt is Not an Identity Matrix.");
    }
}

public class IdentityMatrixMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order of Matrix: ");
        int n = sc.nextInt();

        // Create Object
        IdentityMatrix obj = new IdentityMatrix(n);

        obj.accept();
        obj.display();
        obj.checkIdentity();

        sc.close();
    }
}