package com.mycompany.uf4.clasesabstractas;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public Rectangulo() {
    }

    @Override
public void dibujar(){
        System.out.println("Dibujar rectangulo");
    }

}
