package com.mycompany.uf4.interfaces;

public interface AccesoDatos {
    public static int MAX_REGISTROS = 10;
    public abstract void insertar();
    public abstract void listar();
    public abstract void actualizar();
    public abstract void eliminar();

}
