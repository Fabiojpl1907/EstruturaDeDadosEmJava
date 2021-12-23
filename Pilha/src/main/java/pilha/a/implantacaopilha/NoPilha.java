package pilha.a.implantacaopilha;

// contuindo no para pilha
// estrutura de pilha e LIFO -> Last In - First Out
// o topo recebe uma referencia d topo
// a base aponta para null ( antes da base não há pilha )

public class NoPilha {

    private int dado;
    private NoPilha refNo = null;

    // construtor vazio
    public NoPilha() {
    }

    // construtor - dado
    public NoPilha(int dado) {
        this.dado = dado;
    }

    // getters e setters


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getrefNo() {
        return refNo;
    }

    public void setrefNo(NoPilha refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
