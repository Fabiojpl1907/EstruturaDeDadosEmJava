package fj.arvorebinaria.model;

import java.util.Objects;

// sera a implementação do objeto a ser usado
// na arvore

public class Obj extends ObjArvore<Obj> {

    // payload
    Integer meuValor;

    // receber o meu payllaod
    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }

  // criar metodos sobreescritos - overrides

  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Obj obj = (Obj) o;
      return Objects.equals(meuValor, obj.meuValor);
  }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    // metodo mais importante
    // para nos localizamos dentro da arvoce
    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
