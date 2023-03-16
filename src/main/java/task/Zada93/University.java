package task.Zada93;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
      /*  Student student = newStudent();
        addNewStudend(student);*/
        Student student1 = new Student("Maciej", "Kaczmarczyk", "Index");
        Student student12 = new Student("Maciej", "Kaczmarczyk", "Index");
        Student student13 = new Student("Maciej", "Kaczmarczyk", "Index");
        Student student14 = new Student("Maciej", "Kaczmarczyk", "Index");
        System.out.println(Student.getNumberStudents());
    }
    static Scanner sc = new Scanner(System.in);

    public static int size = 0;

    public static Student newStudent(){
        System.out.println("Podaj imie");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = sc.nextLine();
        System.out.println("Podaj index");
        String index = sc.nextLine();
        /*size++;
        System.out.println("Liczna studentów");*/
        return new Student(firstName, lastName, index);
    }

    public static void addNewStudend(Student student){
        size++;
        System.out.println("Ilość studentów " + size);
    }
}
