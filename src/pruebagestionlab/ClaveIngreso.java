
package pruebagestionlab;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ClaveIngreso extends javax.swing.JFrame {
    String texto = "";
    
    public ClaveIngreso() {
        initComponents();
       // setIconImage(new ImageIcon(getClass().getResource("/imegenes/Logo_Ingeomin_a_1.png")).getImage());
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoFondo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        LabelCampoObligatorio = new javax.swing.JLabel();
        LabelLogoDiablo = new javax.swing.JLabel();
        LabelElaboradoPor = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelFondoCuadrado = new javax.swing.JLabel();

        LogoFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_15.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al Sistema - Usuario / Clave -");
        setPreferredSize(new java.awt.Dimension(400, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, 30));

        jPasswordField.setText("jPasswordField1");
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 170, 30));

        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 10, -1));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_5x5.png"))); // NOI18N
        getContentPane().add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 150));

        LabelUsuario.setForeground(java.awt.Color.black);
        LabelUsuario.setText("Nombre Usuario   ");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, -1));

        LabelContraseña.setForeground(java.awt.Color.black);
        LabelContraseña.setText("Ingrese Contraseña   ");
        getContentPane().add(LabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 160, -1));

        LabelCampoObligatorio.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        LabelCampoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        LabelCampoObligatorio.setText("* Campos Obligatorios");
        getContentPane().add(LabelCampoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, -1));

        LabelLogoDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(LabelLogoDiablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 30, 30));

        LabelElaboradoPor.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        LabelElaboradoPor.setText("Elaborado por: imosquerad@yahoo.com.mx");
        getContentPane().add(LabelElaboradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        botonIngresar.setForeground(java.awt.Color.black);
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 10, -1));

        LabelFondoCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Fondo_1090_698.png"))); // NOI18N
        getContentPane().add(LabelFondoCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        
        if(evt.getSource() == botonIngresar){
       texto = txtUsuario.getText().trim();
        if(texto.equals("")){
          JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
        } else {
       
      
         Principal construccion = new Principal();
        construccion.setBounds(0, 0, 1082, 656);
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
        this.setVisible(false);
        }
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(ClaveIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaveIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaveIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaveIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //ClaveIngreso construccion = new ClaveIngreso();
        //construccion.setBounds(0, 0, 1082, 656);
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaveIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCampoObligatorio;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelElaboradoPor;
    private javax.swing.JLabel LabelFondoCuadrado;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelLogoDiablo;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LogoFondo;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
