package Throwable.CODE_Throwable.Exceptions;

import java.io.File;
import java.io.IOException;

// e ==> Explorando os recursos dos diversos tipos de  TryCatch -----------------------------------

public class e_BlocoFinally {
    // o Bloco finally sempre vai ser executado e pode ser usado para evitar
    // problemas a longo prazo na aplicação.
    public static void main(String[] args) {
        File file = new File("Arquivos\\Blocofinally.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.delete();
        }
    }
}
