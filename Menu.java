/*
 * Autor: Camilo Figueroa ( Crivera ) Agosto de 2016
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//El paquete viene por defecto y depende de la organización de las carpetas.
package arregloscolecciones;

/*Muy importante, hay que importar las clases que servirán al programa.
Son algo así como librerias, módulos, en general... operaciones de Java.*/
import javax.swing.JOptionPane;

/**
 *
 * @author SATELLITE
 */
public class Menu {

    public static Mensajes gMensajes = new Mensajes();

    //Aquí se construye la cadena de carateres del menú.
    public static String gIdioma = "espa"; //No hay que modificar, se propaga desde la otra clase.

    /**
     * Este método muestra el menú 
     * @return          número          la opción del menú que el usuario ha escogido.
     */
    public static int mostrarMenu()
    {
        int respuesta = 0;
        
        //Muestra un mensaje de texto con botón de aceptar en pantalla.
        respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,gMensajes.mostrarMensaje( gIdioma, 6 )));
        
        return respuesta;
    }
    
}
