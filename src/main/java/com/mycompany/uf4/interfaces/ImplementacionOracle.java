package com.mycompany.uf4.interfaces;

public class ImplementacionOracle implements AccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");

    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde Oracle");


    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde Oracle");

    }
}
