
package modelos;


public class DeclaracionesJ {
   private String responsable;
   private String cargo;
   private String fAsumpcion;
   private String fReferencia;
   private String fVencimiento;
   private String comentario;
   private String fDocumento;
   private String nDocumento;

    public DeclaracionesJ(String responsable, String cargo, String fReferencia, String fVencimiento, String comentario, String fDocumento, String nDocumento) {
        this.responsable = responsable;
        this.cargo = cargo;
        this.fReferencia = fReferencia;
        this.fVencimiento = fVencimiento;
        this.comentario = comentario;
        this.fDocumento = fDocumento;
        this.nDocumento = nDocumento;
    }

    public DeclaracionesJ() {
    }
    

    public String getCargo() {
        return cargo;
    }

    public String getComentario() {
        return comentario;
    }

    public String getfAsumpcion() {
        return fAsumpcion;
    }

    public String getfDocumento() {
        return fDocumento;
    }

    public String getfReferencia() {
        return fReferencia;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public String getResponsable() {
        return responsable;
    }
   
   
}
