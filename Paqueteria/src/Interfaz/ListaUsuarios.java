/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.sql.*;


public class ListaUsuarios {

    public ListaUsuarios() {
        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }
    }
    
    public boolean obtenerUsuarios(Usuario usuario){
        setConexion();
        try {

            // Recuperar el usuario y contrasena
            String sql = "SELECT * FROM usuarios where usuario = ? and contrasena = ? and acceso = ?";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, usuario.getUsuario());
            st.setString(2, usuario.getContraseña());
            st.setInt(3, usuario.getTipoDeAcess());
            ResultSet rs = st.executeQuery();
            if(!rs.next()) {
                
                return false;
            }
            return true; 

        }
        catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
            return false;

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
