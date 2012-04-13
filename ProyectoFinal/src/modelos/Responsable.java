/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Responsable extends Usuario{

    public Responsable() {
    }

    public Responsable(int codigoUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        super(codigoUsuario, nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol);
    }
    
    public Responsable(Usuario usua) {
        super(usua.getCodigoUsuario(), usua.getNombre(), usua.getApellidoPaterno(), usua.getApellidoMaterno(),usua.getDni(),usua.getCorreoE(),usua.getFechaIngreso(),usua.getUserName(),usua.getPassWord(),usua.getConfpassWord(),usua.getCargo(),usua.getRol());
        
    }
   
}
