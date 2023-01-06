/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


class Ruta {

    public Ruta() {
        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }
    }
    
    
    public int generarRuta(){
        Paquete paquete = new Paquete();
        
        ArrayList<Paquete> paquetes = paquete.obtenerPaquetes();
        int contador = 0;
        for(Paquete totalPaquete : paquetes){
            contador++;
            System.out.println("El destinatario es " + totalPaquete.getNombre() + " y la direccion es " + totalPaquete.getDireccion());
            
        }
        return contador;
    }
    
    Connection conexion = null;
public void setConexion() {

        // Establecer la conexión con la base de datos
        String url = "jdbc:postgresql://25.4.143.235:5432/TecnicasProgramacion";
        String usuario = "postgres";
        String contraseña = "root";

        try {

            if (conexion == null) {

                conexion = DriverManager.getConnection(url, usuario, contraseña);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
}
