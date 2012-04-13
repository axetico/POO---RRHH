
package modelos;


public class Persona {
    String Nombre;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String Dni;
    String CorreoE;
    String FechaIngreso;
    String UserName;
    String PassWord;
    String ConfpassWord;
    String Cargo;
    String Rol;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        Nombre = nombre;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        Dni = dni;
        CorreoE = correoE;
        FechaIngreso = fechaIngreso;
        UserName = userName;
        PassWord = passWord;
        ConfpassWord = confpassWord;
        Cargo = cargo;
        Rol = rol;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getConfpassWord() {
        return ConfpassWord;
    }

    public void setConfpassWord(String confpassWord) {
        ConfpassWord = confpassWord;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String correoE) {
        CorreoE = correoE;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

   
    
}
