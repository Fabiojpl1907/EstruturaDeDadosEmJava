package fj.listacircular.classes;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

// Construtor -----------------------------------------
    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

// add() - Adicona nó ------------------------------------------
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

// remove() - remover nó -----------------------------------------
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

// get() - obter conteudo do nó -----------------------------------------
    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista vazia");

        if(index == 0){
            return this.cauda;
        }

        No<T> noTemporario = this.cauda;
        for(int i = 0; i < index; i++){
            noTemporario = noTemporario.getNoProximo();
        }
        return noTemporario;
    }

// isEmpety() -----------------------------------------
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

// size() - tamanho da fila -----------------------------------------
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String str = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            str += "[Nó { conteúdo =" + noAuxiliar.getConteudo() +" }]---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        str += size() != 0 ? "(Retorna ao início)" : "[]";
        return str;
    }

}
