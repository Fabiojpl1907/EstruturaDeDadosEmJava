package fj.estruturadedados.implementacoes;

import fj.estruturadedados.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class EqualsHashCode {

    public static void main(String[] args) {

       // criar uma lista de objetos carros
       List<Carro> listaCarros = new ArrayList<>();

       // adicionar objetos carros na lista
        listaCarros.add( new Carro("Ford"));
        listaCarros.add( new Carro("GM"));
        listaCarros.add( new Carro("Audi"));

        // verificar se há objeto carro de determinada marca na lista
        // usa equals e hascode
        System.out.println( listaCarros.contains(new Carro("Ford")));

        // ver o hashcode do objeto carro de marca Ford
        System.out.println( new Carro("Ford").hashCode());

        // criando objetos carros

        Carro carro1 = new Carro("Audi");
        Carro carro2 = new Carro("Porsche");

        // comparandoos 2 carros a patir do equals
        // que usa a marca
        System.out.println( "Carro1 = Carro2 ? : " + carro1.equals(carro2));


// criando objetos carros

        Carro carro3 = new Carro("Renault");
        Carro carro4 = new Carro("Renault");

        // comparandoos 2 carros a patir do equals
        // que usa a marca
        System.out.println( "Carro3 = Carro4 ? : " +  carro3.equals(carro4));


    }
}
