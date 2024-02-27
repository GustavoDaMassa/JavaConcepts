package exceptionsCODE;

public class Errors {

    // StackOverFlowError
    // (quando estoura a memória em chamadas de um mesmo método)

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();// sem condiçao de parada;
    }
}