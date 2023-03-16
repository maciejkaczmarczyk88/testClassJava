package task.Zada96;

public class HospitalApp {
    public static void main(String[] args) {
    Hospital hospital = new Hospital();

    hospital.addNewPerson(new Doctor("Maciej", "Kaczmarczyk", 4000,5000));

    hospital.addNewPerson(new Doctor("Maciek", "Prefeska", 7500, 1300));
    hospital.addNewPerson(new Nurse("Ania", "Dobroszewska", 2200, 6));
    hospital.addNewPerson(new Nurse("Marta", "Danielska", 2100, 3));

    hospital.printPerson();
    }
}
