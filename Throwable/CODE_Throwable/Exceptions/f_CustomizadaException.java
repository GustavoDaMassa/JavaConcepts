package Throwable.CODE_Throwable.Exceptions;

import Throwable.CODE_Throwable.Exceptions.classes.LoginInvalido;

public class f_CustomizadaException {

    public static void main(String[] args) {
        try {
            logar("errada");
        } catch (LoginInvalido e) {
            e.printStackTrace();
        } finally {
            try {
                logar("correta");
            } catch (LoginInvalido e) {
                e.printStackTrace();
            }
        }
    }

    // Para fazer uma Exception Customizada basta que a classe estenda a classe
    // Exception no caso a LoginInvalido .
    private static void logar(String senha) throws LoginInvalido {
        String senhacorreta = "correta";
        if (!senhacorreta.equals(senha)) {
            throw new LoginInvalido();
        } else {
            System.out.println("Login efetuado com sucesso!");
        }
    }

}
