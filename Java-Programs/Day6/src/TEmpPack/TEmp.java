package TEmpPack;

import EmpPack.Emp;

public class TEmp extends Emp {
    private int duration;

    public TEmp(int empID, String empName, double empSal, String empDesig, int duration) {
        super(empID, empName, empSal, empDesig);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Duration: " + duration + " months");
    }
}
