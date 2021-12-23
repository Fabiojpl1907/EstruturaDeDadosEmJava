package fila.b.operarfila;

import fila.a.implantacaofila.Fila;

public class MainFila {

    public static void main(String[] args) {

        // instacia uma Fila
        Fila primeiraFila = new Fila();

        // enfilera 4 nós
        // versão 1
        /* primeiraFila.enqueue(new NoFila( "Primeiro"));
        primeiraFila.enqueue(new NoFila( "Segundo"));
        primeiraFila.enqueue(new NoFila( "Terceiro"));
        primeiraFila.enqueue(new NoFila( "Quarto"));*/

        // versão 2
        // refatorado para receber objeto
        primeiraFila.enqueue("Primeiro");
        primeiraFila.enqueue("Segundo");
        primeiraFila.enqueue("Terceiro");
        primeiraFila.enqueue("Quarto");

        // Ver a fila na tela
        System.out.println(primeiraFila);


        // Ver a primeiro nó
        System.out.println(primeiraFila.first());

        // retirar o primeiro nó
        System.out.println(primeiraFila.dequeue());
        System.out.println(primeiraFila);

        // enfilera novo  nó
        primeiraFila.enqueue("Quinto");
        System.out.println(primeiraFila);


// encerra classe e psvm
    }
}
