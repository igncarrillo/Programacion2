package edu.um.models;

public class OtraGenerica <T extends ISumador>{
    private T ob;

    public OtraGenerica(T ob) {
        this.ob = ob;
    }
    public T getOb() {
        return ob;
    }

    public void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }

    public void sumar1(){
        ob.sumar1();
    }

}
