import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_RegexEmail {
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

        // String regex = "([a-zA-Z\\.-_])+@([a-zA-Z])+\\.([a-z])+(\\.([a-z])+)*";
        String regex = "([a-zA-Z\\.-_])+@([a-zA-Z])+(\\.([a-z])+)+";
        String emails = " gustavo.pereira@discente.ufg., 3gustavohenrique3gb@gmail.com.br.jp, gustavohen?@r9r.com , gustavo.pereira@gmail.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
