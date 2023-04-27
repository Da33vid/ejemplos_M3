/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf4.polimorfismo;

/**
 *
 * @author davidapalop
 */
public class Employee {
    private double salary;
    private String name;

    public Employee(){
    }
    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String PrintData(){
    
    return ("name: "+this.name+"salary: "+getSalary());
    
    }
    
}
