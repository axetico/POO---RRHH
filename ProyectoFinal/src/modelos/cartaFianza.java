/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class cartaFianza {
    private int numeroCarta;
    private int numeroContrato;
    private int numeroProceso;
    private String banco;
    private String tipo;
    private String proveedor;
    private String fVencimiento;
    private String responsable;
    private String comentario;
    private double importe;

    public cartaFianza(int numeroCarta, int numeroContrato, int numeroProceso, String banco, String tipo, String proveedor, String fVencimiento, String responsable, String comentario) {
        this.numeroCarta = numeroCarta;
        this.numeroContrato = numeroContrato;
        this.numeroProceso = numeroProceso;
        this.banco = banco;
        this.tipo = tipo;
        this.proveedor = proveedor;
        this.fVencimiento = fVencimiento;
        this.responsable = responsable;
        this.comentario = comentario;
    }

    public String getBanco() {
        return banco;
    }

    public String getComentario() {
        return comentario;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public double getImporte() {
        return importe;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public int getNumeroProceso() {
        return numeroProceso;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
