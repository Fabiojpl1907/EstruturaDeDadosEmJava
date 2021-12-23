package fj.arvorebinaria.classes;

// Arvore suporta objetos do tipo generic que implemente a Comparable

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    // constutor padrão
    // que ira setar a raiz da arvore como nul

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // inserir() - publico ----------------------------------------------------------
    public void inserir(T conteudo) {

        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }

// inserir() - privado -----------------------------------------------------------
// metodo recursivo , chamara a ele mesmo até chegar no lugar onde deve inserir o novo nó

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {

        // estou na raiz ?
        if (atual == null ) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            // neste ponto estamos varrendo a arvore em seus nó a esquerda
            // a esquerad ficam os nó de menor valor
            // ao usar o compareto se menor retorna -1
            // se igual retorna 0 , se maior retorna 1
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            // valor é maior , assim valor pelo lado direito dos nós
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }
//_______________________________________________________________________________________

// Metodos de Exibição  _________________________________________________________________
// privado , fica a parte recursiva da exibição
// public  , sera chamado no main

    // inOrdem - do menor para o maior __________________________________________________________
    public void exibirInOrdem() {
        System.out.println("\n Exibindo em Ordem - do menor para o maior ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {

        // é null ?
        // se sim chegou ao final da exibição

        // primeiro visita o da esquerda
        // depois visita  o da direita
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + " , ");
            exibirInOrdem(atual.getNoDir());
        }
    }

// posOrdem - do maior para o menr  __________________________________________________________
        public void exibirPosOrdem () {
            System.out.println("\n Exibindo em Pos Ordem");
            exibirPosOrdem(this.raiz);
        }
        private void exibirPosOrdem (BinNo < T > atual) {

            // é null ?
            // se sim chegou ao final da exibição

            // exibe depois de visitar
            if (atual != null) {
                exibirPosOrdem(atual.getNoEsq());
                exibirPosOrdem(atual.getNoDir());
                System.out.print(atual.getConteudo() + " , ");
            }

        }

// presOrdem - exibe primeirp e depois visita __________________________________________________________
        public void exibirPreOrdem () {
            System.out.println("\n Exibindo em Pre Ordem ");
            exibirPreOrdem(this.raiz);
        }
        private void exibirPreOrdem (BinNo < T > atual) {

            // é null ?
            // se sim chegou ao final da exibição

            // exibe depois de visitar
            if (atual != null) {
                System.out.print(atual.getConteudo() + " , ");
                exibirPreOrdem(atual.getNoEsq());
                exibirPreOrdem(atual.getNoDir());
            }

        }
// Termino métodos de exibição ------------------------------------------------------------

// remove()  - sera feito sem recusividade ____________________________________________________
// as anotações parte I , II , etc , são em referencias as varios videos em que o
// método foi quebrado

    public void remover(T conteudo){
        // A instrução try permite definir um bloco de código a ser testado quanto a erros enquanto está sendo executado.
        //A instrução catch permite definir um bloco de código a ser executado, se ocorrer um erro no bloco try.

        // parte 1
        try{

            // criar nós
            // para ercorrer a arvore
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            // procurar o primeiro nó
            // que contem  o conteudo , e sera removido
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    // se for menor
                    atual = atual.getNoEsq();
                }else {
                    // se for maior
                    atual = atual.getNoDir();
                }
            }
            // ainda, a arvore pode estar vazia , ou o conteudo não ser
            // encortado na arvore
            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            // parte II
            // seria o nó pai , ou no esq ou no dir
            // nulo ?
            if(pai == null){

                // correndo os nós
                // e testando se não nulos
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {

                    // aqui tiramos e re-ajustamos os nós restantes
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            // parte III
            // correndo o miolo da arvore
            // se a refenecia a direita seja nula
            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
                // parte IV
                // correndo o miolo da arvore
                // se a refenecia a esquerda  seja nula
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
                // parte V
                // correndo o miolo da arvore
            }else{
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }


// final remover ----------------------------------------------------------------

// final classe arvore binaria
}
