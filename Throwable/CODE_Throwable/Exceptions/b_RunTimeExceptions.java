package Throwable.CODE_Throwable.Exceptions;

public class b_RunTimeExceptions {
    public static void main(String[] args) {

        Object object = null;
        try { // do tipo unckecked nao é obrigatório o tratamento da exceção
            System.out.println(object.toString()); // teremos uma NullPointerException
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        int[] numeros = { 1, 2 };
        System.out.println(numeros[9]); // ArrayIndexOutOfBoundsException
    }
}
