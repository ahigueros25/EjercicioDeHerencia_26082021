/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd;
import edu.ujmd.clases.Atleta;
import edu.ujmd.clases.Nadador;

/**
 *
 * @author Ale Higueros
 */
public class TareaDeHerencia {

    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        atleta.IngresarDatos();
        atleta.MostrarDatos();
        
        Nadador nadador = new Nadador();
        nadador.IngresarDatos();
        nadador.MostrarDatos();
    }
    
}
