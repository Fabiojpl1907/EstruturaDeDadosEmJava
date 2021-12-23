package pilha.b.operarpilha;


// implementando um estrutur de dados dinamica
// pode ser armazena infintos elementos
// basta dar push
// encadaer dados em memoria

import pilha.a.implantacaopilha.NoPilha;
import pilha.a.implantacaopilha.Pilha;

public class MainPilha {

    public static void main(String[] args) {

        Pilha firstPilha = new Pilha();

        // inserir nós na pilha
        // a pilha aceita um objeto nó , com dados do tipo integer
        firstPilha.Push(new NoPilha(1));
        firstPilha.Push(new NoPilha(2));
        firstPilha.Push(new NoPilha(3));
        firstPilha.Push(new NoPilha(4));
        firstPilha.Push(new NoPilha(5));
        firstPilha.Push(new NoPilha(6));

        // apresentar a pilha
        System.out.println(firstPilha);

        // apresentar topo da pilha
        System.out.println(firstPilha.TOP());
        System.out.println(firstPilha);

        // tirar  topo da pilha
        System.out.println(firstPilha.POP());
        System.out.println(firstPilha);

        // inserir novo  topo da pilha
        firstPilha.Push(new NoPilha(21));
        System.out.println(firstPilha);


    }
}
