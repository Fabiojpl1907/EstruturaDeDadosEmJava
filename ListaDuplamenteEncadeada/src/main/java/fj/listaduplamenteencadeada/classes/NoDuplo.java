package fj.listaduplamenteencadeada.classes;

// criar no duplo
// para lista duplamente encadeada
// em uma lista encadeada o nó possui 3 elemntos
//  [ref. para nó antecessor ] - [conteudo]- [referencia para nó sucessor ]


// Uma primeira vantagem da utilização de lista duplamente encadeada sobre
// a lista simplesmente encadeada é a maior facilidade para navegação,
// que na lista duplamente encadeada pode ser feita nos dois sentidos, ou seja,
// do início para o fim e do fim para o início.
// Isso facilita a realização de operações tais como inclusão e remoção de nós,
// pois diminui a quantidade de variáveis auxiliares necessárias.
// Se não existe a necessidade de se percorrer a lista de trás para frente,


public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noAntecessor;
    private NoDuplo<T> noSucessor;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoAntecessor() {
        return noAntecessor;
    }

    public void setNoAntecessor(NoDuplo<T> noAntecessor) {
        this.noAntecessor = noAntecessor;
    }

    public NoDuplo<T> getNoSucessor() {
        return noSucessor;
    }

    public void setNoSucessor(NoDuplo<T> noSucessor) {
        this.noSucessor = noSucessor;
    }

    @Override
    public String toString() {
        return "NoDuplo { " +
                "conteudo = " + conteudo +
                '}';
    }
}
