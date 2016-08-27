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

import java.util.ArrayList; // Esta es la clase para las colecciones.

/**
 *
 * @author SATELLITE
 */
public class Mensajes {    
    
    //Esta es una lista que va a almacenar arreglos string. En resumen sería una matriz.
    private ArrayList<String[]> gListaMensajes = new ArrayList<String[]>();
    
    /**
    * Este es el constructor de la clase. Nos permite inicializar todo el tema.
    */
    public void asignarMensajes()
    {
        String cad[] = new String[ 2 ]; //Intermediario para cargar en la lista ambas dimensiones del vector.
        
        //arregloLista[ 0 ] 
        cad[ 0 ] = "Idioma: Español.";
        cad[ 1 ] = "Language: English.";   
        gListaMensajes.add( cad );

        //arregloLista[ 1 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "Número de atletas hasta el momento: ";
        cad[ 1 ] = "Number of athletes for now: ";   
        gListaMensajes.add( cad );
        
        //arregloLista[ 2 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "Los datos del campeón son: ";
        cad[ 1 ] = "Champion data: ";   
        gListaMensajes.add( cad );

        //arregloLista[ 3 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "El tiempo promedio de los ";
        cad[ 1 ] = "Time average to ";   
        gListaMensajes.add( cad );

        //arregloLista[ 4 ]
        cad = new String[ 2 ];
        cad[ 0 ] = " atleta(s) es: ";
        cad[ 1 ] = " athletes is: ";   
        gListaMensajes.add( cad );

        //arregloLista[ 5 ]
        cad = new String[ 2 ];
        cad[ 0 ] = " Por favor ingrese el pais para buscar sus atletas: ";
        cad[ 1 ] = " Please write the contry to search athetes: ";   
        gListaMensajes.add( cad );

        //arregloLista[ 6 ]
        cad = new String[ 2 ];
        cad[ 0 ] = " 1. Registrar Atleta. \n 2. Datos del campeón. \n 3. Atletas por pais. \n 4. Tiempo promedio de los atletas. \n 5. Salir. ";
        cad[ 1 ] = " 1. Register Athlete. \n 2. Champion data. \n 3. Athletes by country. \n 4. Time average from athletes. \n 5. Exit. ";   
        gListaMensajes.add( cad );

        //arregloLista[ 7 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "Digite el nombre del atleta: ";
        cad[ 1 ] = "Write the athlete name: ";   
        gListaMensajes.add( cad );

        //arregloLista[ 8 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "Digite la nacionalidad: ";
        cad[ 1 ] = "Write the country: ";   
        gListaMensajes.add( cad );

        //arregloLista[ 9 ]
        cad = new String[ 2 ];
        cad[ 0 ] = "Digite el tiempo: ";
        cad[ 1 ] = "Write the time: ";   
        gListaMensajes.add( cad );

        //JOptionPane.showConfirmDialog(null, "Cargando textos de idioma.");
    }

    /**
     * Este método retorna un determinado mensaje. 
     * @return          texto          el texto escogido en inglés o español.
     */
    public String mostrarMensaje( String idioma, int indice )
    {
        int snPrueba = 0;
        String respuesta = "";
        int indiceIdioma = idioma.matches( "espa" ) ? 0: 1; //La segunda dimensión de la lista representa cada idioma. 
        String[] tmpCad = new String[ 2 ];
        
        if( snPrueba == 1 ) System.out.println( gListaMensajes );
        if( snPrueba == 1 )System.out.println( "Tamaño de la lista " + gListaMensajes.size()  );
        if( snPrueba == 1 )System.out.println( gListaMensajes.get( indice ) );
        tmpCad = gListaMensajes.get( indice );
        
        if( snPrueba == 1 )System.out.println( tmpCad[ 0 ] + " " + tmpCad[ 1 ] );
        
        //Muestra un mensaje de texto con botón de aceptar en pantalla.
        respuesta = tmpCad[ indiceIdioma ];
        
        return respuesta + "";
    }
    
}
