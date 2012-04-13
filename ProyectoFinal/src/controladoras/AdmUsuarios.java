
package controladoras;


import javax.swing.*;
import java.util.ArrayList;
import modelos.*;
import java.io.*;
import java.util.StringTokenizer;

public class AdmUsuarios implements Serializable{
      
    ArrayList usuarios = new ArrayList();
    
    private ArrayList<Usuario> dbUsuarios=new ArrayList<Usuario>();
    private void simularTabla(){
        this.dbUsuarios.add(new Usuario(1001,"Carlos","vera","villanueva","41713326","carlosvera2004@hotmail.com","12/04/2012","chaler2010","car123","car123","Empleado","usuario"));
        this.dbUsuarios.add(new Usuario(1001,"Luis","Perez","Suarez","41713327","lperez@hotmail.com","15/04/2012","luis2010","lu123","lu123","Empleado","administrador"));
         
    }
    String rutaArchivo = "Usuario.txt";

    public void agregarUsuario(Usuario usa) {
        usuarios.add(usa);
    }

    public void agregarUsuario(int pos, Usuario usa) {
        usuarios.add(pos, usa);
    }

    public void eliminarUsuario(int index) {
        usuarios.remove(index);
    }

    public void cargarArchivo() throws Exception {
        try {
            File LinkFile = new File(rutaArchivo); //crea el archivo
            //si ya existe el archivo lo borra y lo vuelve a crear
            if (LinkFile.exists()) {
                LinkFile.delete();
                LinkFile.createNewFile();
            }
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            escr.writeObject(usuarios);
            escr.close();
        } catch (IOException e) {
            throw new IOException("Error al cargar archivo " + e);
        }
    }

    public void cargarUsuarios() {
        try {
            File LinkFile = new File(rutaArchivo);
            //verifica que el archivo exista
            if (LinkFile.exists()) {

                ObjectInputStream lect = new ObjectInputStream(new FileInputStream(rutaArchivo));
                Object obj = null;
                obj = lect.readObject();
                usuarios.clear();
                usuarios = (ArrayList) obj;
                lect.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo " + e, "Error al cargar los Empleados", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println(rutaArchivo);
        }
    }

    public Usuario buscarUsuario(int codigoComparar) {
        for (int i = 0; i < this.usuarios.size(); i++) {
            Usuario e = new Usuario();
            e = (Usuario) this.usuarios.get(i);
            if (codigoComparar == e.getCodigoUsuario()) {
                return e;
            }
        }
        return null;
    }

    public int buscarPosUsuario(int codigoComparar) {
        for (int i = 0; i < this.usuarios.size(); i++) {
            Usuario e = new Usuario();
            e = (Usuario) this.usuarios.get(i);
            if (codigoComparar == e.getCodigoUsuario()) {
                return i;
            }
        }
        return -1;
    }

    public int generarSecuenciaCodigo() {
        int secuencia = this.usuarios.size() + 1;
        while (existeCodigoUsuario(secuencia)) {
            secuencia++;
        }
        return secuencia;
    }

    public boolean existeCodigoUsuario(int codigoComparar) {
        for (int i = 0; i < this.usuarios.size(); i++) {
            Usuario e = new Usuario();
            e = (Usuario) this.usuarios.get(i);
            if (codigoComparar == e.getCodigoUsuario()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList getListaUsuarios() {
        return usuarios;
    }
    public boolean verificarUsuario(String user){
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
    
    public Usuario existeUsuario(String userName){
        simularTabla();
        Usuario usuarioEncontrado=null;
        for(Usuario usuario:dbUsuarios){
          if(usuario.getUserName().equals(userName))
              usuarioEncontrado=usuario;
    }
        return usuarioEncontrado;
    }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Usuario usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
    
   
}
    
