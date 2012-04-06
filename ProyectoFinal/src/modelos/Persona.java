
package modelos;


public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String dni;
    String correoE;
    String fechaIngreso;
    String userName;
    String passWord;
    String confpassWord;
    String cargo;
    String rol;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.correoE = correoE;
        this.fechaIngreso = fechaIngreso;
        this.userName = userName;
        this.passWord = passWord;
        this.confpassWord = confpassWord;
        this.cargo = cargo;
        this.rol = rol;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public String getConfpassWord() {
        return confpassWord;
    }

    public String getCorreoE() {
        return correoE;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRol() {
        return rol;
    }

    public String getUserName() {
        return userName;
    }
  
    
}
