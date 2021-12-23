package fj.estruturadedados.classes;

import java.util.Objects;
// para poder criar arvores de carro é necesario
// implementar comparable

public class Carro implements Comparable<Carro>{

    // construtor


    public Carro(String marca) {
        this.marca = marca;
    }

    // atributo
    String marca;

    // get e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // equals & hashcode

    @Override
    // se dois carros são iguais
    // considerando a marca
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    // retona um hash
    // que ira auxiliar em acoes de organizações
    public int hashCode() {
        return Objects.hash(marca);
    }

    // toString

    @Override
    public String toString() {
        return "Carro{ " +
                "marca ='" + marca + '\'' +
                '}';
    }

    // definindo que um carro é maior que outro
    // pelo tamanho da string da marca
/*    @Override
    public int compareTo(Carro o) {
        // definindo que um carro é maior que outro
        // pelo tamanho da string da marca
        if( this.marca.length() <  o.marca.length() ) {
            return -1;
        } else if( this.marca.length() >  o.marca.length() ) {
            return 1;
        }
        return 0;
    }*/

    // definindo que um carro é maior que outro
    // por ordem alfabética

    @Override
    public int compareTo(Carro o) {
        // aqui usamos o compaaTo da class String
        return this.getMarca().compareTo(o.getMarca());
    }

}
