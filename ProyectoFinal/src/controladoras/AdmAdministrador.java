/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;
import modelos.*;

public class AdmAdministrador{
    
    private ArrayList<Administrador> dbAdministrador;
    
    public AdmAdministrador(){
    dbAdministrador=new ArrayList<Administrador>();	
    cargar();

}
    
    
    private void simularTabla(){
        this.dbAdministrador.add(new Administrador("Carlos","Vera","Villanueva","41713326","carlosvera2004@hotmail.com","25/03/2012","cvera","car123","car123","administrador","RRHH"));
        this.dbAdministrador.add(new Administrador("Grace","Navarro","Galarza","43456678","gnavarro@hotmail.com","12/02/2012","gnavarro","g123","g123","administrador","logistica"));
         
         
    }
    // tamaño
public int tam(){
return dbAdministrador.size();}

// get
public Administrador get(int i){
return dbAdministrador.get(i);}

// ingresar administradores
public void ingresar(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol){	
dbAdministrador.add(new Administrador(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));
grabar();}

//buscar por dni
public int buscar(String dni){
for(int i=0;i<tam();i++)
 if(dni.equals(dbAdministrador.get(i).getDni()))
    return i;
return -1;}

// eliminar por dni
public void eliminar(String dni){	
dbAdministrador.remove(buscar(dni));
grabar();}

// cargar administradores en un txt
public void cargar(){
try{
String linea,nombre="",apellidoPaterno="",apellidoMaterno="",dni="",correoE="",fechaIngreso="",userName="",passWord="",confpassWord="",cargo="",rol="";

BufferedReader br= new BufferedReader(new FileReader("administrador.txt"));
while((linea=br.readLine())!=null){
  StringTokenizer st= new StringTokenizer(linea,",");
  nombre=st.nextToken();
  apellidoPaterno=st.nextToken();
  apellidoMaterno=st.nextToken();
  dni=st.nextToken();
  correoE=st.nextToken();
  fechaIngreso=st.nextToken();
  userName=st.nextToken();
  passWord=st.nextToken();
  confpassWord=st.nextToken();
  cargo=st.nextToken();
  rol=st.nextToken();
  dbAdministrador.add(new Administrador(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));}
br.close();}
catch(Exception ex){}
}

// grabar
public void grabar(){
try{
PrintWriter pw=new PrintWriter(new FileWriter("administrador.txt"));
for(int i=0;i<tam();i++){
    Administrador x=get(i);
   pw.println(x.getNombre()+","+x.getApellidoPaterno()+","+x.getApellidoMaterno()+","+x.getDni()+","+
           x.getCorreoE()+","+x.getFechaIngreso()+","+x.getUserName()+","+x.getPassWord()+","+x.getConfpassWord()+","+x.getCargo()+","+x.getRol());	
}
pw.close();}
catch(Exception ex){}	
}


    
    public boolean verificarEmpleado(String user){
        if(user!=null){
            return true;
        }
           return false;
    }
    public boolean verificarPassword(String user){
        if(user!=null){
            return true;
        }
          return false;
    }
    
    public Administrador existeUsuario(String userName){
        simularTabla();
        Administrador usuarioEncontrado=null;
        for(Administrador empleado:dbAdministrador){
          if(empleado.getUserName().equals(userName))
              usuarioEncontrado=empleado;
    }
        return usuarioEncontrado;
    }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Administrador usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
    
    
}
