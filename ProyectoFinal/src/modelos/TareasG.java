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
    private String fVencimiento;
    private String responsable;
    private String comentario;

    public TareasG(String asunto, String fVencimiento, String responsable, String comentario) {
        this.asunto = asunto;
        this.fVencimiento = fVencimiento;
        this.responsable = responsable;
        this.comentario = comentario;
    }

    public String getfVencimiento() {
        return fVencimiento;
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
