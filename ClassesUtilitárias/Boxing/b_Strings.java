import java.lang.String;

public class b_Strings {
    public static void main(String[] args) {
        // string constant pool
        String nome = "gustavo";
        String nome2 = "gustavo";
        nome.concat("henrique");// existe o nome gustavo henrique no pool de strings porém a referencia de nome
                                // ainda aponta para gustavo

        System.out.println(nome == nome2);

        String nome3 = new String("gustavo");// nesse caso nome3 faz referenia para um objeto e ele sim faz referencia
                                             // pra o gustavo já existente no pool de strings
        System.out.println(nome == nome3); // false
        System.out.println(nome == nome3.intern()); // true
    }
}
