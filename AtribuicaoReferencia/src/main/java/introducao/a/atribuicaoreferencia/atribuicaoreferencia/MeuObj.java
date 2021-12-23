package introducao.a.atribuicaoreferencia.atribuicaoreferencia;

// Atribuicao por valor e referencia
// Criando um objeto simples

public class MeuObj {


    Integer num;

    // constutor
    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num  ){
        this.num = num ;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
