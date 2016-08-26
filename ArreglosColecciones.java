/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//El paquete viene por defecto y depende de la organización de las carpetas.
package arregloscolecciones;

/*Muy importante, hay que importar las clases que servirán al programa.
Son algo así como librerias, módulos, en general... operaciones de Java.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.ArrayList; // Esta es la clase para las colecciones.

/**
 *
 * @author SATELLITE
 */
public class ArreglosColecciones {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Atleta gArregloAtletas[] = new Atleta[ 10 ]; //creamos el vector de 10 atletas.
        
        for( int i=0; i<10; i++ )
        gArregloAtletas[i] = new Atleta();
        
        gArregloAtletas[ 5 ].imprimir();
        // TODO code application logic here
        //this.gAtleta = new Atleta();
        //this.pii = 0;
        //Muestra un mensaje de texto con botón de aceptar en pantalla.
        //JOptionPane.showMessageDialog( null, "Bienvenido al programa de arreglos y colecciones. " );
        
    }
 
}
