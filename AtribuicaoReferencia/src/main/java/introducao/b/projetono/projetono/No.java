package introducao.b.projetono.projetono;

// estrutura básica de nó

/*Nó armazena na memória o valor e a referencia ao proximo nó
  Referencia é o elo que liga um nó ao outro
  Ultimo nó aponta para Null
 */

public class No {

    // conteudo do nó
    private String conteudo ;

    // referencia
    private No proximoNo;

    // construtor de conteudo
    public No(String conteudo) {
        // garantir que toda vez que cria um novo nó
        // a referencia ao proximo nó é nula
        this.proximoNo = null ;
        this.conteudo = conteudo;
    }

    // getters e setters


    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
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
