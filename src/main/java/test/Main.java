/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import com.mycompany.uf4.clasesabstractas.Circulo;
import com.mycompany.uf4.clasesabstractas.Rectangulo;
import com.mycompany.uf4.interfaces.AccesoDatos;
import com.mycompany.uf4.interfaces.ImplementacionMySql;
import com.mycompany.uf4.interfaces.ImplementacionOracle;
import com.mycompany.uf4.polimorfismo.Employee;
import com.mycompany.uf4.polimorfismo.Manager;
import com.mycompany.uf4.clasesabstractas.FiguraGeometrica;


/**
 *
 * @author davidapalop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //    Employee emp = new Employee(2.2,"sad");
        //     printDetails(emp);
        //      Manager mgr = new Manager("xdsa",2.2,"asd");
        //    printDetails(mgr);
        //    FiguraGeometrica fig = new Rectangulo("rectangulo");
        //   FiguraGeometrica fig2 = new Circulo("circulo");
        //   fig.dibujar();
        //    fig2.dibujar();
         AccesoDatos datos = new ImplementacionMySql();
        datos.insertar();
        datos = new ImplementacionOracle();
        datos.insertar();
    }
    static void printDetails(Employee e){
            System.out.println(e.PrintData());
    }
    
}
