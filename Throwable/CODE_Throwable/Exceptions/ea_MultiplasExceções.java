package Throwable.CODE_Throwable.Exceptions;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

public class ea_MultiplasExceções {

    // quando não se sabe qual a exceção específica que poderá ser retornada é
    // possível usar multiplos catch
    public static void main(String[] args) {
        try {
            throw new RuntimeException("unchecked");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace(); // as exceptions mais genéricas sempre devem estar no final;
        }

        try {
            checked();
        } catch (Exception e) { // podem ser tratadas com um exception mais genérica
            e.printStackTrace();
        }

    }

    private static void checked() throws FileNotFoundException, FileLockInterruptionException {

    }
}
