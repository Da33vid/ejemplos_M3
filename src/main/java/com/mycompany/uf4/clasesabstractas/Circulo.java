package com.mycompany.uf4.clasesabstractas;

public class Circulo extends FiguraGeometrica{
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    public Circulo() {
    }

    @Override
public void dibujar(){
        System.out.println("Dibujar circulo");
    }
}
