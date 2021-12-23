package fj.arvorebinaria.model;

// esta classe seta um templates das classes
// a serem utilizadas
// no objeto arvore

public abstract class ObjArvore<T> implements Comparable<T>{

    // metodos abstatos
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
