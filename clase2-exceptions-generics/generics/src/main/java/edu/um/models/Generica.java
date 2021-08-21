package edu.um.models;

public class Generica<T>{
    //Utilizado generalmente para comparar o ordenar objetos de diferentes tipos reutilizando codigo

    private T ob;

    public Generica(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }
}
