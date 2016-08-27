/*
 * Autor: Camilo Figueroa ( Crivera ) Agosto de 2016
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Material de consulta que ayudó al desarrollo del ejercicio.
 * https://www.youtube.com/watch?v=Z4k582CoCvs
 * http://stackoverflow.com/questions/5364278/creating-an-array-of-objects-in-java
 * http://jarroba.com/arraylist-en-java-ejemplos/
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
 
    public static Menu gMenu = new Menu();
    public static Mensajes gMensajes = new Mensajes();
    private static int gMaxIndiceAtleta = 0;
    public static ArrayList<Atleta> gListaAtletas = new ArrayList<Atleta>();
    public static Atleta gAtleta;
    public static String gIdioma = "";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcionEscogida = 0;
        
        gIdioma = JOptionPane.showInputDialog(null, "Ingrese idioma 'espa' o 'engl' - write language 'espa' or 'engl'" );
        
        gMenu.gIdioma = gIdioma; //Esto propaga el idioma también al menú.
        gMenu.gMensajes.asignarMensajes(); //También se puede llamar a una función de una clase dentro de otra.
        gMensajes.asignarMensajes(); //Se cargan todos los mensajes para esta clase.
        echo( gMensajes.mostrarMensaje( gIdioma, 0 ) ); //Se muestra el primer mensaje de todos. Comprueba el idioma.

        while( opcionEscogida != 5 )
        {
            switch( opcionEscogida )
            {
                case 1: //Registrar atleta.
                        gAtleta = new Atleta(); //Se crea una nueva clase, las otras están en el vector. 
                        gAtleta.gIdioma = gIdioma;
                        gAtleta.gMensajes.asignarMensajes();
                        gAtleta.registrarAtleta(); //Se piden los datos del atleta antes de almacenarlo en el arrayList. 
                        gListaAtletas.add( gAtleta ); //Agrego el atleta a la lista. 
                        gMaxIndiceAtleta = gListaAtletas.size(); //Pido el tamaño de la lista, supe-importante.
                        echo( gMensajes.mostrarMensaje( gIdioma, 1 ) + gMaxIndiceAtleta );
                break;

                case 2: //Datos del campeón.
                        echo( gMensajes.mostrarMensaje( gIdioma, 2 ) + retornarDatosCampeon() );
                break;

                case 3: //Atletas por país.
                        imprimirAtletaPorPais();
                break;

                case 4: //Tiempo promedio de todos los atletas.
                        echo( gMensajes.mostrarMensaje( gIdioma, 3 ) + gMaxIndiceAtleta + gMensajes.mostrarMensaje( gIdioma, 4 ) + retornarPromedioAtletas() );
                break;

                default:
                break;
            }
            
            //Aquí se muestra el menú para seleccionar la opción.
            opcionEscogida = gMenu.mostrarMenu();
        }              
    }
    
    /**
     * Imprime los atletas solicitando un pais.
     */
    public static void imprimirAtletaPorPais()
    {
        String pais = "";
        int i = 0;
        
        pais = JOptionPane.showInputDialog(null, gMensajes.mostrarMensaje( gIdioma, 5 ) );
        //System.out.println( "El pais a buscar será " + pais );
        
        for( i = 0; i < gMaxIndiceAtleta; i ++ )
        {
            //echo( "Buscando en " + gListaAtletas.get( i ).gNacionalidad ); 
            if( pais.matches( gListaAtletas.get( i ).gNacionalidad ) == true )
            echo( gListaAtletas.get( i ).retornarDatosAtleta() );
        }        
    }


    /**
     * Retorna el promedio de todos los tiempos de los atletas.
     * @return 
     */
    public static double retornarPromedioAtletas()
    {
        double suma = 0;
        int i = 0;

        for( i = 0; i < gMaxIndiceAtleta; i ++ )
        {
            suma += gListaAtletas.get( i ).retornarTiempoAtleta();
        }

        return suma / ( gMaxIndiceAtleta );
    }

    /**
     * Retorna el campeon por tiempo.
     * @return 
     */
    public static String retornarDatosCampeon()
    {
        String respuesta = "";
        int i = 0;
        int indiceMejor = 0;

        //No se va a buscar el mejor si por lo menos no hay dos atletas.
        if( gMaxIndiceAtleta > 1 )
        {
            for( i = 0; i < gMaxIndiceAtleta; i ++ )
            {
                //El atleta con el menor tiempo es el mejor.
                if( gListaAtletas.get( i ).retornarTiempoAtleta() < gListaAtletas.get( indiceMejor ).retornarTiempoAtleta() )
                {
                    indiceMejor = i;
                }
                
                //echo( indiceMejor + " Mejor hasta el momento: " + gArregloAtletas[ indiceMejor ].retornarDatosAtleta() );
            }
        }

        return gListaAtletas.get( indiceMejor ).retornarDatosAtleta();
    }
    
    /**
     * Solo para simular la función echo del php.
     */
    public static void echo( String cad )
    {
        System.out.println( cad );
    }
}
