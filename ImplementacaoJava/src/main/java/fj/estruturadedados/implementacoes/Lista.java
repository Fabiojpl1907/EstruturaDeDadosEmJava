package fj.estruturadedados.implementacoes;

// implntação de List

import fj.estruturadedados.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        // criar uma lista de objetos carros
        List<Carro> listaCarro = new ArrayList<>();

        // adicionar objetos carros na lista
        listaCarro.add( new Carro("Ford"));
        listaCarro.add( new Carro("Ferrari"));
        listaCarro.add( new Carro("Lamborghini"));
        listaCarro.add( new Carro("RollsRoyce"));

        System.out.println( listaCarro);

        System.out.println( "Existe o carro ? : "+ listaCarro.contains(new Carro("Fiat")));


        // retorna objeto em determinado indice
        System.out.println( "Carro no indice é : " + listaCarro.get(2));

        // retorna objeto em determnado indice
        // se não encontra retorna -1
        System.out.println( "Indice do carro é : " + listaCarro.indexOf(new Carro("Ford")));

        // remover  objeto em determnado indice
        System.out.println( "Carro a remover : "+ listaCarro.remove(2));
        System.out.println( listaCarro);









    }
}
