import java.util.Scanner;

class MatrixTranspose {

    int matrix[][];
    int rows, cols;

    // Parameterized Constructor
    MatrixTranspose(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    // Method to accept matrix elements
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display original matrix
    void display() {
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display transpose
    void transpose() {
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}

public class MatrixTransposeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int cols = sc.nextInt();

        // Create Object
        MatrixTranspose obj = new MatrixTranspose(rows, cols);

        obj.accept();
        obj.display();
        obj.transpose();

        sc.close();
    }
}