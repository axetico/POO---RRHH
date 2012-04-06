/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.*;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;
import javax.swing.text.*;

public class Fecha {

public GregorianCalendar gc1,gc2,gcSistema;
public Date f1,f2,fs,sis,hora;
public SimpleDateFormat sdf,sdf2;

//constructor
public Fecha(){
	sis =new Date();
	sdf =new SimpleDateFormat("dd/MM/yyyy");

	hora =new Date();
	sdf2 =new SimpleDateFormat("hh:mm:ss");	
}

// numero de dias entre fecha 1 y fecha 2
public long tiempoFechas(){;
	long tiempo=(f1.getTime()-f2.getTime())/(3600*24*1000);
if(tiempo<0)
  return  tiempo*-1;
else
  return tiempo;}

// Validando Fechas 
public int validarFechas(){
	int d,m,a;
	StringTokenizer st=new StringTokenizer(sdf.format(sis),"/");
	d=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());
	a=Integer.parseInt(st.nextToken());
	gcSistema =new GregorianCalendar(a,m,d);
	fs=gcSistema.getTime();
	// la fecha de Salida es menor a la del Sistema
	if(f1.getTime()<fs.getTime())
	   return -1;
	// la fecha de Retorno es menor o igual a la fecha de salida   
	if(f2.getTime()<=f1.getTime())  
	   return -2;
return 0;}

//Fecha de salida y de retorno
public void fechas(String fecha,int f){
	int d,m,a;
    StringTokenizer st=new StringTokenizer(fecha,"/");	
	d=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());
	a=Integer.parseInt(st.nextToken());
	if(f==1){
	   gc1 = new GregorianCalendar(a,m,d);	
	   f1 =gc1.getTime();}
    else{
       gc2 = new GregorianCalendar(a,m,d);	
	   f2 =gc2.getTime();}
}

// Fecha de sistema
public String getFecha(){
return sdf.format(sis);}

// Hora del sistema
public String getHora(){
return sdf2.format(hora);}

}





