/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.*;
import java.util.StringTokenizer;
import java.io.*;

public class AdmTareasG {
    private ArrayList<TareasG> t;
    // constructor
     public AdmTareasG(){
     t= new ArrayList<TareasG>();	
     cargar();
     }
     
     public TareasG get(int i){
return t.get(i);	
}

// tamaño del arreglo de tareas generales
public int tam(){
return t.size();}


// ingresar datos de Tareas Generales
public void ingresar(String asunto, String fVencimiento, String responsable, String comentario){
t.add(new TareasG(asunto,fVencimiento,responsable,comentario));
grabar();
}

//buscar responsable en tareas Generales
public int buscar(String responsable){
for(int i=0;i<tam();i++)
 if(responsable.equals(t.get(i).getResponsable()))
    return i;
return -1;}

// eliminar por responsable
public void eliminar(String responsable){	
t.remove(buscar(responsable));
grabar();}


// cargar archivo tareas generales
public void cargar(){
try{

String linea="",asunto="",fVencimiento="",responsable="",comentario="";

BufferedReader br=new BufferedReader(new FileReader("tarea.txt"));	
while((linea=br.readLine())!=null){
  StringTokenizer st= new StringTokenizer(linea,",");	
  asunto=st.nextToken();
  fVencimiento=st.nextToken();
  responsable=st.nextToken();
  comentario=st.nextToken();
  
  t.add(new TareasG(asunto,fVencimiento,responsable,comentario));}
br.close();}
catch(Exception ex){}
}
// grabar archivo
public void grabar(){
try{
PrintWriter pw= new PrintWriter("tarea.txt");
for(int i=0;i<tam();i++){
    TareasG x=get(i);
    pw.println(x.getAsunto()+","+x.getfVencimiento()+","+x.getResponsable()+","+x.getComentario());	
}
pw.close();}
catch(Exception ex){}	
}	

}



