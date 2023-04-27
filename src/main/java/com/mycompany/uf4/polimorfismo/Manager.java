/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf4.polimorfismo;

/**
 *
 * @author davidapalop
 */
public class Manager extends Employee {
    private String Department;
    public Manager(){
    
    }

    public Manager(String Department) {
        this.Department = Department;
    }

    public Manager(String Department, double salary, String name) {
        super(salary, name);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    public String PrintData(){
    StringBuilder sb =new StringBuilder();
    sb.append(super.PrintData());
    sb.append(getDepartment());
    return (sb.toString());
    
    
    }
}
