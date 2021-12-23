package introducao.c.genericsno.genericsno;

// estrutura básica de nó
// Refatorada para permitir qualquer tipo de dados
// usar Generics

public class NoGenerics<T> {

    // conteudo do nó
    // passa a ser qualquer tipo generico
    private T conteudo ;

    // proximo nó tambem sera de tipo generico
    private NoGenerics<T> proximoNo;

    // construtor de conteudo
    public NoGenerics( T conteudo) {
        this.proximoNo = null ;
        this.conteudo = conteudo;
    }

    // getters e setters

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerics<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerics<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    // gerar toString para conteudo
    @Override
    public String toString() {
        return "Nó{" +
                "conteúdo='" + conteudo + '\'' +
                '}';
    }
}
