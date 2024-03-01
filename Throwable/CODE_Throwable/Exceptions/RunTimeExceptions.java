package Throwable.CODE_Throwable.Exceptions;

public class RunTimeExceptions {
    public static void main(String[] args) {

        Object object = null;
        System.out.println(object.toString()); // teremos uma NullPointerException

        int[] numeros = { 1, 2 };
        System.out.println(numeros[9]); // ArrayIndexOutOfBoundsException
    }
}
