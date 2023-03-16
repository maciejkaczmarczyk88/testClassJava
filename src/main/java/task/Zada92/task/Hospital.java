package task.Zada92.task;


public class Hospital {
    private int MAX_NUMBER = 10;
    private Patient[] patients = new Patient[MAX_NUMBER];
    private int temperary;



    public void addPatient(Patient patient){
        if (temperary < MAX_NUMBER) {
            patients[temperary] = patient;
            temperary++;
        }
        else
            System.out.println("Brak miejsca");

    }

    public void printPatients(){
        for (Patient patient : patients) {
            System.out.println(patient.getFirstName() + " " + patient.getLastName() + " " + patient.getPesel());
        }
    }
}
