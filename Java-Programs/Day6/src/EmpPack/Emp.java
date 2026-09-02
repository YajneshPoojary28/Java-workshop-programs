package EmpPack;

public abstract class Emp {
    int empID;
    String empName;
    double empSal;
    String empDesig;

    protected Emp(int empID, String empName, double empSal, String empDesig) {
        this.empID = empID;
        this.empName = empName;
        this.empSal = empSal;
        this.empDesig = empDesig;
    }

    public void display() {
        System.out.println("EmpID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSal);
        System.out.println("Designation: " + empDesig);
    }
}
