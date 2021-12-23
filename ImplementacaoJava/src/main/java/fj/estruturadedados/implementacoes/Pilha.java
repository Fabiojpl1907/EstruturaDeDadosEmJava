package fj.estruturadedados.implementacoes;

// implementar pilha - LIFO
// principais métodos
// push() / search() / pop() / peek() / empty()

import fj.estruturadedados.classes.Carro;

import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

    // iniciar uma pilha de Objetos carros
    Stack<Carro> pilhaCarros = new Stack<>();

    // adicionado carros na pilha
    pilhaCarros.push( new Carro("Ford"));
    pilhaCarros.push( new Carro("Pegeout"));
    pilhaCarros.push( new Carro("Citroen"));

    System.out.println(pilhaCarros);

    // tirar objeto do topo da pilha
    pilhaCarros.pop();
    System.out.println(pilhaCarros);

    // pegar  objeto do topo da pilha
    System.out.println( "Topo Pilha : " +  pilhaCarros.peek());

    // pilha vazia ?
    System.out.println("Pilha Vazia ? : " + pilhaCarros.empty());


    }
}
