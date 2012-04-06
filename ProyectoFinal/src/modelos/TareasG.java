/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class TareasG {
    private String asunto;
    private String FechaV;
    private String responsable;
    private String comentario;

    public TareasG(String asunto, String FechaV, String responsable, String comentario) {
        this.asunto = asunto;
        this.FechaV = FechaV;
        this.responsable = responsable;
        this.comentario = comentario;
    }

    public String getFechaV() {
        return FechaV;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public String getResponsable() {
        return responsable;
    }
    
    
    
    
}
