package introducao.b.projetono.projetono;

// Elo de Nós

public class MainNo {

    public static void main(String[] args) {

        // Instanciar nó 1 e nó 2
        // ambos irão apontar para Null como proximo bloco
        No no1 = new No( "Conteudo nó 1");
        No no2 = new No( "Conteudo nó 2");

        // fazer o nó 1 apontar para nó 2 como proximo nó
        no1.setProximoNo(no2);

        // adicionar nó
        No no3 = new No( "Conteudo nó 3");

        // fazer o nó 2 apontar para nó 3 como proximo nó
        no2.setProximoNo(no3);

        // adicionar nó
        No no4 = new No( "Conteudo nó 4");

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
