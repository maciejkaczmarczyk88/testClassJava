package task.Zada92.task;

import java.util.Scanner;

public class HospitalAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;

        int option = -1;

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case addPatient -> {
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextLine());
                    hospital.addPatient(patient);
                }
                case printPatients -> hospital.printPatients();
                case exit -> System.out.println("Zamykam program!");
                default -> System.out.println("Nie znaleziono takiej opcji");
            }
        }

        sc.close();
    }
}
