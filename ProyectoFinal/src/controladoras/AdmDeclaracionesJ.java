/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import modelos.*;
/**
 *
 * @author CARLOS
 */
public class AdmDeclaracionesJ {
     private ArrayList<DeclaracionesJ> d;
    // constructor
     public AdmDeclaracionesJ(){
     d = new ArrayList<DeclaracionesJ>();	
     cargar();
     }
      // get
public DeclaracionesJ get(int i){
return d.get(i);	
}

// tamaño del arreglo declaraciones juradas
public int tam(){
return d.size();}


// ingresar datos de declaraciones juradas
public void ingresar(String responsable, String cargo, String fReferencia, String fVencimiento, String comentario, String fDocumento, String nDocumento){
d.add(new DeclaracionesJ(responsable, cargo,fReferencia,fVencimiento,comentario,fDocumento,nDocumento));
grabar();
}

//buscar empleado por responsable
public int buscar(String responsable){
for(int i=0;i<tam();i++)
 if(responsable.equals(d.get(i).getResponsable()))
    return i;
return -1;}

// eliminar por responsable
public void eliminar(String responsable){	
d.remove(buscar(responsable));
grabar();}


// cargar archivo declaraciones juradas
public void cargar(){
try{
int cod=0,cat=0;
String linea,responsable="",cargo="",fReferencia="",fVencimiento="",comentario="",fDocumento="",nDocumento="";
BufferedReader br=new BufferedReader(new FileReader("declaracion.txt"));	
while((linea=br.readLine())!=null){
  StringTokenizer st= new StringTokenizer(linea,",");	
  responsable=st.nextToken();
  cargo=st.nextToken();
  fReferencia=st.nextToken();
  fVencimiento=st.nextToken();
  comentario=st.nextToken();
  fDocumento=st.nextToken();
  nDocumento=st.nextToken();
  
  cat=Integer.parseInt(st.nextToken());
  d.add(new DeclaracionesJ(responsable,cargo,fReferencia,fVencimiento,comentario,fDocumento,nDocumento));}
br.close();}
catch(Exception ex){}
}
// grabar archivo declaraciones juradas
public void grabar(){
try{
PrintWriter pw= new PrintWriter("declaracion.txt");
for(int i=0;i<tam();i++){
    DeclaracionesJ x=get(i);
    pw.println(x.getResponsable()+","+x.getCargo()+","+x.getfReferencia()+","+x.getfVencimiento()+","+
           x.getComentario()+","+x.getfDocumento()+","+x.getnDocumento());	
}
pw.close();}
catch(Exception ex){}	
}	

}
