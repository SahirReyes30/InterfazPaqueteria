/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.util.ArrayList;


public class Paquete {
    
    private String nombre;
    private String direccion;
    

    public Paquete(String nombre, String direccion) {
        this.direccion = direccion;
        this.nombre = nombre;
        
    }

    public Paquete() {
        
    }
    
    public boolean agregarPaquetes(){
        
        ListaPaquetes listaPaquetes = new ListaPaquetes();
        return listaPaquetes.agregarPaquetes(this);
        
    }
    public ArrayList<Paquete> obtenerPaquetes(){
    ListaPaquetes listaPaquetes = new ListaPaquetes();
    //Paquete primerPaquete = listaPaquetes.get(i);
    //System.out.println(primerPaquete.nombre);
   // System.out.println(primerPaquete.direccion);    
    return listaPaquetes.obtenerPaquetes();
    
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
