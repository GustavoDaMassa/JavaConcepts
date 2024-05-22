
# Generics

Genéricos em linguagens de programação, incluindo Java, referem-se a uma forma de escrever código de maneira genérica, o que significa que pode funcionar com vários tipos em vez de um único tipo específico. Os genéricos permitem que você escreva classes e métodos que podem operar em qualquer tipo de dados, ao mesmo tempo que fornecem segurança de tipo em tempo de compilação.

## wildcard

O conceito de wildcard(curinga), diz respeito a quando se deseja usar classes mais genericas ou até mesmo quando não se sabe qual tipo de elemento uma lista deve aceitar. a 3 forma de fazer isso:

- Unbounded Wildcard:
  usado quando você não se importa com o tipo dos elementos.
  exemplo da sintaxe.
    
    ```
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
    ```
- Upper Bounded Wildcard: 
    usado quando você deseja trabalhar com um tipo específico ou seus subtipos.
    Dessa forma sera permitido apenas elementos que extendem certa classe já definida. 

    ```
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
    ```

- Lower Bounded wildcard: usado quando você deseja trabalhar com um tipo específico ou seus supertipos.

    ```
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
    ```

## Parâmetro de tipo: List< T >

- Os genéricos são normalmente definidos usando parâmetros de tipo entre colchetes angulares ( <e >). Por exemplo, List< T > onde T é um parâmetro de tipo que representa o tipo de elementos na lista.
- Podemos passar tanto T para tipos, E para elementos, K para keys e V para valores, quando nao definidos.
'