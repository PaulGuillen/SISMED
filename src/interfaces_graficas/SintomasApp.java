package interfaces_graficas;

import enferm_y_sintomas.*;
import javax.swing.table.DefaultTableModel;

/*
Creado por DISC: ALejandro Huapaya Sánchez
 */
public class SintomasApp extends javax.swing.JFrame {
   String anterior="";
   DefaultTableModel modelo = new DefaultTableModel();
   Sintomas_Enfermedades SE=new Sintomas_Enfermedades();
   public SintomasApp() {
      initComponents();
      setLocationRelativeTo(null);
      Visualiza.setLocation(476, 230);
      Visualiza.setSize(400,450);
      btnModificar.setEnabled(false);//DESHABILITAR BOTON MODIFICAR
   }
   void sintomas(){
      //CREANDO UN STRING PARA LO TITULOS
      String[] titulos = { "Descripcion", "#Enferm"};//"Codigo",
      //DEFINIR EL TAMAÑO DE LA MATRIZ QUE COLUMNAS
      String[] Columna = new String[2];
      //ASIGNAR LA MATRIZ TITUTLO A NUESTRO MODELO DEL JTABLE
      modelo = new DefaultTableModel(null, titulos);
      SE.cargaData();
      for(int i=2; i<SE.N2; i++){
         //Columna[0] = SE.S[i].dato(1);
         Columna[0] = SE.S[i].dato(2);
         Columna[1] = SE.S[i].dato(3);
         modelo.addRow(Columna);
      }
      tablaSintomas.setModel(modelo);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   private void initComponents() {//GEN-BEGIN:initComponents

      Visualiza = new javax.swing.JFrame();
      jLabel4 = new javax.swing.JLabel();
      Sint2 = new javax.swing.JTextField();
      btnModificar = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tablaSintomas = new javax.swing.JTable();
      jLabel3 = new javax.swing.JLabel();
      Sint1 = new javax.swing.JTextField();
      jPopupMenu1 = new javax.swing.JPopupMenu();
      jMenuItemModificar = new javax.swing.JMenuItem();
      jMenuItemBorrar = new javax.swing.JMenuItem();
      jLabel2 = new javax.swing.JLabel();
      Sint = new javax.swing.JTextField();
      btnGrabarSint = new javax.swing.JButton();
      btnVisualizar = new javax.swing.JButton();

      Visualiza.setTitle("SS01-1: Mantenimiento de Sintomas");
      Visualiza.setResizable(false);

      jLabel4.setText("Descripcion del Sintoma");

      btnModificar.setText("Modificar");
      btnModificar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModificarActionPerformed(evt);
         }
      });

      jLabel1.setForeground(new java.awt.Color(255, 0, 0));
      jLabel1.setText("Seleccione Síntoma ");

      jLabel5.setForeground(new java.awt.Color(255, 0, 0));
      jLabel5.setText(" Clic con botón derecho del mouse para Modificar/Borrar");

      tablaSintomas.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      tablaSintomas.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaSintomasMouseClicked(evt);
         }
         public void mousePressed(java.awt.event.MouseEvent evt) {
            tablaSintomasMousePressed(evt);
         }
      });
      jScrollPane1.setViewportView(tablaSintomas);

      javax.swing.GroupLayout VisualizaLayout = new javax.swing.GroupLayout(Visualiza.getContentPane());
      Visualiza.getContentPane().setLayout(VisualizaLayout);
      VisualizaLayout.setHorizontalGroup(
         VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(VisualizaLayout.createSequentialGroup()
            .addGroup(VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(VisualizaLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VisualizaLayout.createSequentialGroup()
                  .addGap(20, 20, 20)
                  .addGroup(VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel5)
                     .addComponent(jLabel1)
                     .addGroup(VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(VisualizaLayout.createSequentialGroup()
                           .addComponent(jLabel4)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(btnModificar))
                        .addComponent(Sint2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(97, Short.MAX_VALUE))
      );
      VisualizaLayout.setVerticalGroup(
         VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(VisualizaLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(VisualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(btnModificar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Sint2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jLabel3.setText("Ingrese descripcion del Sintoma");

      jMenuItemModificar.setText("Modificar");
      jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemModificarActionPerformed(evt);
         }
      });
      jPopupMenu1.add(jMenuItemModificar);

      jMenuItemBorrar.setText("Borrar");
      jMenuItemBorrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemBorrarActionPerformed(evt);
         }
      });
      jPopupMenu1.add(jMenuItemBorrar);

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("SS-01: Mantenimiento de Sintomas");

      jLabel2.setText("Ingrese descripcion del Sintoma");

      btnGrabarSint.setText("Grabar Sintoma");
      btnGrabarSint.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGrabarSintActionPerformed(evt);
         }
      });

      btnVisualizar.setText("Visualizar");
      btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnVisualizarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(30, 30, 30)
                  .addComponent(jLabel2))
               .addGroup(layout.createSequentialGroup()
                  .addGap(91, 91, 91)
                  .addComponent(btnGrabarSint)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnVisualizar))
               .addGroup(layout.createSequentialGroup()
                  .addGap(42, 42, 42)
                  .addComponent(Sint, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(51, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(Sint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnGrabarSint)
               .addComponent(btnVisualizar))
            .addContainerGap(70, Short.MAX_VALUE))
      );

      pack();
   }//GEN-END:initComponents

   private void btnGrabarSintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarSintActionPerformed
      // BOTON: Grabar Sintoma
      SE.ingresar(2, Sint);
      Sint.setText("");
      
   }//GEN-LAST:event_btnGrabarSintActionPerformed

   private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      // BOTON: Modificar/Borrar Sintoma
      if(btnModificar.getText().compareTo("Modificar") == 0){
         SE.modSintoma(anterior, Sint2);
         Sint2.setText("");
         btnModificar.setEnabled(false);//BOTON MODIFICAR DESHABILITADO
      }else{
         SE.borraSintoma(anterior);
         javax.swing.JOptionPane.showMessageDialog(null, "SINTOMA eliminada");//MENSAJE
      }
      sintomas();//ACTUALIZAR VISTA DE LA TABLA
      btnModificar.setEnabled(false);//BOTON MODIFICAR INHABILITADO
   }//GEN-LAST:event_btnModificarActionPerformed

   private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
      sintomas();
      Visualiza.show(true);
   }//GEN-LAST:event_btnVisualizarActionPerformed

   private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
      int fila = tablaSintomas.getSelectedRow();
      //OBTENER LOS VALORES DE JTABLE
      if(fila > 0){
         anterior = (tablaSintomas.getValueAt(fila, 1).toString());
      }
      //ASIGNAR LOS VALORES OBTENIDO A LAS VARIABLES STRING
      Sint2.setText(anterior);
      btnModificar.setText("Modificar");
      btnModificar.setEnabled(true);//BOTON MODIFICAR HABILITADO
   }//GEN-LAST:event_jMenuItemModificarActionPerformed

   private void jMenuItemBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarActionPerformed
      int fila = tablaSintomas.getSelectedRow();
      //OBTENER LOS VALORES DE JTABLE
      if(fila > 0){
         anterior = (tablaSintomas.getValueAt(fila, 1).toString());
      }
      btnModificar.setText("Borrar");
      btnModificar.setEnabled(true);//BOTON BORRAR HABILITADO
   }//GEN-LAST:event_jMenuItemBorrarActionPerformed

   private void tablaSintomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSintomasMouseClicked
      int fila = tablaSintomas.getSelectedRow();
      if (fila > 0) {
         jPopupMenu1.show();
      }
   }//GEN-LAST:event_tablaSintomasMouseClicked

   private void tablaSintomasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSintomasMousePressed
      // TODO add your handling code here:
   }//GEN-LAST:event_tablaSintomasMousePressed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(SintomasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(SintomasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(SintomasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(SintomasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new SintomasApp().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField Sint;
   private javax.swing.JTextField Sint1;
   private javax.swing.JTextField Sint2;
   private javax.swing.JFrame Visualiza;
   private javax.swing.JButton btnGrabarSint;
   private javax.swing.JButton btnModificar;
   private javax.swing.JButton btnVisualizar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JMenuItem jMenuItemBorrar;
   private javax.swing.JMenuItem jMenuItemModificar;
   private javax.swing.JPopupMenu jPopupMenu1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tablaSintomas;
   // End of variables declaration//GEN-END:variables
}
