/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultarUsuarioForm.java
 *
 * Created on 13-abr-2012, 8:27:54
 */
package vistas;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import modelos.*;
import controladoras.*;
/**
 *
 * @author CARLOS
 */
public class ConsultarUsuarioForm extends javax.swing.JInternalFrame {

    private AdmUsuarios listaUsuario = new AdmUsuarios();
    /** Creates new form ConsultarUsuarioForm */
    public ConsultarUsuarioForm() {
        initComponents();
        inicialiar();
    }
    private void inicialiar() {
        limpiar();
        cargarUsuarios();
        cargarTiposUsuario();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscarcodigo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList();
        chkTipoUsuario = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Usuario");

        jLabel1.setText("Buscar Codigo");

        txtBuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarcodigoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        lstUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstUsuariosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        scrollPane1.add(jScrollPane1);

        chkTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chkTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnLimpiar))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(298, 298, 298))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(chkTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnLimpiar)
                            .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtBuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarcodigoActionPerformed
  
}//GEN-LAST:event_txtBuscarcodigoActionPerformed

private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        cargarUsuarios();
}//GEN-LAST:event_btnLimpiarActionPerformed

private void lstUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstUsuariosKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int pos = lstUsuarios.getSelectedIndex();
            if (pos >= 0) {
                Rol item = new Rol();
                item = (Rol) this.lstUsuarios.getModel().getElementAt(pos);
                int codigoComparar = new Integer(item.getItemData().toString()).intValue();
                Usuario e = new Usuario();
                e = this.listaUsuario.buscarUsuario(codigoComparar);
                if (e != null) {
                    setDatos(e);
                }
            }
        }       
}//GEN-LAST:event_lstUsuariosKeyPressed

private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
 int pos = lstUsuarios.getSelectedIndex();
        if (pos >= 0) {
            seleccionarUsuario(pos);
        } 
                     
}//GEN-LAST:event_lstUsuariosMouseClicked

private void chkTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTipoUsuarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_chkTipoUsuarioActionPerformed
/*
     * Segun lo ingresado en el campo de busqueda se realiza la busqueda en el arreglo de empleados
     */
    private boolean buscarUsuario() {
        if (this.txtBuscarcodigo.getText().length() > 0) {
            int codigoComparar = new Integer(this.txtBuscarcodigo.getText()).intValue();
            Usuario e = new Usuario();
            e = this.listaUsuario.buscarUsuario(codigoComparar);
            if (e != null) {
                setDatos(e);
                return true;
            }
        }
        limpiar();
        cargarUsuarios();
        return false;
    }

    /*
     * Segun la posición en el listado muestra la info del empleado
     */
    private void seleccionarUsuario(int pos) {
        Rol item = new Rol();
        item = (Rol) this.lstUsuarios.getModel().getElementAt(pos);
        int codigoComparar = new Integer(item.getItemData().toString()).intValue();
        Usuario e = new Usuario();
        e = this.listaUsuario.buscarUsuario(codigoComparar);
        if (e != null) {
            setDatos(e);
        }
    }

    /*
     * carga el listado con los datos del arreglo de empleados
     */
    private void cargarUsuarios() {
        ArrayList lst = new ArrayList();
        listaUsuario.cargarUsuarios();
        lst = listaUsuario.getListaUsuarios();
        this.lstUsuarios.removeAll();
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < lst.size(); i++) {
            Usuario e = new Usuario();
            e = (Usuario) lst.get(i);
            Rol item = new Rol();
            item.setItem("(" + String.valueOf(e.getCodigoUsuario()) + ") " + e.getNombre() + ", " + e.getApellidoPaterno() + " ," + e.getApellidoPaterno() + ", " + e.getConfpassWord() + ", "+ e.getCargo() + ", "+ e.getRol());
            item.setItemData(String.valueOf(e.getCodigoUsuario()));
            modelo.addElement(item);
        }
        this.lstUsuarios.setModel(modelo);
    }

    private void limpiar() {
        
        this.txtBuscarcodigo.setText("");
        this.lstUsuarios.removeAll();
        
        cargarTiposUsuario();
    }

    /*
     * cada vez que se mueve por el listado se verifica que tipo de empleado es
     */
    private void seleccionarTipoUsuario(String codigo) {
        int size = this.chkTipoUsuario.getItemCount();
        for (int i = 0; i < size; i++) {
            Rol item = new Rol();
            item = (Rol) this.chkTipoUsuario.getItemAt(i);
            if (item.getItemData().equals(codigo)) {
                this.chkTipoUsuario.setSelectedIndex(i);
                break;
            }
        }
    }

    /*
     * carga el combobox de tipos de empleados
     */
    private void cargarTiposUsuario() {
        String lista[][] = {{"1", "Administrador"}, {"2", "Empleado"}, {"3", "Responsable"}};
        int size = lista.length;
        this.chkTipoUsuario.removeAllItems();
        for (int i = 0; i < size; i++) {
            Rol item = new Rol();
            item.setItemData(lista[i][0]);
            item.setItem(lista[i][1]);
            this.chkTipoUsuario.addItem(item);
        }
    }

    /*
     * hace set de los datos del empleado en las cajas de texto del fomulario
     */
    private void setDatos(Usuario e) {
        Administrador adm = new Administrador();
        Usuario emp = new Usuario();
        Responsable resp = new Responsable();
        
        if (e != null) {
            
           
            if (e.getClass().getName().equals("usuarios.objetos.Administrador")) {
                seleccionarTipoUsuario("1");
                adm = (Administrador) (Usuario) e;
                
            } else if (e.getClass().getName().equals("usuarios.objetos.EmpleadoPorComision") || e.getClass().getName().equals("empleados.objetos.EmpleadoBaseMasComision")) {
                seleccionarTipoUsuario("2");
                
            } else if (e.getClass().getName().equals("usuarios.objetos.EmpleadoPorHoras")) {
                seleccionarTipoUsuario("3");
                
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox chkTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstUsuarios;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField txtBuscarcodigo;
    // End of variables declaration//GEN-END:variables
}