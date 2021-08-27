/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale Higueros
 */
public class Atleta {
    String nombre;
    private String apellido;
    int edad;
    private String disciplina;
    private String genero;
    
    public Atleta(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void MostrarDatos(){
    JOptionPane.showConfirmDialog(null, nombre + apellido + edad + disciplina + genero);
    }
    
    public void IngresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del atleta");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del atleta");
       //edad = JOptionPane.showInputDialog("Ingrese la edad del atleta");
        disciplina = JOptionPane.showInputDialog("Ingrese la disciplina del atleta");
        genero = JOptionPane.showInputDialog("Ingrese el genero del atleta");
       
    }
    
}

