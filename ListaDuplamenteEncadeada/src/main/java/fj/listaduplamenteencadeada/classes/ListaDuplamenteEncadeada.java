package fj.listaduplamenteencadeada.classes;

import java.security.NoSuchAlgorithmException;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    // construtor
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0 ;
    }

    //metodos

// size() - tamanho da lista ---------------------------------------------------

    public int size(){
        return this.tamanhoLista;
    }

// getNo() - colher Nó ---------------------------------------------------
// de uso interno e aproveitado em outros métodos

    private NoDuplo<T> getNo( int index ){

        // iniciar procura pelo primeiro nó e ir avançando
        // poderia tambem  iniciar pelo ultimo e ir regredindo
        NoDuplo<T> noAuxiliar = primeiroNo;

        // correr os nós da estrutura de dados
        // nó auxiliar sera null em caso de lista vazia, ou
        // se chegar  no ultimo nó ( caso indice seja maior que a lista )
        for( int i = 0 ; ( i < index ) && ( noAuxiliar != null); i++){
            noAuxiliar= noAuxiliar.getNoSucessor();
        }
        return noAuxiliar;
    } // final getNo

// get() - colher Nó e apresentar o conteudo do elemento da lista---------------------------------------------------

    public T get( int index ) {
        return  this.getNo(index).getConteudo();
    }


// add() - adicionar nó ao final da lista---------------------------------------------------

    public void add( T conteudo ){

        // no entrando na lista
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        // ajustar referencias de antecessor e de sucessor
        novoNo.setNoSucessor(null);

        // ultimoNo aponta inicialmnete ao ultimo no atual da lista
        // assim o novo nó passa a ter como antecessor , que era o ultimo
        novoNo.setNoAntecessor(ultimoNo);

        // lista esta vazia ?
        // estamos inserindo o primeiro nó da lista
        if( primeiroNo == null ){
            primeiroNo = novoNo;
        }

        if( ultimoNo != null ){
            ultimoNo.setNoSucessor(novoNo);
        }

        // nota : ser for o primeiro elemento da lista
        // o primero e ultimo nó serão o mesmo
        ultimoNo= novoNo;
        tamanhoLista++;
    }//final add

// add(index) - adicionar nó em qualquer ponta da lista ---------------------------------------------
// fazendo sobre carga do metodo add

    public void add( int index, T conteudo ){
        // registrando qual nó esta na posicao atual
        // na qual quero inserir o novo nó
        NoDuplo<T> noAuxiliar.getNo(index);

        // instanciar novo nó
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        // avisar ao novo nó que o atual nó existe na posição
        // passará a ser seu sucessor
        novoNo.setNoSucessor(NoAuxiliar );

        // sequencias de testes

        // novoNó não será o ultimo da lista
        if(novoNo.getNoSucessor() != null){
            // avisar ao novo nó que seu nó antecessor
            // sera o mesmo nó antecessor do atual ocupante do indice
            novoNo.setNoAntecessor( noAuxiliar.getNoAntecessor());

            // informar ao atual ocupante do indice que
            // que o novoNó passa a ocupar o indice e ser seu  antecessor
            novoNo.getNoSucessor().setNoAntecessor(novoNo);

            //  atual  [A] <=> [B]  <=>  [C]
            // inserir novo nó no indice 1
            // resultado [A] <=> [novoNó] <=> [B]  <=>  [C]
        } else {
            // se é null , significa que o novoNó
            // será inserido no fim da fila

            // avisa que o atual ultimo nó
            // será nó previo do novo nó
            novoNo.setNoAntecessor( ultimoNo);

            // e que o novo nó passa a ser o ultimo nó
            ultimoNo = novoNo;
        }

        // o Novo nó passara a ser o primeiro no da lista ?
        if( index == 0 ){
            // lembrando no nó auxilar ja havia sido quardado refeencia
            // ao atual  dono da posição [0]
            // colocar o novoNó na possição zero
            primeiroNo = novoNo;
        } else {
            // fazendo com que o nó antecessor ao novo nó
            // entenda que o novo nó passa a ser seu sucesso
            novoNo.getNoAntecessor().setNoSucessor(novoNo);
        }

        // atualizar o tamnaho da lista
        tamanhoLista++;

    } // final metodo add sobrecarregado



 // final da classe
}
