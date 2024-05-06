import java.io.*;

public class Aula04_FileWriterAndBufferWriter {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\Windows\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //, true add mais no arquivo
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
