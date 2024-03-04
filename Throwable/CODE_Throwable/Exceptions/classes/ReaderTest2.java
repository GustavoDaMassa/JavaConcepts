package Throwable.CODE_Throwable.Exceptions.classes;

import java.io.Closeable;
import java.io.IOException;
// --->>> utilizada em ec_TryWithResources 

public class ReaderTest2 implements Closeable {
    public void close() throws IOException {
        System.out.println("fechando teste 2");
    }
}
