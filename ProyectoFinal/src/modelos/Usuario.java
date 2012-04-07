/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Usuario extends Persona{

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol);
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setConfpassWord(String confpassWord) {
        this.confpassWord = confpassWord;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
