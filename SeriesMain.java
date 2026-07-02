import java.util.Scanner;

class Series {

    int n;

    // Parameterized Constructor
    Series(int n) {
        this.n = n;
    }

    // (a) 4,16,36,64,...
    void series1() {
        System.out.println("\nSeries 1:");
        for (int i = 1; i <= n; i++) {
            int x = 2 * i;
            System.out.print((x * x) + " ");
        }
        System.out.println();
    }

    // (b) 1,-2,3,-4,5,-6,...
    void series2() {
        System.out.println("\nSeries 2:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // (c) 1,4,27,256,3125,...
    void series3() {
        System.out.println("\nSeries 3:");
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(i, i) + " ");
        }
        System.out.println();
    }

    // (d) 1,4,7,12,23,42,77,...
    void series4() {
        System.out.println("\nSeries 4:");

        int term = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");

            if (i % 2 == 1)
                term = term * 2 + 2;
            else
                term = term * 2 - 1;
        }

        System.out.println();
    }

    // (e) 1,4,9,25,36,49,81,100,...
    void series5() {
        System.out.println("\nSeries 5:");

        int count = 0;
        int i = 1;

        while (count < n) {
            if (i % 4 != 0) {
                System.out.print((i * i) + " ");
                count++;
            }
            i++;
        }

        System.out.println();
    }

    // (f) 1,5,13,25,41,61,...
    void series6() {
        System.out.println("\nSeries 6:");

        for (int i = 1; i <= n; i++) {
            int term = (2 * i * i) - (2 * i) + 1;
            System.out.print(term + " ");
        }

        System.out.println();
    }
}

public class SeriesMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        Series obj = new Series(n);

        obj.series1();
        obj.series2();
        obj.series3();
        obj.series4();
        obj.series5();
        obj.series6();

        sc.close();
    }
}