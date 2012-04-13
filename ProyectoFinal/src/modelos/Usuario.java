/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Usuario implements java.io.Serializable{
    int CodigoUsuario;
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

    public Usuario(int codigoUsuario,String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        CodigoUsuario=codigoUsuario;
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
    
    public Usuario() {
        super();
    }

    public int getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(int CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
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

   public void mostrar() {
        System.out.println(this.getCodigoUsuario());
        System.out.println(this.getNombre());
        System.out.println(this.getApellidoPaterno());
        System.out.println(this.getApellidoMaterno());
        System.out.println(this.getDni());
        System.out.println(this.getCorreoE());
        System.out.println(this.getFechaIngreso());
        System.out.println(this.getUserName());
        System.out.println(this.getPassWord());
        System.out.println(this.getConfpassWord());
        System.out.println(this.getCargo());
        System.out.println(this.getRol());




    }

    //public abstract double CalcularIngreo();  
}
    
