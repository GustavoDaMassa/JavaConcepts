import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b_Metacaracteres {
    public static void main(String[] args) {

        // \d - todos os dígitos;
        // \D - tudo oque não for dígito;
        // \s - espaços em branco , \t \n \f \r;
        // \S - todos os caracteres menos os espaços em branco;
        // \w - a-zA-Z, dígitos e o _ ;
        // \W - tudo que não é incluso no \w.
        // [ abc ] - Irá procurar por cada caracter dentro dos conchetes separadamente(
        // "a" ou "b" ou "c");
        // ? - zero ou uma ocorrência;
        // * - zero ou mais ocorrência;
        // + - uma ou mais ocorrência;
        // {n,m} - de n até m ;
        // ( ) - agrupamento;
        // | - clausula ou , exemplo: o(v|c)o -> ovo | oco;
        // $ - fim da linha;
        // . - ponto é um caracter coringa.

        String regex = "0[xX]([\\da-fA-F])+(\\s|$)"; // procurando números hexadecimais
        String text = "12 0x 0X 0XFBADF 0x10Z 0x0"; // 0xFFA representa numeros hexadeciamis em Java

        Pattern pattern = Pattern.compile(regex); // compilar
        Matcher matcher = pattern.matcher(text); // procurar um macth dentro do texto

        while (matcher.find()) { // ele continuará procurando apartir da proxima posição
            System.out.println(matcher.start() + " " + matcher.group()); // as posiçoes iniciais em que ele encontrou
        } // lala lalala
          // 1 | 6 |

    }
}
