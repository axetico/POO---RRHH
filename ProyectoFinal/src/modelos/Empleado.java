
package modelos;



public class Empleado extends Usuario{

    public Empleado() {
    }
    

    public Empleado(int codigoUsuario,String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        super(codigoUsuario,nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol);
    }

    public Empleado(Usuario usua) {
        super(usua.getCodigoUsuario(), usua.getNombre(), usua.getApellidoPaterno(), usua.getApellidoMaterno(),usua.getDni(),usua.getCorreoE(),usua.getFechaIngreso(),usua.getUserName(),usua.getPassWord(),usua.getConfpassWord(),usua.getCargo(),usua.getRol());
    }

    
    
    
        
    
    
    
    
}
 
