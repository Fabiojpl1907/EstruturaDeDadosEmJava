package introducao.a.atribuicaoreferencia.atribuicaoreferencia;

// Atribuicao por valor e referencia

public class Main {
    public static void main(String[] args) {

        //  declarar tipo primitivo
        int intA = 1;

        // atribuir >> valor <<  de uma variavel a outra
        int intB = intA ;

        System.out.println("Int A : " + intA + " Int B : " + intB);

        intA = 2;

        System.out.println("Int A : " + intA + " Int B : " + intB);

        // instanciar Objetos A
        MeuObj objtA = new MeuObj(1);

        // criar objeto B por atribuição
        // o objeto B nao recebe o valor do objeto A, recebe o endereço de memoria do objeto A
        //
        MeuObj objtB = objtA;

        System.out.println("Objeto A : " + objtA + " Objeto B : " + objtB);

        objtA.setNum(2);
        // ao mudar o objeto A , como o objeto B referecia ao A
        // o valor apresentado muda
        System.out.println("Objeto A : " + objtA + " Objeto B : " + objtB);

    }

}
