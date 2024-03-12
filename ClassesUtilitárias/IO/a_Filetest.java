import java.io.File;
import java.io.IOException;

public class a_Filetest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            Boolean criado = file.createNewFile();// criar , se já existir não sobreescreve;
            System.out.println(criado);
            System.out.println(file.getAbsolutePath());// obter caminho inteiro
            System.out.println(file.getPath());
            System.out.println(file.isDirectory());// saber se um diretório;
            System.out.println(file.isFile());// saber se é arquivo
            Boolean exist = file.exists();
            if (exist) {
                file.delete();// deletar
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
