
package login;
import java.io.*;
import modelos.*;

public class AdmUsuarios {
    
   static Usuarios lista = null;
    //si la lista sufre cambios se escribe en el discoASWS
    static boolean cambios;

    public static void main(String[] args) {
        leer();
        operaciones();
        escribir();
    }

    public static void leer() {
        ObjectInputStream ois = null;
        try {    /* Creaci�n considera dos casos si el archivo existe previamente
            o no */
            File fichero = new File("empresa.txt");
            if (!fichero.exists()) {
                lista = new Usuarios();
                System.out.println("Nuevo archivo");
            } else {
                ois = new ObjectInputStream(new FileInputStream("empresa.txt"));
                lista = (Usuarios) ois.readObject();
                System.out.println("Archivo existente");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public static void operaciones() {
        short opcion = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int posi = -1;
        int codigo = 0;
        // short edad = 0;
        String nombre = null;
        String apellidoMaterno=null;
        String apellidoPaterno=null;
        String dni=null;
        String correoE=null;
        String fechaIngreso=null;
        String userName=null;
        String passWord=null;
        String confpassWord=null;
        String cargo=null;
        String rol=null;
        
        boolean eliminado = false;
        boolean error;

        // Mantenimiento
        try {
            do {
                System.out.println("MENu");
                System.out.println("1. Ingresar Usuario");
                System.out.println("2. Eliminar Usuario");
                System.out.println("3. Buscar por codigo");
                System.out.println("4. Salir");
                System.out.println();
                System.out.print("Elija opcion: ");
                do {
                    opcion = Short.parseShort(new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
                } while (opcion < 1 || opcion > 4);
                switch (opcion) {
                    /* Con el fin de simplificar el ejemplo, se supone que no se 
                    introducen c�digos repetidos */
                    case 1: // Ingresar Usuarios
            /* la excepci�n para que vuelva a pedir el dato 
                        en el caso de que se introduzca un valor no num�rico */
                        do {
                            error = false;
                            try {
                                System.out.print("codigo:    ");
                                codigo= Integer.parseInt(br.readLine());
                            // codigo = Short.parseShort(br.readLine());
                            } catch (NumberFormatException ne) {
                                System.out.println("Valor no valido" +
                                        " (ha de ser un numero)");
                                error = true;
                            }
                        } while (error);
                        System.out.print("nombre:    ");
                        nombre = br.readLine();
                       
                        
                        System.out.print("apellidoPaterno:      ");
                        apellidoPaterno = br.readLine();
                           
                        
                         System.out.print("apellidoMaterno:      ");
                         apellidoMaterno = br.readLine();
                            
                        
                         System.out.print("Dni:      ");
                         dni = br.readLine();
                            
                        
                        
                          System.out.print("Correo:      ");
                          correoE = br.readLine();
                            
                        
                        
                          System.out.print("fechaIngreso:      ");
                          fechaIngreso = br.readLine();
                            
                       
                          System.out.print("userName:      ");
                          userName = br.readLine();
                            
                        
                          System.out.print("Password:      ");
                          passWord = br.readLine();
                            
                        
                          System.out.print("Confirmar Password:      ");
                          confpassWord = br.readLine();
                           
                        
                        
                          System.out.print("Cargo:      ");
                          cargo = br.readLine();
                            
                        
                          System.out.print("Rol:      ");
                          rol = br.readLine();
                            
                       

                        lista.agregar(new Usuario(codigo,nombre,apellidoPaterno,apellidoMaterno,dni,correoE,fechaIngreso,userName,passWord,confpassWord,cargo,rol));
                        cambios = true;
                        break;
                    case 2: // Eliminar Usuario
                        do {
                            error = false;
                            try {
                                System.out.print("Codigo de usuario : ");
                                codigo = Short.parseShort(br.readLine());
                            } catch (NumberFormatException ne) {
                                System.out.println("Valor no v�lido" +
                                        " (ha de ser un n�mero)");
                                error = true;
                            }
                        } while (error);
                        eliminado = lista.eliminar(codigo);
                        if (eliminado) {
                            System.out.println("Registro eliminado");
                            cambios = true;
                        } else if (lista.longitud() != 0) {
                            System.out.println("No esta");
                        } else {
                            System.out.println("No existen usuarios registrados");
                        }
                        break;
                    case 3: // consultas
                        do {
                            error = false;
                            try {
                                System.out.print("Introduzca el codigo a buscar ");
                                codigo = Short.parseShort(br.readLine());
                            } catch (NumberFormatException ne) {
                                System.out.println("Valor no valido" +
                                        " (ha de ser un numero)");
                                error = true;
                            }
                        } while (error);
                        posi = lista.buscar(codigo);
                        if (posi == -1) {
                            if (lista.longitud() != 0) {
                                System.out.println("Registro no encontrado");
                            } else {
                                System.out.println("No existen usuarios registrados");
                            }
                        } else {
                            lista.elemento(posi).mostrar();
                        }
                        break;
                    case 4:
                }
            } while (opcion != 4);
        } catch (IOException e) {
        }
    }

    public static void escribir() {
        ObjectOutputStream ous = null;
        //si hubo cambios los escribe en el archivo
        try {
            if (cambios) {
                ous = new ObjectOutputStream(new FileOutputStream("empresa.txt"));
                ous.writeObject(lista);
            }
            lista = null;
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                if (ous != null) {
                    ous.close();
                }
            } catch (IOException e) {
            }
        }
    }
}

      
        
     
      
    
    
