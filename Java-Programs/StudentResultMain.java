import java.util.Scanner;

class Student {
    String name;
    int m1, m2, m3;
    int total;
    double average;

    // Parameterized Constructor
    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to calculate total and average
    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;
    }

    // Method to display result
    void display() {
        System.out.println("\nStudent Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);

        if (average >= 60)
            System.out.println("Result       : First Class");
        else if (average >= 50)
            System.out.println("Result       : Second Class");
        else if (average >= 35)
            System.out.println("Result       : Pass Class");
        else
            System.out.println("Result       : Fail");
    }
}

public class StudentResultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        // Create object
        Student obj = new Student(name, m1, m2, m3);

        // Calculate and display result
        obj.calculate();
        obj.display();

        sc.close();
    }
}