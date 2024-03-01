# Throwable 

Existem dois tipos: Errors e exceptions 
ambos fazem parte da classe throwable

---

## Errors 

Erros geralmente não são recuperáveis em tempo de execução , é nescessário reescrever o código.
Nesses casos a JVM para a execução.

Exemplo: 
- StackOverflowError 
- OutOffMemoryError
- etc...

## Exceptions 

#### Checked :
Exceptions do tipo checked (checadas) são filhas diretas da classe Exceptions e quando ocorrem interrompem a compilação e sem o tratamento não será possível finalizar essa compilação, ex: IOException ( input and output exception).

#### Unchecked : 
Exceções Unchecked (não checadas) se encaixam como **RunTimeExceptions** e ocorrem em tempo de execução , o código chega a ser compilado mas ocorrem exceções em sua maioria por erros de desenvolvimento ou de uso, como tentar realizar ações para variáveis com a tipologia não compatível ou acessar determinada posição inexistente em um array.
Existem inúmeras exceções filhas de RunTimeExceptions. 

--- 
##### Throws-lançando exceptions 
Para fazer o tratamento das exceptions Unchecked pode-se lançar ( throws new ) as possíveis exceptions que poderão ocorrer para que seja tratado em metodos recorrentes de forma que não se faz nescessário a interrupção do codigo e ainda assim haja a descrição do problema.
