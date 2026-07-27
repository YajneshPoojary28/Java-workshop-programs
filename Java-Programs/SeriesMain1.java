import java.util.Scanner;

class Series {
    int n;

    // Parameterized Constructor
    Series(int n) {
        this.n = n;
    }

    // (a) 1, -2, 6, -15, 31, -56, ...
    void series1() {
        System.out.println("\nSeries 1:");

        for (int i = 1; i <= n; i++) {
            int term = (i * i * i) - (i - 1);

            if (i % 2 == 0)
                System.out.print(-term + " ");
            else
                System.out.print(term + " ");
        }

        System.out.println();
    }

    // (b) 1, 1, 2, 3, 5, 8, 13, ...
    void series2() {
        System.out.println("\nSeries 2:");

        int a = 1, b = 1;

        if (n >= 1)
            System.out.print(a + " ");

        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();
    }

    // (c) 1, -2, 4, -6, 7, -10, 10, -14, ...
    void series3() {
        System.out.println("\nSeries 3:");

        int term = 1;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0)
                System.out.print(-term + " ");
            else
                System.out.print(term + " ");

            if (i % 2 == 1)
                term += 1;
            else
                term += 3;
        }

        System.out.println();
    }

    // (d) 1, 5, 8, 14, 27, 49, ...
    void series4() {
        System.out.println("\nSeries 4:");

        int term = 1;
        int inc = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term + inc;
            inc = inc + i;
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

        sc.close();
    }
}