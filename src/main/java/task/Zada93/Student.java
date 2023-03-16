package task.Zada93;

public class Student {
    private static int numberStudents;
    private String firstName;
    private String lastName;
    private String numberIndex;

    public String getFirstName() {
        return firstName;
    }

    public static int getNumberStudents() {
        return numberStudents;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberIndex() {
        return numberIndex;
    }

    public void setNumberIndex(String numberIndex) {
        this.numberIndex = numberIndex;
    }

    public Student(String firstName, String lastName, String numberIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberIndex = numberIndex;
        numberStudents++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberIndex='" + numberIndex + '\'' +
                '}';
    }


}
