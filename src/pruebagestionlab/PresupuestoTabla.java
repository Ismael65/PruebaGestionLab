
package pruebagestionlab;

import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class PresupuestoTabla extends javax.swing.JFrame {
        DefaultListModel lista = new DefaultListModel();
        DefaultTableModel tabla = new DefaultTableModel();
    
    public PresupuestoTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        lista = new DefaultListModel();
        listaDatos.setModel(lista);
        listaPresupuesto.setModel(lista);
        
        tabla = new DefaultTableModel();
        
        LeeArchivoTxt();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaDatos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPresupuesto = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDatos);

        jLabel1.setText("Lista 1");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablaDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDatos);

        jLabel2.setText("Tabla");

        jLabel3.setText("Lista 2");

        jScrollPane3.setViewportView(listaPresupuesto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDatosMouseClicked
        String mensaje = null;
        mensaje = listaDatos.getSelectedValue().toString();
        lista.addElement(mensaje);
    }//GEN-LAST:event_listaDatosMouseClicked

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        /*String mensaje = null;
        mensaje = tablaDatos.getSelectedRows().toString();
        lista.addElement(mensaje);*/
    }//GEN-LAST:event_tablaDatosMouseClicked

    
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
            java.util.logging.Logger.getLogger(PresupuestoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresupuestoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresupuestoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresupuestoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresupuestoTabla().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaDatos;
    private javax.swing.JList<String> listaPresupuesto;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables


public void LeeArchivoTxt() {
        
        BufferedReader almacenamiento;
        String cadena;
        String cadenaAux;
        String delimiter = "\t";
        ArrayList cadenaTab = new ArrayList();
        try {
            almacenamiento = new BufferedReader(new java.io.FileReader("PrecioAnalisis.txt"));
            cadena = "";
            cadenaAux = "";
            
            int lineas = 0;
            DefaultListModel lista = new DefaultListModel();
            lista.addElement("LISTA DE PRECIO 2020");
//  ***************************************************** 
//String a[]=linea.split(delimiter);
            while (cadena != null) {
                //s=linea.split(";");
                cadena = almacenamiento.readLine();
                cadenaTab.add(cadena);
                //lista.addElement(cadena);  // ojo investigar + sobre .split **** .split(" ")
                for (int j = 0 ;  j < cadenaTab.size()  ; j++){
                    cadenaAux = (String)cadenaTab.get(j);
                }
                    lista.addElement(cadenaAux);          
            }
//  *****************************************************            
            listaDatos.setModel(lista);
            almacenamiento.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
//      **********************************************************************  
            
              
    
}
}

