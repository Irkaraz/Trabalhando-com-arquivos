import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula03_BlocoTryWithResources {
    public static void main(String[] args) {
        String path = "c:\\Windows\\Temp\\in.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

