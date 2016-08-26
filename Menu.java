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
public class Menu {

    //Aquí se construye la cadena de carateres del menú.
    private String gTextoMenu = " 1. Registrar Atleta. \n 2. Datos del campeón. \n 3. Atletas por pais. \n 4. Tiempo promedio de los atletas. \n 5. Salir. " ;
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Muestra un mensaje de texto con botón de aceptar en pantalla.
        JOptionPane.showMessageDialog(null,"Bienvenido al programa de arreglos y colecciones. ");
        
        
    }
    
}
