package fj.listaencadeada.classes;

// Objeto Nó
// armazena conteudo e referencia ao proximo nó
// utilizar tipo de dados generics


public class No<T> {

    // conteudo de tipo genérico
    private T conteudo;

    // proximono
    // um outro nó no mesmo tipo que esta sendo criado
    private No proximoNo;

    // Construtor vazio
    public No() {
        this.proximoNo = null;
    }

    // Constutor conteudo
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    // construtor conteudo + proximo nó
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    // getters & Setters

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }


    // toString para Conteudo

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    // Criar um toString personalizado

    public String toStringEncadeado() {

        String str = "No{" +
                "conteudo=" + conteudo +
                '}';

        // proximo nó não nulo ( ainda tem nós na lista )
        // se sim , será concatenado
        // com a string de retorno

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "null";
        }
        return str;
    }


// final classe Nó
}
