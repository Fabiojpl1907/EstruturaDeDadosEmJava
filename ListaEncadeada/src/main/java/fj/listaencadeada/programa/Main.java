package fj.listaencadeada.programa;

import fj.listaencadeada.classes.ListaEncadeada;

public class Main {

    public static void main(String[] args) {

        // instanciar a lista encadeada
        ListaEncadeada<String> primeiraLista = new ListaEncadeada<>();

        // popular a fila
        primeiraLista.add("Elemento 1");
        primeiraLista.add("Elemento 2");
        primeiraLista.add("Elemento 3");
        primeiraLista.add("Elemento 4");

        System.out.println(primeiraLista.get(0));
        System.out.println(primeiraLista.get(1));
        System.out.println(primeiraLista.get(2));
        System.out.println(primeiraLista.get(3));

        System.out.println(primeiraLista);

        System.out.println(primeiraLista.remove(2));
        System.out.println(primeiraLista);

        System.out.println(primeiraLista.get(5));







// final classe main
    }
}
