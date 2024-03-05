package ClassesUtilitárias;

public class Wrappers {

    public static void main(String[] args) {

        // tipos primitivos
        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 20L;
        float floatp = 30F;
        double doublep = 10D;
        char charp = 'w';
        boolean booleanp = false;

        // objetos
        Byte bytew = 127; // maximo permitido é 127 pois 128 vira um inteiro.
        Short shortw = 1;
        Integer intw = 1; // boxing
        Long longw = 20L; // na linha de herança para a regra de polimofismo um valor Integer nao é um
                          // long , valido aos demais
        Float floatw = 30F;
        Double doublew = 10D;
        Character charw = 'w';
        Boolean booleanw = false;
    }

}
