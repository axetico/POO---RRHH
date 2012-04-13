/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;


import org.junit.Test;
import static org.junit.Assert.*;

public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios=new AdmUsuarios();
    
    @Test
    
    public void siNoIngresoElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacio");
    }
    @Test
    public void siIngresoElUsuarioDebeAceptarlo(){
        assertTrue(admUsuarios.verificarUsuario("Carlos"));
        System.out.println("Usuario Ingresado");
    }
    
    @Test
    public void siNoIngresaPasswordUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarPassword(null));
        System.out.println("Password no debe estar vacio");
    }
    @Test
    
     public void siIngresoPasswordDebeAceptarlo(){
        assertTrue(admUsuarios.verificarPassword("car123"));
        System.out.println("Password Ingresado");
    
}
    @Test
    
    public void siElUsuarioNoExisteDebeMandarMensaje(){
        assertNull(admUsuarios.existeUsuario("c123"));
        System.out.println("Usuario Inexistente");
       
    }
    
    @Test
    
    public void siElUsuarioExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existeUsuario("chaler2010"));
        System.out.println("Usuario existente");
    }
    
    @Test
    
    public void siElPasswordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("chaler2010","car123"));
         System.out.println("Acceso Aceptado");
    }
    
    @Test
    
    public void siElPasswordNoEsValidoNoDebeDarmeAceeso(){
        assertFalse(admUsuarios.validarPassword("chaler2010","car125"));
         System.out.println("Acceso Denegado");
    }
}