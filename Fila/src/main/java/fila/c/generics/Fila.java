package fila.c.generics;

// como sta momomento
// podemos passar tipos diferentes para a fila
// o que pode causar problema
// Solução Refatorar usando generics
// se instanciar como String - so vai poder ser string , por exemplo


public class Fila<T> {


    private NoFila<T> refNoEntraFila;

    // construtor
    public Fila() {
        this.refNoEntraFila = null;
    }

    // Testar se fila esta vazia
    public boolean isFilaEmpty() {
        return refNoEntraFila == null ? true : false;
    }

    public void enqueue(T obj) {
        NoFila novoNo = new NoFila(obj);
        novoNo.setRefNoFila(refNoEntraFila);
        refNoEntraFila = novoNo;
    }


    // retornar o primeiro nó da fila
    public T first() {


        if (!this.isFilaEmpty()) {
            NoFila primeiroNo = refNoEntraFila;

            while (true) {

                if (primeiroNo.getRefNoFila() != null) {

                    primeiroNo = primeiroNo.getRefNoFila();
                } else {

                    break;
                }
            }

            return (T) primeiroNo.getObject();
        }

        return null;
    }

    // remover primeiro nó da fila
    public T dequeue() {
        if (!this.isFilaEmpty()) {
            NoFila primeiroNo = refNoEntraFila;
            NoFila noAuxiliar = refNoEntraFila;

            while (true) {

                if (primeiroNo.getRefNoFila() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoFila();
                } else {
                    noAuxiliar.setRefNoFila(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntraFila;

        if (refNoEntraFila != null) {
            while (true) {
                stringRetorno += "[Nó { objeto = " + noAuxiliar.getObject() + " }]--->";
                if (noAuxiliar.getRefNoFila() != null) {
                    noAuxiliar = noAuxiliar.getRefNoFila();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }

}
