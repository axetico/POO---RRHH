/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

public class Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;
    private Usuario[] usuarios;
    private int nElementos;

    public Usuarios() {
        // Crea el array
        nElementos = 0;
        usuarios = inicializar(nElementos);
    }

    private Usuario[] inicializar(int nElementos) {
        try {
            return new Usuario[nElementos];
        } catch (OutOfMemoryError e) {
            System.out.println(e.toString());
            return usuarios;
        }
    }

    public Usuario elemento(int i) {
        if (i >= 0 && i < nElementos) {
            return usuarios[i];
        } else {
            System.out.println("No hay elementos en esa posici�n");
            return null;
        }
    }

    public int longitud() {
        return usuarios.length;
    }

    public void agregar(Usuario unUsuario) {
        Usuario[] copiaDeLista;

        //el array crece conforme se le van anadiendo nuevos elementos 
        copiaDeLista = usuarios;
        nElementos = copiaDeLista.length;
        usuarios = inicializar(nElementos + 1);
        for (int i = 0; i < nElementos; i++) {
            usuarios[i] = copiaDeLista[i];
        }
        usuarios[nElementos] = unUsuario;
        nElementos++;
    }

    public boolean eliminar(int cod) {
        Usuario[] copiaDeLista;
        int posi = buscar(cod);
        if (posi != -1) { // el array disminuye cuando se eliminan elementos
            usuarios[posi] = null;
            copiaDeLista = usuarios;
            if (copiaDeLista.length != 0) {
                nElementos = copiaDeLista.length;
                usuarios = inicializar(nElementos - 1);
                for (int i = 0; i < nElementos; i++) {
                    if (copiaDeLista[i] != null) {
                        usuarios[i] = copiaDeLista[i];
                    }
                }
                nElementos--;
                return true;
            }
        }
        return false;
    }

    public int buscar(int cod) {
        int posi = -1;
        for (int i = 0; i < nElementos; i++) {
             if (usuarios[i].getCodigoUsuario() == cod) {
                posi = i;
            }
        }
        return posi;
    }
}

