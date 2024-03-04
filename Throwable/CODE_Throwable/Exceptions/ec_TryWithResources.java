package Throwable.CODE_Throwable.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import Throwable.CODE_Throwable.Exceptions.classes.ReaderTest2;
import Throwable.CODE_Throwable.Exceptions.classes.ReaderTest;

public class h_TryWithResources {
    public static void main(String[] args) {
        ReadArquivos();
    }

    public static void ReadArquivos() {

        // Como argumento no Try_resource as variaveis de referencia precisam
        // obrigatoriamente implementar as classes CLOSEABLE ou AUTOCLOSEABLE

        try ( // => Reader reader = new BufferedReader(new
              // FileReader("TryWithResources.txt"));
                ReaderTest test1 = new ReaderTest();
                ReaderTest2 test2 = new ReaderTest2();) {
            // Com esse Try_resource o próprio Java se encarregará de fechar os recursos,
            // isso é feito usando o conceito de last in first out
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // o TRY WITH RESOURCE é uma alternativa para o codigo abaixo
    public static void ReadArq() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("TryWithResources.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
