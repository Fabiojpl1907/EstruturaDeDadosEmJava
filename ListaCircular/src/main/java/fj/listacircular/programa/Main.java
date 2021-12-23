package fj.listacircular.programa;

import fj.listacircular.classes.ListaCircular;

public class Main {

    public static void main(String args[]){

        ListaCircular<String> ListaCircular1 = new ListaCircular<>();

        ListaCircular1.add("c0");
        System.out.println(ListaCircular1);

        ListaCircular1.remove(0);
        System.out.println(ListaCircular1);

        ListaCircular1.add("c1");
        System.out.println(ListaCircular1);

        ListaCircular1.add("c2");
        ListaCircular1.add("c3");
        System.out.println(ListaCircular1);

        // em lista circular
        // sera rodade a lista considertando o indice dada / tamanho da lista
        System.out.println(ListaCircular1.get(7));
        System.out.println(ListaCircular1.get(323));

        // Percorrer a lista circular
        // da cauda para cabeça
        // ate completar 20 elemnentos
        System.out.println("---------------------------------");
        for( int i = 0 ; i < 21; i++ ){
            System.out.println(ListaCircular1.get(i));
        }

    }

}
