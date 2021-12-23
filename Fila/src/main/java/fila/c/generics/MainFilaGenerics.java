package fila.c.generics;

public class MainFilaGenerics {

    public static void main(String[] args) {

        // instacia uma Fila
        Fila<String> primeiraFila = new Fila<>();

        primeiraFila.enqueue("G_Primeiro");
        primeiraFila.enqueue("G_Segundo");
        primeiraFila.enqueue("G_Terceiro");
        primeiraFila.enqueue("G_Quarto");

        // Ver a fila na tela
        System.out.println(primeiraFila);


        // Ver a primeiro nó
        System.out.println(primeiraFila.first());

        // retirar o primeiro nó
        System.out.println(primeiraFila.dequeue());
        System.out.println(primeiraFila);

        // enfilera novo  nó
        primeiraFila.enqueue("G_Quinto");
        System.out.println(primeiraFila);


    }
}
