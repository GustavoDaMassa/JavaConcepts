package Throwable.CODE_Throwable.Exceptions;

import java.io.File;
import java.io.IOException;

public class d_throwsExceptionChecked {
    public static void main(String[] args) {
        try {

            criarArquivo();
            criarArq();
        } catch (IOException e) {
            // aq pode ser tratado a exception ou lançada pra outro metodo que tenha a
            // chamado, como é a main o ideal é ser tratada");
            e.printStackTrace();
            System.out.println(" Não foi possivel criar o arquivo, path invalido");
        }
    }

    // como todos podem acessar os métodos públicos, deixar para que decidam como
    // desejam tratar a exceção é uma boa opção
    public static void criarArquivo() throws IOException {
        File file = new File("Aquivos\\arqtesteCheckedExceptions.txt"); // path errado pra forçar ioexception (Arquivo
                                                                        // é o certo)
        boolean arqCriado = file.createNewFile();
        System.out.println(arqCriado);
    }

    private static void criarArq() throws IOException {
        File file = new File("Aquivos\\arqtesteCheckedExceptions.txt"); // path errado pra forçar ioexception
        try { // exception sendo tratada e também relançada para o metodo antecessor para que
              // ele decida como deseja prosseguir
            boolean arqCriado = file.createNewFile();
            System.out.println(arqCriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
