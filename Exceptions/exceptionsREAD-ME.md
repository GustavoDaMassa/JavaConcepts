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

##### Checked :
    Exceptions do tipo checked (checadas) são filhas diretas da classe Exceptions e quando ocorrem interrompem a compilação e sem o tratamento não será possível finalizar essa compilação, ex: IOException ( input and output exception).

##### Unchecked : 
    excessões Unchecked (não checadas) se encaixam como **RunTimeExceptions** e ocorrem em tempo de execução , o código chega a ser compilado mas ocorrem excessões em sua maioria por erros de desenvolvimento, como tentar realizar ações para variáveis com a tipologia não compatível ou acessar determinada posição inexistente em um array.
    Existem inúmeras excessões filhas de RunTimeExceptions. 

