package fj.estruturadedados.implementacoes;

// implementar um conjunto ( Set )

import fj.estruturadedados.classes.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {

        // criar um conjunto de carro
        Set<Carro> conjuntoCarros = new HashSet<>();

        conjuntoCarros.add( new Carro("Ford"));
        conjuntoCarros.add( new Carro("Ferrari"));
        conjuntoCarros.add( new Carro("Lamborghini"));
        conjuntoCarros.add( new Carro("RollsRoyce"));
        conjuntoCarros.add( new Carro("Alfa Romeo"));
        conjuntoCarros.add( new Carro("Zip"));

        // set não preserva a ordem de inserção
        System.out.println( "\n Conjunto  de Carros -> " + conjuntoCarros);

        // criar uma arvore de carros
        // dentro a regra colocda em compareTo()
        Set<Carro> arvoreCarros = new TreeSet<>();

        arvoreCarros.add( new Carro("Ford"));
        arvoreCarros.add( new Carro("Ferrari"));
        arvoreCarros.add( new Carro("Lamborghini"));
        arvoreCarros.add( new Carro("RollsRoyce"));
        arvoreCarros.add( new Carro("Alfa Romeo"));
        arvoreCarros.add( new Carro("Zip"));

        System.out.println("\n Arvore de Carros -> " +  arvoreCarros);


    }
}
