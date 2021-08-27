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
public class Nadador {

    private String categoria;
    private String metrosNadados;
    private String victorias;
    private String derrotas;

    public Nadador() {

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMetrosNadados() {
        return metrosNadados;
    }

    public void setMetrosNadados(String metrosNadados) {
        this.metrosNadados = metrosNadados;
    }

    public String getVictorias() {
        return victorias;
    }

    public void setVictorias(String victorias) {
        this.victorias = victorias;
    }

    public String getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(String derrotas) {
        this.derrotas = derrotas;
    }
    
    public void MostrarDatos(){
    JOptionPane.showConfirmDialog(null, categoria + metrosNadados + victorias + derrotas);
    }
    
    public void IngresarDatos() {
        categoria = JOptionPane.showInputDialog("Ingrese la categoria del nadador");
        metrosNadados = JOptionPane.showInputDialog("Ingrese los metros nadados del nadador");
        victorias = JOptionPane.showInputDialog("Ingrese las victorias del nadador");
        derrotas = JOptionPane.showInputDialog("Ingrese las derrotas del nadador");
       
    }
}
