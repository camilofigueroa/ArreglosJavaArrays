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
    
    public static int gTotalAtletas = 10;
    public static Atleta gArregloAtletas[] = new Atleta[ gTotalAtletas ];
    public static Menu gMenu = new Menu();
    private static int gMaxIndiceAtleta = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcionEscogida = 0;
        
        //gArregloAtletas = new Atleta[ 10 ]; //creamos el vector de 10 atletas.
        
        //Se crean los atletas.
        for( int i=0; i<10; i++ )
        gArregloAtletas[i] = new Atleta();
        
        while( opcionEscogida != 5 )
        {
            switch( opcionEscogida )
            {
                case 1: //Registrar atleta.
                        solicitarDatosAtleta( gMaxIndiceAtleta );
                        if( gMaxIndiceAtleta < gTotalAtletas - 1 ) gMaxIndiceAtleta ++;
                break;

                case 2: //Datos del campeón.
                        System.out.println( "Los datos del campeón son: " + retornarDatosCampeon() );
                break;

                case 3: //Atletas por país.
                        imprimirAtletaPorPais();
                break;

                case 4: //Tiempo promedio de todos los atletas.
                        System.out.println( "El tiempo promedio de los " + gMaxIndiceAtleta + " atleta(s) es: " + retornarPromedioAtletas() );
                break;

                default:
                break;
            }
            
            //Aquí se muestra el menú para seleccionar la opción.
            opcionEscogida = gMenu.mostrarMenu();
        }              
    }
    
    /**
    * Esto solicita los datos de un atleta específico.
    */
    public static void solicitarDatosAtleta( int indice )
    {
        gArregloAtletas[ indice ].registrarAtleta();
    }
    
    /**
     * Imprime los atletas solicitando un pais.
     */
    public static void imprimirAtletaPorPais()
    {
        String pais = "";
        int i = 0;
        
        pais = JOptionPane.showInputDialog(null, "Por favor ingrese el pais para buscar sus atletas.");
        //System.out.println( "El pais a buscar será " + pais );
        
        for( i = 0; i < gMaxIndiceAtleta; i ++ )
        {
            System.out.println( "Buscando en " + gArregloAtletas[ i ].gNacionalidad );
            
            if( pais.matches( gArregloAtletas[ i ].gNacionalidad ) == true )
            System.out.println( gArregloAtletas[ i ].retornarDatosAtleta() );
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
            suma += gArregloAtletas[ i ].retornarTiempoAtleta();
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

        //No se va a busvcar el mejor si por lo menos no hay dos atletas.
        if( gMaxIndiceAtleta > 1 )
        {
            for( i = 0; i < gMaxIndiceAtleta; i ++ )
            {
                if( gArregloAtletas[ i ].retornarTiempoAtleta() > gArregloAtletas[ indiceMejor ].retornarTiempoAtleta() )
                {
                    indiceMejor = i;
                }
                
                System.out.println( indiceMejor + " Mejor hasta el momento: " + gArregloAtletas[ indiceMejor ].retornarDatosAtleta() );
            }
        }

        return gArregloAtletas[ indiceMejor ].retornarDatosAtleta();
    }
 
}
