/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.*;
import java.util.StringTokenizer;
import java.io.*;

public class AdmRoles {
     private ArrayList<Roles> r;
    // constructor
     public AdmRoles(){
     r= new ArrayList<Roles>();	
     cargar();
     }
     
     public Roles get(int i){
return r.get(i);	
}

// tamaño del arreglo de tareas generales
public int tam(){
return r.size();}


// ingresar datos de roles
public void ingresar(String nombre, String descripcion){
r.add(new Roles(nombre,descripcion));
grabar();
}

//buscar responsable por nombre
public int buscar(String nombre){
for(int i=0;i<tam();i++)
 if(nombre.equals(r.get(i).getNombre()))
    return i;
return -1;}

// eliminar por nombre
public void eliminar(String nombre){	
r.remove(buscar(nombre));
grabar();}


// cargar archivo tareas generales
public void cargar(){
try{

String linea="",nombre="",descripcion="";

BufferedReader br=new BufferedReader(new FileReader("rol.txt"));	
while((linea=br.readLine())!=null){
  StringTokenizer st= new StringTokenizer(linea,",");	
  nombre=st.nextToken();
  descripcion=st.nextToken();
  
  
  r.add(new Roles(nombre,descripcion));}
br.close();}
catch(Exception ex){}
}
// grabar archivo
public void grabar(){
try{
PrintWriter pw= new PrintWriter("rol.txt");
for(int i=0;i<tam();i++){
    Roles x=get(i);
    pw.println(x.getNombre()+","+x.getDescripcion());	
}
pw.close();}
catch(Exception ex){}	
}	

     
}
