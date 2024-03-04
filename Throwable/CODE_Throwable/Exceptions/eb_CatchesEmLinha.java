package Throwable.CODE_Throwable.Exceptions;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

public class g_CatchesEmLinha {

    // Os Catches em linha também é uma opção para quando não se sabe qual a
    // exception específica porém não podem conter exception que fazer parte da
    // mesma linha de herança

    public static void main(String[] args) {
        try {
            throw new RuntimeException("unchecked");
        } catch (IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException é subclasse dessa
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace(); // as exceptions mais genéricas sempre devem estar no final;
        }

        try {
            checked(); // nao poderia ter I0Exception
        } catch (FileNotFoundException | FileLockInterruptionException e) { // podem ser tratadas com um exception mais
                                                                            // genérica
            e.printStackTrace();
        }

    }

    private static void checked() throws FileNotFoundException, FileLockInterruptionException {

    }
}
