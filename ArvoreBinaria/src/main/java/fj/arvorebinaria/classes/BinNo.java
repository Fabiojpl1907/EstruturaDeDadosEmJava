package fj.arvorebinaria.classes;

// vamos utilzar um upperbound wildcards
// todo conteduro obrigatoriamete sequira a dependecia do Comparable
//  arvore binaria é construida no conceito de menor a esquesra, maior a direita
// todo objeto inserido sera obrigado a segui o contrato ( ser impenetado ) o Comparable
// dado um conteudo é necessario definir se ele é maior ou menor aos outros contudos
// dentro de um padrao definido.
// Exemplo Qual casa é maior que outra sobre qual visão ? numero de quartos? preço ? areá cosntruida ?

public class BinNo<T extends Comparable<T>> {

    // payload
    private T conteudo;

    // referencias
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    // construtores
    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNo() {
    }

    // getters e setters

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    // toString


    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }








}
