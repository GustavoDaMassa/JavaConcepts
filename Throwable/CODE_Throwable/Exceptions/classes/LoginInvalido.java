package Throwable.CODE_Throwable.Exceptions.classes;
// ---->>> Utilizada em f_CustomizadaException

// Para fazer uma Exception Customizada basta que a classe estenda a classe
// Exception

public class LoginInvalido extends Exception {
    // login
    public LoginInvalido() {
        super("Senha Incorreta!");
    }

    public LoginInvalido(String mensagem) {
        super(mensagem);
    }

}