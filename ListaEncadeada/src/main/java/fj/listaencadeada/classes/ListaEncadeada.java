package fj.listaencadeada.classes;

// lista utiliza tipo generico

public class ListaEncadeada<T> {

    // refefrencia de nó entrada na lista
    private No<T> referenciaEntrada;

    // construtor padrão
    // criado aqui para inseriri a atribuição de null para
    // referencia de entrada da Lista Encadeada
    // ao criar uma novo objeto listaencadeada
    // imediatemente a ponta para null
    // indicando a lista estar vazia
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

// Metodos ------------------------------------------------------------


// add() ------------------------------------------------------------

    // metodo para adicionar um novo nó
    // recebe um conteudo do tipo genérico

    public void add(T conteudo){
        No<T> noInserido = new No(conteudo);

        // lista vazia ?
        if(this.isEmpty()){
            referenciaEntrada = noInserido;
            return;
        }

        // se lista não vazia
        No<T> noBuffer = referenciaEntrada;

        // vamos correr a lista do inicio ao final dela ( seu tamanho )
        // assim o size() de uma lista é todos seus nós com
        // conteudo + o nó null que indica fim de lista
        for(int i = 0; i < size() - 1; i++){

            // vamos correr de nó em nó na lista
            noBuffer = noBuffer.getProximoNo();
        }
        // apos chegar ao final da lista
        // ajusta no auxiliar como novo nó
        noBuffer.setProximoNo(noInserido);
    }



// get() ------------------------------------------------------------

    // metodo get para retornar conteudo
    // re-utilizando codigo
    // o conteudo é do tipo genérico
    public T get(int index){
        return getNo(index).getConteudo();
    }


// getNo() ------------------------------------------------------------

    // obter nó
    // metodo a ser utilizado somente internamente na classe
    private No<T> getNo(int index){

        // validar se indice passado é coerente
        validaIndice(index);
        No<T> noBuffer = referenciaEntrada;
        No<T> noRetorno = null;

        // vamos correr a lista até o indice fornecido
        for(int i = 0; i <= index; i++){
            noRetorno = noBuffer;
            // vamos correr de nó em nó na lista
            noBuffer = noBuffer.getProximoNo();
        }
        return noRetorno;
    }


// remove() ------------------------------------------------------------

    // metodo para remover
    // vai retornar o conteudo do nó removido
    public T remove(int index){

        validaIndice(index);

        // registrando nó a ser removido
        No<T> noPivor = getNo(index);

        // o nó a ser removido é o primeiro nó da lista ?
        if(index == 0){
            // a referencia entrada na lista estava no primeiro nó
            // passar ela para o noó seguinte , o segundo nó
            referenciaEntrada = noPivor.getProximoNo();

            // retornando conteudo do nó retirado
            return noPivor.getConteudo();
        }

        // se o indice não for zero
        // terei um nó antes e outro nó depois
        // do nó a ser retirado
        No<T> noAnterior = getNo(index - 1);

        // lincando o nó antes como o nó depois do nó alvo
        // assim tiro da fila/elo o nó alvo
        // era  1 -> 2 -> 3
        // ligo 1 e 3 :  fica 1-> 3
        // 2 sai da cadeia
        noAnterior.setProximoNo(noPivor.getProximoNo());

        // apos o return a JVM percebe que temos um no se referencia
        // e deleta ele.
        return noPivor.getConteudo();
    }


// size() ------------------------------------------------------------

    // tamanho lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        // varrendo a lista para identificar seu tamanho
        while(true){
            if(referenciaAux != null){

                // como há elementos na lista
                // incremento o contador
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    // se há um proximo nó vou ir até ele
                    referenciaAux = referenciaAux.getProximoNo();
                }else{  break; }
            }else{ break; }
        }
        return tamanhoLista;
    }


// validaIndice() ------------------------------------------------------------

    // validar se indice passado é coerente
    // em relação ao tamanho da lista
    // lembrando que o ultimo nó é null indicando fim de lista
    // assim o size() de uma lista é todos seus nós com conteudo + o nó null
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            String str = "\nNão existe  nó indice : " + index + " nesta lista\n";
            str += "Esta lista possui " + ultimoIndice + " nós";

            throw new IndexOutOfBoundsException(str);
        }
    }


// isEmpty() ------------------------------------------------------------

    // Lista vazia ?
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }


// Getters & Setters ------------------------------------------------------------

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }


// toString() ------------------------------------------------------------

    // queremos ver toda a estrutura da Lista Encadeada
    @Override
    public String toString() {
        String strRetorno = "";

        // logica para correr a lista
        No<T> noBuffer = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            // concatenar o nó atual
            strRetorno += "[No{conteudo=" + noBuffer.getConteudo() +"}]--->";
            // a cada ciclo o notemp passa a ser o nó a frente dele
            noBuffer = noBuffer.getProximoNo();
        }
        // ultimo nó é o null
        strRetorno += "null";
        return strRetorno;
    }
}