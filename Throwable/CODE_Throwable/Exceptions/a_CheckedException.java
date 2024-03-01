package Throwable.CODE_Throwable.Exceptions;

import java.io.File;
import java.io.IOException;

public class a_CheckedException {
    public static void main(String[] args) {
        criarArq();
    }

    public static void criarArq() {
        File file = new File("Aquivos\\arqtesteCheckedExceptions.txt"); // nome da pasta errado para forçar exceção
        // o bloco TRY/CATCH é uma ferramento do java para tratamento de possíveis
        // exceptions
        try {
            boolean arqCriado = file.createNewFile(); // caso ocorra alguma exceção pula para o catch
            System.out.println(arqCriado);

        } catch (IOException e) { // Pode ser passada tanto a Exception mais generica quanto as subclasses (quanto
                                  // mais específico mais facil o tratamento)
            e.printStackTrace();
        }
    }
}
