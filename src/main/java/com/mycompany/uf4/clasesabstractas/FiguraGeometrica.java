/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf4.clasesabstractas;

/**
 *
 * @author davidapalop
 */
public abstract class FiguraGeometrica {
    private String tipoFigura;

    public FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public  FiguraGeometrica(){
    }

    public String getTipoFigura() {
        return tipoFigura;
    }


    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();
    public String toString(){
        return "Tipo de figura: "+tipoFigura;
    }
}
