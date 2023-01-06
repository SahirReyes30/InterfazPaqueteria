/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author aspr
 */
public class ListaPaquetes {
   
    ArrayList<Paquete>listaPaquetes  = new ArrayList<>();
   
    public ListaPaquetes() {
        
        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }
    }
    
    public boolean agregarPaquetes(Paquete paquete){
    setConexion();
        try {

            // Insertar el nombre del destinatario y direccion en la base de datos
            String sql = "INSERT INTO PAQUETES (destinatario,direccion) values (?,?)";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, paquete.getNombre());
            st.setString(2, paquete.getDireccion());
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
              return true;
            } else {
              return false;
            }


        }
        catch (SQLException e) {

            e.printStackTrace();
            return false;

        }
    
    }
public ArrayList<Paquete> obtenerPaquetes(){
  setConexion();
  ArrayList<Paquete> paquetes = new ArrayList<>();
        try {
            
            // Recuperar el usuario y contrasena
            String sql = "SELECT * FROM paquetes";
            PreparedStatement st = conexion.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            if(!rs.next()) {
                return paquetes;
            }
            while (rs.next()) {
                Paquete paquete = new Paquete(rs.getString("destinatario"), rs.getString("direccion"));
                paquetes.add(paquete);
            }
            return paquetes;

        }
        catch (SQLException e) {

            e.printStackTrace();
            return paquetes;

        }
    
    
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

