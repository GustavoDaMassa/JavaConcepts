public class StringBuilders {
    public static void main(String[] args) {
        String nome = "Gustavo"; // pool de string
        nome.concat(" Henrique"); // existe nome-> "Gustavo" e "Henrique" e "Gustavo Henrique"

        System.out.println(nome); // Gustavo

        StringBuilder name = new StringBuilder("Gustavo"); // pode ser passado como parametro tanto a string como a
                                                           // capacitade, por padrão ela inicia com 16caracter
        name.append(" Henrique"); // São métodos diferentes e nescessario tomar cuido com o tipo de retorno
        System.out.println(name); // exite agora apenas Gustavo Henrique
    }
}
