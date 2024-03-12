import java.io.File;
import java.io.FileReader;

public class c_FileReader {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\JavaConcepts\\Arquivos\\file.txt"); // nescessário duas contrabarras no path
        try (FileReader fr = new FileReader(file)) {
            int letras;
            while ((letras = fr.read()) != -1) {
                System.out.print((char) letras);// casting para char;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
