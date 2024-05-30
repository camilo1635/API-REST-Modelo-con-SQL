/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import modelos.Cliente;
import servicios.ClienteServices;

/**
 *
 * @author LENOVO
 */
public class VtnConsultarCliente extends javax.swing.JInternalFrame {

   private ClienteServices objClienteServices;
    
    public VtnConsultarCliente(ClienteServices objClienteServices) {
        initComponents();
        this.objClienteServices=objClienteServices;
        this.jLabelMostrarMensaje.setVisible(false);         
        this.jPanelMostrarDatos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jPanelMostrarDatos = new javax.swing.JPanel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelFechaCreacion = new javax.swing.JLabel();
        jLabelIdCliente = new javax.swing.JLabel();
        jLabelMApellidos = new javax.swing.JLabel();
        jLabelMCorreo = new javax.swing.JLabel();
        jLabelMFechaCreacion = new javax.swing.JLabel();
        jLabelMIdCliente = new javax.swing.JLabel();
        jLabelMNombres = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMostrarMensaje = new javax.swing.JLabel();

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Consultar cliente");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabelTitulo)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitulo)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jPanelMostrarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombres.setText("Nombres:");

        jLabelApellidos.setText("Apellidos:");

        jLabelCorreo.setText("Correo:");

        jLabelFechaCreacion.setText("Fecha Creacion:");

        jLabelIdCliente.setText("Id Cliente");

        jLabelMApellidos.setText("resultado");

        jLabelMCorreo.setText("resultado");

        jLabelMFechaCreacion.setText("resultado");

        jLabelMIdCliente.setText("resultado");

        jLabelMNombres.setText("resultado");

        javax.swing.GroupLayout jPanelMostrarDatosLayout = new javax.swing.GroupLayout(jPanelMostrarDatos);
        jPanelMostrarDatos.setLayout(jPanelMostrarDatosLayout);
        jPanelMostrarDatosLayout.setHorizontalGroup(
            jPanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombres)
                    .addComponent(jLabelApellidos)
                    .addComponent(jLabelCorreo)
                    .addComponent(jLabelFechaCreacion)
                    .addComponent(jLabelIdCliente))
                .addGap(91, 91, 91)
                .addGroup(jPanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMFechaCreacion)
                    .addComponent(jLabelMCorreo)
                    .addComponent(jLabelMApellidos)
                    .addComponent(jLabelMNombres)
                    .addComponent(jLabelMIdCliente))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanelMostrarDatosLayout.setVerticalGroup(
            jPanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMostrarDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMIdCliente)
                .addGap(12, 12, 12)
                .addComponent(jLabelMNombres)
                .addGap(16, 16, 16)
                .addComponent(jLabelMApellidos)
                .addGap(12, 12, 12)
                .addComponent(jLabelMCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMFechaCreacion))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMostrarDatosLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelIdCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFechaCreacion)
                .addContainerGap())
        );

        jLabel1.setText("Id");

        jLabelMostrarMensaje.setText("Mensaje");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMostrarMensaje)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonConsultar))
                    .addComponent(jPanelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMostrarMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
       String idCliente;
       Integer idClienteEntero;
       idCliente=this.jTextFieldIdCliente.getText();
       idClienteEntero=Integer.parseInt(idCliente);
       
       if(this.objClienteServices.consultarSiExisteCliente(idClienteEntero))
       {
            this.jLabelMostrarMensaje.setVisible(false);
            this.jPanelMostrarDatos.setVisible(true);
            Cliente objCliente=this.objClienteServices.consultarCliente(idClienteEntero);
            this.jLabelMIdCliente.setText(objCliente.getIdCliente()+"");
            this.jLabelMNombres.setText(objCliente.getNombre());
            this.jLabelMApellidos.setText(objCliente.getApellido());
            this.jLabelMCorreo.setText(objCliente.getEmail());
            this.jLabelMFechaCreacion.setText(objCliente.getCreateAt()+"");
       }
       else
       {
           this.jLabelMostrarMensaje.setVisible(true);
           this.jLabelMostrarMensaje.setText("Error, no existe un cliente con ese identificador");
           this.jPanelMostrarDatos.setVisible(false);
       }
       
    }//GEN-LAST:event_jButtonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFechaCreacion;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelMApellidos;
    private javax.swing.JLabel jLabelMCorreo;
    private javax.swing.JLabel jLabelMFechaCreacion;
    private javax.swing.JLabel jLabelMIdCliente;
    private javax.swing.JLabel jLabelMNombres;
    private javax.swing.JLabel jLabelMostrarMensaje;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMostrarDatos;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldIdCliente;
    // End of variables declaration//GEN-END:variables
}
