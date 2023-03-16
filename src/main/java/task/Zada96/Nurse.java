package task.Zada96;

public class Nurse extends PersonOne{
    private int overtime;

    public Nurse(String firstName, String lastName, double salary, int overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime=" + overtime +
                "} " + super.toString();
    }
}
