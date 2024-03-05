# Classes Utilitárias 
Esse tema se trata sobre tópicos mais específicos da linguagem Java, que serão aplicados em futuros assuntos e que possibilitam diversas formas de desenvolvimento de códigos e os otimizam. 

---
 ## Wrappers 

 - É a transformação dos tipos primitivos em objetos (boxing). Atravez das conhecidas classes wrappers que possibilitam a passagem de valores via referencias e diversos métodos, como exemplo UpperCase, LowerCase, entre muito outros que podem e devem ser explorados.

## Strings 

- No Java para as strings é criado dentro do Heap de memoria um espaço separado conhecido como String constant pool que utiliza o conceito de String interning que impede de que haja a duplicação de strings ja existentes ou seja elas são imutáveis. Quando é  feito essa tentativa ele apenas cria uma referência para a mesma string. Da mesma formas para os wrappers há diversos metodos a serem explorados.
## StringBuilder 
- Strings são excelentes para a representação de problemas reais no entando quando escalamos muito o número de strings com que trabalhamos a sua performace consome muito mémoria e deixa o nosso programa um pouco lento, buscando resolver esse problema o java implementou as StringBuilders e StringBuffers( pro caso de Threads) que obtem uma performace muito mais rápida 
- A principal diferença é que não é aplicado a imutabilidade de strings, assim sendo é possivel trabalhar com eles alterando diretamente o conteúdo das StringBuilders e não só a sua referência, ocupando menos espaços de memória, a StringBuilder só é de fato transformada em uma string quando se acessa seu conteudo como por exemplo com o método toString(); 
- Possui métodos diferentes das strings que funcionam de formas também diferentes, as vezes de maneira mais complexas e é nescessaário atenção ao funcionameto e tipo de retorno de cada método.  
---
##  internalização

  Há muitas outras classes utilitárias em java introduzidas desde as primeiras versões que ajudam o programador a trabalhar com problemas do mundo real. no entando muitas já possuem métodos depravados que podem em breve sair do escolpo do java. 

  - #### Date 
    - Representa a data com um long;
    - Pode ser utilizado o método toString para representar melhor a data atual;
    - É nescessário ter cuidado para importar a classe do pacote certo.
  - #### Calendar 
    - É uma classe abstrata portanto não se pode inicializa-la com new; 
    - Possui um retorno mais complexo doque a classe Date;
    - É possível obter os dias da semanas e do mês.
  - #### DateFormat
    - Assim como na classe Calendar, é baseado no idioma da maquina em que a jvm está rodando;
    - Posssui 6 tipos diferentes de formatação para se trabalhar com datas;
  - #### Locale
    - Essa classe possibilita fazer a internalização com diversos países atravez da ISO de cada país sendo possível traduzir a aplicação para diversos idiomas;
    - É possível internalizar também números e moedas.
  - #### SimpleDateFormat
    - Oferece um pouco mais de flexibilidade ao fazer a formatação de datas de acordo com um padrão de símbolos definidos.
## Java.time/util
Há algumas classes que atualmente já estão depressiadas no java e outras mais atuais que possuem métodos otimizados e indicados para serem trabalhados como exemplo as classes do pacote Java.time: 
 - ####  LocalDate 
   -   específica para datas;
- #### LocalTime
  -  específica para horas;
- #### LocalDateTime
  -  junção das duas;
- ####  Instant
  -  trabalha com nanosegundos e zulu (UTC) time;
- #### ...
  - **Duration**;
  - **Period**;
  - **ChronoUnit**;
  - **TemporalAdjusters**;
  - **ZonedDateTime**;
  - **ZoneId**;
  - **OffsetDateTime**;
  - **DateTimeFormatter**;
  - **ResourceBundle**.
  
---
## Expressões Regulares - regex 

  - As expressões regulares têm como objeto encontrar padrões dentro de um arquivo ou texto atravez de metacaracteres;
  - Funciona atravez de pattern e matcher , padrão e busca respectivamente; 
- MetaCaracteres:
  - **\d** -  todos os dígitos;
  - **\D** - tudo oque não for dígito;
  - **\s** - espaços em branco , \t \n \f \r; 
  - **\S** - todos os caracteres menos os espaços em branco;
  - **\w** - a-zA-Z, dígitos e o _ ;
  - **\W** - tudo que não é incluso no \w.
- Range:
  - **[ abc ]** - Irá procurar por cada caracter dentro dos conchetes separadamente( "a" ou "b" ou "c"); 
- Quantificadores:
  - **?** - zero ou uma ocorrência;
  - **\*** - zero ou mais ocorrência; 
  - **+** - uma ou mais ocorrência;
  - **{n,m}** - de n até m ; 
  - **( )** - agrupamento;
  - **|** - clausula ou , exemplo: o(v|c)o -> ovo | oco;  
  - **$** - fim da linha; 
  - **.** - ponto é um caracter coringa.
  - **^** - pode ser utilizado pra encontrar oq deseja no começo da linha ou dentro do [ ] como negação.
  - [site para estudos sobre regex](https://regexr.com/).
___