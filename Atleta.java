/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://www.youtube.com/watch?v=Z4k582CoCvs
 */

//El paquete viene por defecto y depende de la organización de las carpetas.
package arregloscolecciones;

/**
 *
 * @author SATELLITE
 */
public class Atleta {

    //Estos datos son pedidos en el ejercicio.
    private String gNombre;
    private String gNacionalidad;
    private double gTiempoAtleta;
        
    public void Atleta()
    {
        gNombre = "";
        gNacionalidad = "";
        gTiempoAtleta = 0;
    }
    
    /**
     * Esta es la función o método que entra los datos a la clase del atleta.
     * 
     */
    /*public void solicitarDatos()
    {
        JOptionPane.showMessageDialog(null, "por favor ingrese el nombre del atleta.");
        JOptionPane.showMessageDialog(null, "por favor ingrese el país del atleta.");
        JOptionPane.showMessageDialog(null, "por favor ingrese el tiempo del atleta.");
        //this.imprimir();
    }*/
    
    public void imprimir()
    {
        System.out.println( "A ver" );
    }
    
}
