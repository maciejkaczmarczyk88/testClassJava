package task.Zada8;

public class PrintService {
    public static void main(String[] args) {

        Client client = new Client(null, "Kaczmarczyk");
        Client client2 = new Client("Maciej", "Kaczmarczyk");
        Client client3 = new Client("Maciej", null);


        if (client.getFirstName() == null && client.getLastName() != null){
            System.out.println(client.toString());
        }
        if (client.getLastName() == null){
            System.out.println(client.toString());
        }
        if (client.getLastName() ==null && client.getFirstName() == null){
            System.out.println("Witaj nieznajomy");
        }


    }
}
