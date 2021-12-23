package fila.a.implantacaofila;

public class NoFila {

    // vai conter um objeto
    // da classe Object do java language - todos objetos herdam dela
    // o object -> conteudo do nó

    private Object object;
    private NoFila refNoFila;

    // construtor padrão
    public NoFila() {
    }

    // construtor
    public NoFila(Object object) {
        this.refNoFila = null;
        this.object = object;
    }

    // getters and setters


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoFila getRefNoFila() {
        return refNoFila;
    }

    public void setRefNoFila(NoFila refNoFila) {
        this.refNoFila = refNoFila;
    }

    // toString


    @Override
    public String toString() {
        return "Nó Fila{" +
                "object = " + object +
                '}';
    }
}
