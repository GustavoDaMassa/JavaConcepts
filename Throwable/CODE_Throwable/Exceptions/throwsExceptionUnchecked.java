package Throwable.CODE_Throwable.Exceptions;

public class throwsExceptionUnchecked { // exceptions que são subclasses de RunTimeException
    public static void main(String[] args) {
        try { // tratamento
            divisao(1, 0);
        } catch (RuntimeException e) { // caso se saiba qual o tipo de exceptions, pode coloca-la ou uma superclasse
                                       // mais genérica
            e.printStackTrace();
        }
        System.out.println("codigo ainda em andamento"); // codigo ainda continua sendo compilado
    }

    private static int divisao(int numerador, int denominador) {

        if (denominador == 0) {
            throw new IllegalArgumentException("o denominador nao pode ser 0"); // Sempre bom usar as exceçoes mais
                                                                                // específicas
        }

        return numerador / denominador;
    }
}