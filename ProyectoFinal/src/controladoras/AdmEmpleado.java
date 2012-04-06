/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.*;
import java.io.*;
import java.util.StringTokenizer;


/**
 *
 * @author CARLOS
 */
public class AdmEmpleado {

    
    private ArrayList<Empleado> dbEmpleados;
    // constructor
     public AdmEmpleado(){
     dbEmpleados = new ArrayList<Empleado>();	
     cargar();
     }
   
    private void simularTabla(){
        this.dbEmpleados.add(new Empleado("Luis","Cabrera","Hernandez","41713324","lcabrera@hotmail.com","25/03/2012","lcabrera","lu123","lu123","empleado","RRHH"));
        this.dbEmpleados.add(new Empleado("Paul","Rodriguez","Suarez","43456328","prodriguez@hotmail.com","12/02/2012","prodriguez","p123","p123","empleado","logistica"));
             
    }
    
    // get
public Empleado get(int i){
return dbEmpleados.get(i);	
}

// tamaño del arreglo Empleados
public int tam(){
return dbEmpleados.size();}


// ingresar datos de Empleados
public void ingresar(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol){
dbEmpleados.add(new Empleado(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));
grabar();
}

//buscar empleado por dni
public int buscar(String dni){
for(int i=0;i<tam();i++)
 if(dni.equals(dbEmpleados.get(i).getDni()))
    return i;
return -1;}

// eliminar por dni
public void eliminar(String dni){	
dbEmpleados.remove(buscar(dni));
grabar();}

//editar por dni

public void editar(String dni){	

grabar();}

// cargar archivo empleado
public void cargar(){
try{

String linea,nombre="",apellidoPaterno="",apellidoMaterno="",dni="",correoE="",fechaIngreso="",userName="",passWord="",confpassWord="",cargo="",rol="";
BufferedReader br=new BufferedReader(new FileReader("empleados.txt"));	
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
 
  dbEmpleados.add(new Empleado(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol));}
br.close();}
catch(Exception ex){}
}
// grabar archivo
public void grabar(){
try{
PrintWriter pw= new PrintWriter("empleados.txt");
for(int i=0;i<tam();i++){
    Empleado x=get(i);
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
    
    public Empleado existeUsuario(String userName){
        simularTabla();
        Empleado usuarioEncontrado=null;
        for(Empleado empleado:dbEmpleados){
          if(empleado.getUserName().equals(userName))
              usuarioEncontrado=empleado;
    }
        return usuarioEncontrado;
    }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Empleado usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
    
    private String generarPassWord(){
        String password ="";
        for(int x=0;x<8;x++){
            int y=(int)(2*Math.random());
            switch(y){
                case 0:password+=(int)(10*Math.random());break;
                default:password+=(char)((122-97+1))*Math.random()+97;
            }
        }
        return password;
}
    
}