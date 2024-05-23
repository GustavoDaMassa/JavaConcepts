package Arquivos;

public class contador {
    public static void main(String[] args) {
        for (int i = 0; i < 286; i++) {
            if (i + 1 < 201) {
                System.out.print((i + 1) + ")");
                System.out.println(" - done");
            } else
                System.out.println(i + 1 + ") - ");
        }
    }
}