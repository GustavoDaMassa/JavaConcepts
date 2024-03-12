import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class b_FileWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\JavaConcepts\\Arquivos\\file.txt"); // nescessário duas contrabarras no path
        try (FileWriter fileWriter = new FileWriter(file, true)) {// booleano para fazer append no arquivo
            fileWriter.write("Arquivo de teste para o tema IO \n _______________ \n");// Escrevendo no arquivo
            fileWriter.flush();// garantindo que não tem nçao restando no buffer antes de fechar;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
