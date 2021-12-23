package introducao.c.genericsno.genericsno;

// Criado um elo de nós de Integer
// o proprio compilador nao deixa eu usar outro tipo alem do informado
// mas posso definir qual tipo quero
// veja ao final do codigo, uma versão comentada com <String>


public class MainNoGenerics {

    public static void main(String[] args) {

        // Instanciar nó 1 e nó 2
        // new NoGenerics<>  ou new NoGenerics<String> , ambos são válidos

        NoGenerics<Integer> no1 = new NoGenerics<>( 1);
        NoGenerics<Integer>  no2 = new NoGenerics<>( 2);

        // fazer o nó 1 apontar para nó 2 como proximo nó
        no1.setProximoNo(no2);

        // adicionar nó
        NoGenerics<Integer>  no3 = new NoGenerics<>( 3);

        // fazer o nó 2 apontar para nó 3 como proximo nó
        no2.setProximoNo(no3);

        // adicionar nó
        NoGenerics<Integer>  no4 = new NoGenerics<>( 4 );

        // fazer o nó 3 apontar para nó 4 como proximo nó
        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        // apresenta o conteudo do proximo no , a partir de nó1
        System.out.println(no1.getProximoNo());

        // mostrar o encadeamento entre os nós
        System.out.println("--------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }


}



//Exemplo com String

//public class MainNoGenerics {
//
//    public static void main(String[] args) {
//
//        // Instanciar nó 1 e nó 2
//        // new NoGenerics<>  ou new NoGenerics<String> , ambos são válidos
//
//        NoGenerics<String> no1 = new NoGenerics<>( "Conteudo nó 1");
//        NoGenerics<String>  no2 = new NoGenerics<String>( "Conteudo nó 2");
//
//        // fazer o nó 1 apontar para nó 2 como proximo nó
//        no1.setProximoNo(no2);
//
//        // adicionar nó
//        NoGenerics<String>  no3 = new NoGenerics<>( "Conteudo nó 3");
//
//        // fazer o nó 2 apontar para nó 3 como proximo nó
//        no2.setProximoNo(no3);
//
//        // adicionar nó
//        NoGenerics<String>  no4 = new NoGenerics<>( "Conteudo nó 4");
//
//        // fazer o nó 3 apontar para nó 4 como proximo nó
//        no3.setProximoNo(no4);
//
//        // no1 -> no2 -> no3 -> no4 -> null
//
//        System.out.println(no1);
//        // apresenta o conteudo do proximo no , a partir de nó1
//        System.out.println(no1.getProximoNo());
//
//        // mostrar o encadeamento entre os nós
//        System.out.println("--------------------");
//        System.out.println(no1);
//        System.out.println(no1.getProximoNo());
//        System.out.println(no1.getProximoNo().getProximoNo());
//        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
//        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
//    }
//
//
//}
