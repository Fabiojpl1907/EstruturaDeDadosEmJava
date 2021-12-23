package pilha.a.implantacaopilha;

public class Pilha {

    // ponteiro de topo de pilha
    private NoPilha refNoEntradaPilha;

    // construtor da pilha

    // ao criat a pilha ela esta vazia
    // refNoEntradaPilha = null
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // metodos de manipulacao de pilha

    // pilha vazia ?
    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    // quem esta no topo
    // nao faz nada : nao excluir ou insere
    public NoPilha TOP() {
        return refNoEntradaPilha;
    }

    // acrescentar um nó no topo da pilha
    // empilhar
    // recebe um novo nó
    public void Push(NoPilha novoNo) {

        // obter a referencia atual de topo de pilha
        NoPilha refAuxiliar = refNoEntradaPilha;

        // avisa que a referencia agora ( novo nó da pilha )
        // passa a ser o nó recebido
        // lembrando que objeto passa referencia por endereço de memoria
        refNoEntradaPilha = novoNo;

        // avisando ao novoNó que esta abaixo dele
        refNoEntradaPilha.setrefNo(refAuxiliar);

    }

    // método POP
    // excluir o ultimo elemento colocado na pilha ( topo de pilha )

    public NoPilha POP() {
        // testar se pilha não esta vazia
        if (!this.isEmpty()) {
            // registro nó a ser retirado do topo
            NoPilha noPoped = refNoEntradaPilha;

            // topo de pilha passa a ser o nó
            // imediatamente abaixo
            refNoEntradaPilha = refNoEntradaPilha.getrefNo();
            return noPoped;
        }
        // se tiver vazia não há nada a ser retirado
        return null;

    }

    // formatando uma saida com toString
    @Override
    public String toString() {

        //criar um cabeçalho
        String stringRetorno = "------------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------------\n";

        // criar noAuxiliar que sera utilizado para percorrer a pilha
        // e imprimi-la
        // capturando a referencia de entrada da pilha ( topo )

        NoPilha noAuxiliar = refNoEntradaPilha;

        while (true) {

            // veirifcar se a pilha tem nós

            if (noAuxiliar != null) {

                stringRetorno += "[ Nó ( Dado = " + noAuxiliar.getDado() + " )]\n";

                // pegar a referencia do nó seguinte ao anteriormente mostrado
                // lembrando que Pilha vem do topo para a base

                noAuxiliar = noAuxiliar.getrefNo();


            } else {
                break;
            }


        }

        stringRetorno += " Fim de Pilha ----\n";
        return stringRetorno;
    }


}
