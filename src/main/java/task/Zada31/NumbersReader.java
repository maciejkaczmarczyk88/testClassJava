package task.Zada31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {
        String file = "testFile.txt";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger d = new BigInteger(br.readLine());
            BigInteger e = new BigInteger(br.readLine());
            System.out.println(a + b + c + " sum numbers");
            System.out.println(d.add(e) + " sum numbers");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
