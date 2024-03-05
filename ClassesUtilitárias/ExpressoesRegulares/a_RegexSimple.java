import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a_RegexSimple {
    public static void main(String[] args) {
        String regex = "ala";
        String text = "lala lalala";

        Pattern pattern = Pattern.compile(regex); // compilar
        Matcher matcher = pattern.matcher(text); // procurar um macth dentro do texto

        while (matcher.find()) { // as posiçoes iniciais em que ele encontrou
            System.out.println(matcher.start()); // ele continuará procurando apartir da proxima posição
        }

    }
}
