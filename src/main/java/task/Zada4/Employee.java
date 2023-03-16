package task.Zada4;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private int longWork;

    public Employee(String name, String lastName, int age, int longWork) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.longWork = longWork;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLongWork() {
        return longWork;
    }

    public void setLongWork(int longWork) {
        this.longWork = longWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", longWork=" + longWork +
                '}';
    }
}
