import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class a_PathsFiles {
    public static void main(String[] args) throws IOException {

        Path pasta = Paths.get("C:\\Java\\JavaConcepts", "Arquivos/subpasta/dhsuahdu");
        // Path pasta = Paths.get("Arquivos"); -- como padrão cria no mesmo local em que
        // se está trabalhando

        if (Files.notExists(pasta)) {
            System.out.println("---------");
            try { // files.createDiretory- caso já exista a pasta lança uma excessão
                Path diretório = Files.createDirectory(pasta);
                // files.createDiretory- lança uma excessão pois não consegue criar subpastas
                // diretamente;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                Path subpasta = Files.createDirectories(pasta);// não lança excessões
            }
        }

        Path subpasta = Files.createDirectories(pasta);// não lança excessões caso já exista

        Path file = Paths.get(subpasta.getParent().getParent().toString(), "file.txt");
        if (Files.notExists(file)) {
            Path nioarq = Files.createFile(file);
            System.out.println("------");
        }
        // ----------------------------- parent para ser criado na mesma pasta
        Files.copy(file, Paths.get(pasta.toString(), "arqcopiado"),
                StandardCopyOption.REPLACE_EXISTING);
    }
}
