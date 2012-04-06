/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import modelos.*;

public class AdmCartaFianza {
    
    private ArrayList<cartaFianza> c;
    // constructor
     public AdmCartaFianza(){
     c = new ArrayList<cartaFianza>();	
     cargar();
     }
     
public cartaFianza get(int i){
return c.get(i);	
}

// tamaño del arreglo de Carta Fianza
public int tam(){
return c.size();}


// ingresar datos de Carta Fianza
public void ingresar(int numeroCarta, int numeroContrato, int numeroProceso, String banco, String tipo, String proveedor, String fVencimiento, String responsable, String comentario){
c.add(new cartaFianza(numeroCarta,numeroContrato,numeroProceso,banco,tipo,proveedor,fVencimiento,responsable,comentario));
grabar();
}

//buscar responsable en carta Fianza
public int buscar(String responsable){
for(int i=0;i<tam();i++)
 if(responsable.equals(c.get(i).getResponsable()))
    return i;
return -1;}

// eliminar por responsable
public void eliminar(String responsable){	
c.remove(buscar(responsable));
grabar();}


// cargar archivo carta fianza
public void cargar(){
try{

String linea="",banco="",tipo="",proveedor="",fVencimiento="",responsable="",comentario="";
int numeroCarta=0,numeroContrato=0,numeroProceso=0;
BufferedReader br=new BufferedReader(new FileReader("carta.txt"));	
while((linea=br.readLine())!=null){
  StringTokenizer st= new StringTokenizer(linea,",");	
  numeroCarta=Integer.parseInt(st.nextToken());
  numeroContrato=Integer.parseInt(st.nextToken());
  numeroProceso=Integer.parseInt(st.nextToken());
  banco=st.nextToken();
  tipo=st.nextToken();
  proveedor=st.nextToken();
  fVencimiento=st.nextToken();
  responsable=st.nextToken();
  comentario=st.nextToken();
  
 
  c.add(new cartaFianza(numeroCarta,numeroContrato,numeroProceso,banco,tipo,proveedor,fVencimiento,responsable,comentario));}
br.close();}
catch(Exception ex){}
}
// grabar archivo
public void grabar(){
try{
PrintWriter pw= new PrintWriter("declaracion.txt");
for(int i=0;i<tam();i++){
    cartaFianza x=get(i);
    pw.println(x.getNumeroCarta()+","+x.getNumeroContrato()+","+x.getNumeroProceso()+","+x.getBanco()+","+
           x.getTipo()+","+x.getProveedor()+","+x.getfVencimiento()+","+x.getResponsable()+","+x.getBanco());	
}
pw.close();}
catch(Exception ex){}	
}	

}


