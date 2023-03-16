package task.Zada5;

public class Bank {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("Maciej", "Kaczmarczyk", "88110410294", 5000.00);
        Adres adres = new Adres("Kasprzaka", 31, 504, "Warsow", "00-000");
        Adres adres1 = new Adres("Apsi", 01, 22, "Poznań", "11-111");

        String maciej = bankAccount.toString();
        String adresWarszawa = adres.toString();
        String adresPoznan = adres1.toString();

        System.out.println(maciej + "Maciej mieszka pod adresem " + adresPoznan);
        System.out.println(maciej + "Maciej ma mieszkanie w " + adresWarszawa);


    }

}
