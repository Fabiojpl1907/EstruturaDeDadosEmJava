package fj.arvorebinaria.main;

import fj.arvorebinaria.classes.ArvoreBinaria;
import fj.arvorebinaria.model.Obj;

public class Main {

    public static void main(String[] args) {


        ArvoreBinaria<Obj> primeiraArvore = new ArvoreBinaria<>();

        primeiraArvore.inserir( new Obj(13));
        primeiraArvore.inserir(new Obj(10));
        primeiraArvore.inserir(new Obj(25));
        primeiraArvore.inserir(new Obj(2));
        primeiraArvore.inserir(new Obj(12));
        primeiraArvore.inserir(new Obj(20));
        primeiraArvore.inserir(new Obj(31));
        primeiraArvore.inserir(new Obj(29));
        primeiraArvore.inserir(new Obj(32));

        primeiraArvore.exibirInOrdem();
        primeiraArvore.exibirPreOrdem();
        primeiraArvore.exibirPosOrdem();

    }
}
