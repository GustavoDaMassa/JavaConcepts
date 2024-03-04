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
- Pode-se lançar exceptions personalizadas de acordo com os requisitos da sua aplicação;

- Para fazer o tratamento das exceptions Unchecked pode-se lançar ( throws new ) para que haja a descrição do problema, não nescessariamente deve-se fazer o tratamento pois o condigo ainda continuará rodando

- Diferentemente das Unchecked as exception checked deve ter o tratamento adequado em todos os casos, ele pode ser feito nos metodos mais internos ou pelos metodos que realizaram a chamada. é possivel também tratar a exception e ainda assim lança-la para o método recorrente para que seja aplicada uma regra de negócio.   
- Ao fazer a sobrescritas de métodos que lançam exceções pode-se reescrever as exceçoes e trata-las ou não. E também pode-se adicionar novas exceções desde que não sejam mais genéricas do que as da superclasse.