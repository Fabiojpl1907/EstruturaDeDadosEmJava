package fila.a.implantacaofila;

public class Fila {

    // criar nó de referencia de entrada na fila
    // lembrar : entramos na fila pelo final dela
    private NoFila refNoEntraFila;

    // construtor
    public Fila() {
        // garantir que instaciar a referencia seja nula
        this.refNoEntraFila = null;
    }

    // Testar se fila esta vazia
    public boolean isFilaEmpty() {
        return refNoEntraFila == null ? true : false;
    }

    // versão 1
    // inserir na fila
    // enfilerar -> enqueue
/*    public void enqueue( NoFila novoNo ) {
        // ajustar novo nó
        // com a referencia de entrada na fila
        novoNo.setRefNoFila( refNoEntraFila);

        // a referencia para entrda na fila
        // passa a ser o novoNó , que é a novo ultimo objeto da fila
        refNoEntraFila = novoNo;
    }*/

    // versão 2
    // Encapsular o nó
    // ao inves de passar o nó , vamos passar o objeto
    public void enqueue(Object obj) {
        NoFila novoNo = new NoFila(obj);
        novoNo.setRefNoFila(refNoEntraFila);
        refNoEntraFila = novoNo;
    }


    // retornar o primeiro nó da fila
    // refatorar para Objeto
    public Object first() {

        // verificar se fila não esta vazia
        if (!this.isFilaEmpty()) {
            NoFila primeiroNo = refNoEntraFila;

            //varrer a fila para verificar que é o primeiro
            while (true) {

                // verificar se o no atual já é o primeiro
                // o primeiro aponta para null
                // pois não há outro nó a sua frente

                if (primeiroNo.getRefNoFila() != null) {

                    // primeiro nó passa a ser o
                    // nó da frente dele
                    primeiroNo = primeiroNo.getRefNoFila();
                } else {
                    // se referencia for null
                    // o no atual é o primeiro nó
                    break;
                }
            }
            // refatorar
            return primeiroNo.getObject();
        }
        // estando vazia
        return null;
    }

    // remover primeiro nó da fila
    public Object dequeue() {
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
            // refatorar
            return primeiroNo.getObject();
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
