package com.mycompany.uf4.interfaces;

public class ImplementacionMySql implements AccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");

    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MySql");


    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySql");

    }
}
