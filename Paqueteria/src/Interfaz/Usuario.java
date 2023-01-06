/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.List;
import java.util.ArrayList;


public class Usuario {
    private String usuario;
    private String contraseña;

    
    private ListaUsuarios listaUsuarios;
    private int tipoDeAcess;
    public Usuario(String usuario, String contraseña,int tipoDeAcess) {
        this.usuario=usuario;
        this.contraseña=contraseña;
        listaUsuarios = new ListaUsuarios();
        this.tipoDeAcess= tipoDeAcess;
    }
    
    public boolean autentificar(){
        
        return listaUsuarios.obtenerUsuarios(this);
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int getTipoDeAcess() {
        return tipoDeAcess;
    }

    public void setTipoDeAcess(int tipoDeAcess) {
        this.tipoDeAcess = tipoDeAcess;
    }
}
