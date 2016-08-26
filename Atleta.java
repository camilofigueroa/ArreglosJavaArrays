/*
 * Autor: Camilo Figueroa ( Crivera ) Agosto de 2016
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://www.youtube.com/watch?v=Z4k582CoCvs
 * http://stackoverflow.com/questions/5364278/creating-an-array-of-objects-in-java
 */

//El paquete viene por defecto y depende de la organización de las carpetas.
package arregloscolecciones;

import javax.swing.JOptionPane;

/**
 *
 * @author SATELLITE
 */
public class Atleta {

    //Estos datos son pedidos en el ejercicio.
    private String gNombre;
    public String gNacionalidad;
    private double gTiempoAtleta;
        
    public void Atleta()
    {
        gNombre = "";
        gNacionalidad = "";
        gTiempoAtleta = 0;
    }
    
    /**
     * Se solicitan los datos del atleta mediante este método.
     */
    public void registrarAtleta()
    {
        gNombre = JOptionPane.showInputDialog(null,"Digite el nombre del atleta: ");
        gNacionalidad = JOptionPane.showInputDialog(null,"Digite la nacionalidad: ");
        gTiempoAtleta = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el tiempo: "));
    }

    /**
    * Retorna los datos del atleta.
    * @return       texto       el nombre del atleta.
    */
    public String retornarDatosAtleta()
    {
        return gNombre + " " + gNacionalidad + " " + gTiempoAtleta;
    }

    /**
    * Retorna tiempo del atleta.
    * @return       número       el tiempo del atleta.
    */
    public double retornarTiempoAtleta()
    {
        return gTiempoAtleta;
    }
    
}
