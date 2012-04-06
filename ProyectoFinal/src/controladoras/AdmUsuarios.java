
package controladoras;

import java.util.ArrayList;
import modelos.*;
import java.io.*;
import java.util.StringTokenizer;

public class AdmUsuarios {
    
    
    
    private ArrayList<Usuario> dbUsuarios;
    
    
    // constructor
     public AdmUsuarios(){
     dbUsuarios = new ArrayList<Usuario>();	
     cargar();
     }
    
    private void simularTabla(){
        this.dbUsuarios.add(new Usuario("Carlos","Vera","Villanueva","41713326","carlosvera2004@hotmail.com","25/03/2012","cvera","car123","car123","administrador","RRHH"));
        this.dbUsuarios.add(new Usuario("Grace","Navarro","Galarza","43456678","gnavarro@hotmail.com","12/02/2012","gnavarro","g123","g123","empleado","logistica"));
         
         
    }
    
     // get
public Usuario get(int i){
return dbUsuarios.get(i);	
}

// tamaño del arreglo Usuarios
public int tam(){
return dbUsuarios.size();}


// ingresar datos de Usuarios
public void ingresar(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol){
dbUsuarios.add(new Usuario(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));
grabar();
}

//buscar empleado por dni
public int buscar(String dni){
for(int i=0;i<tam();i++)
 if(dni.equals(dbUsuarios.get(i).getDni()))
    return i;
return -1;}

// eliminar por dni
public void eliminar(String dni){	
dbUsuarios.remove(buscar(dni));
grabar();}

//editar por dni

public void editar(String dni){	

grabar();}

// cargar archivo Usuario
public void cargar(){
try{

String linea,nombre="",apellidoPaterno="",apellidoMaterno="",dni="",correoE="",fechaIngreso="",userName="",passWord="",confpassWord="",cargo="",rol="";
BufferedReader br=new BufferedReader(new FileReader("usuarios.txt"));	
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
  
  dbUsuarios.add(new Usuario(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));}
br.close();}
catch(Exception ex){}
}
// grabar archivo
public void grabar(){
try{
PrintWriter pw= new PrintWriter("usuarios.txt");
for(int i=0;i<tam();i++){
    Usuario x=get(i);
    pw.println(x.getNombre()+","+x.getApellidoPaterno()+","+x.getApellidoMaterno()+","+x.getDni()+","+
           x.getCorreoE()+","+x.getFechaIngreso()+","+x.getUserName()+","+x.getPassWord()+","+x.getConfpassWord()+","+x.getCargo()+","+x.getRol());	
}
pw.close();}
catch(Exception ex){}	

}	
    
    public boolean verificarUsuario(String user){
        if(user!=null){
            return true;
        }
          return false;
    }
    
    public boolean verificarPassword(String password){
        if(password!=null){
            return true;
        }
        return false;
    }
    
    public Persona existeUsuario(String userName){
        simularTabla();
        Persona usuarioEncontrado=null;
        for(Persona usuario:dbUsuarios){
            if(usuario.getUserName().equals(userName))
               usuarioEncontrado=usuario;         
         } 
            return usuarioEncontrado;      
     }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Persona usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
}