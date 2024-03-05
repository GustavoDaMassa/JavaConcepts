import java.util.Scanner;
import java.util.regex.Pattern;

public class d_Tokens_e_Delimitadores {
    public static void main(String[] args) {
        String text = "Gustavo, Thiago, Isabela, Jão Guilherme, Ana Clara, Anderson";
        String delimitadores = ",";
        String[] nomes = text.split(delimitadores);
        for (String nome : nomes) {
            // System.out.println(nome.trim());
        }

        String texto = "Gustavo-20, Thiago-20, Isabela-20, Jão Guilherme-19, Ana Clara-20, Anderson-19";
        Scanner scanner = new Scanner(texto);
        delimitadores = "[,-\\.]";
        Pattern pattern = Pattern.compile(delimitadores);
        scanner.useDelimiter(pattern);

        int i = 0;
        while (scanner.hasNext()) {

            if (!scanner.hasNextInt()) {
                System.out.println(scanner.next().trim());
            } else {
                i += scanner.nextInt();
                System.out.println(i);
            }
        }
        System.out.println("Total de idades:" + i);

    }

}
