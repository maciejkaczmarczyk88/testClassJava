package task.Zada11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CompanyApp {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Cannot create fill");
            }
        }

        if (fileExists) {
            System.out.println("File " + fileName + " exsist or cannot create");
        }

        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
        ) {
            Company company = new Company();
            Employee employee = company.newEmployee();
            writer.write(employee.getFirstName());
            writer.write(", ");
            writer.write(employee.getLastName());
            writer.write(", ");
            writer.write((int) employee.getSalary());
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }

    }
}
