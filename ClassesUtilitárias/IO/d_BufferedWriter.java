import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class d_BufferedWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\JavaConcepts\\Arquivos\\file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fileWriter)) {
            // encapsulando uma FileWriter no BufferWriter
            bw.write("Escrevendo pela BUfferWriter");
            bw.newLine();
            bw.write("pulando linha");
            bw.flush();// ainda nescessário o flush do buffer

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
