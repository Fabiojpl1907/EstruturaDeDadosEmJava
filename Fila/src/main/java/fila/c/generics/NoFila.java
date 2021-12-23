package fila.c.generics;

// refatorando para vir a receber um unico tipo de dado
// com o uso do Generics
public class NoFila<T> {

    // tocar Object por tipo generico
    private T object;
    private NoFila<T> refNoFila;

    // construtor padrão
    public NoFila() {
    }

    // construtor
    public NoFila(T object) {
        this.refNoFila = null;
        this.object = object;
    }

    // getters and setters


    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
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
