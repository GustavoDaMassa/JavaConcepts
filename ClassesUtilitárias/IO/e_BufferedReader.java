import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class e_BufferedReader {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\JavaConcepts\\Arquivos\\file.txt"); // nescessário duas contrabarras no path
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {
            String linhas;
            while ((linhas = br.readLine()) != null) {
                System.out.println(linhas);// não é nescessário o casting para char;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
