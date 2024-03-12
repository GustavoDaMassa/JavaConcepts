import java.io.File;
import java.io.IOException;

public class f_Diretorio {
    public static void main(String[] args) throws IOException {

        File pasta = new File("C:\\Java\\JavaConcepts\\Arquivos");
        pasta.mkdir();// diretório criado

        // o diretório e o nome do novo arquivo desejado
        File arqdiretorio = new File(pasta, "arqdiretório");
        arqdiretorio.createNewFile();
        File rename = new File(pasta, "arqrenomeado");
        arqdiretorio.renameTo(rename);

    }
}
