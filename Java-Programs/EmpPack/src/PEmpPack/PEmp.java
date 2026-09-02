package PEmpPack;

import EmpPack.Emp;

public class PEmp extends Emp {
    private int hra;

    public PEmp(int empID, String empName, double empSal, String empDesig, int hra) {
        super(empID, empName, empSal, empDesig);
        this.hra = hra;
    }

    public int getHRA() {
        return hra;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("HRA: " + hra);
    }
}
