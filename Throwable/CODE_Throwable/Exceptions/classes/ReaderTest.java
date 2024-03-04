package Throwable.CODE_Throwable.Exceptions.classes;

import java.io.Closeable;
import java.io.IOException;

public class ReaderTest implements Closeable {
    public void close() throws IOException {
        System.out.println("fechando teste 1");
    }
}
