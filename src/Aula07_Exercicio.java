import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula07_Exercicio {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a File Path: ");
        String strPath = sc.nextLine();
        List<Aula07_ExercicioClasseProduct> products = getProducts(strPath);

        writeSummary(products);

        sc.close();
    }

    private static void writeSummary(List<Aula07_ExercicioClasseProduct> products) {
        new File("result").mkdir();

        String summaryPath = "result\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryPath))) {
            for (Aula07_ExercicioClasseProduct line : products) {
                bw.write(line.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Aula07_ExercicioClasseProduct> getProducts(String strPath) throws IOException {
        File file = new File(strPath);

        List<Aula07_ExercicioClasseProduct> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();

            while (line != null) {
                String[] data = line.split(",");

                String name = data[0];
                String priceStr = data[1];
                String quantityStr = data[2];
                double price = Double.parseDouble(priceStr);
                int quantity = Integer.parseInt(quantityStr);

                Aula07_ExercicioClasseProduct product = new Aula07_ExercicioClasseProduct(name, price, quantity);
                products.add(product);

                line = reader.readLine();
            }
        }
        return products;
    }
}


