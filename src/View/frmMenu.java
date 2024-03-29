/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author menab
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenu
     */
    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnPunto1 = new javax.swing.JButton();
        btnPunto2 = new javax.swing.JButton();
        btnPunto3 = new javax.swing.JButton();
        btnPunto4 = new javax.swing.JButton();
        btnPunto5 = new javax.swing.JButton();
        btnPunto6 = new javax.swing.JButton();
        btnPunto7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnIntegrantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "MenuPrincipal"));
        panel.setLayout(new java.awt.GridLayout(0, 1, 15, 15));

        btnPunto1.setText("Punto 1 - Arbol Binario de Busqueda");
        panel.add(btnPunto1);

        btnPunto2.setText("Punto 2 - Hilos");
        btnPunto2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(btnPunto2);

        btnPunto3.setText("Punto 3 - Gestion de Excepciones");
        btnPunto3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(btnPunto3);

        btnPunto4.setText("Punto 4 - Algoritmos Iterativos y Recursivos");
        btnPunto4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(btnPunto4);

        btnPunto5.setText("Punto 5 - Pilas");
        panel.add(btnPunto5);

        btnPunto6.setText("Punto 6 - Cola");
        panel.add(btnPunto6);

        btnPunto7.setText("Punto 7 - Listas");
        panel.add(btnPunto7);
        panel.add(jSeparator1);

        btnIntegrantes.setText("Integrantes");
        panel.add(btnIntegrantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIntegrantes;
    public javax.swing.JButton btnPunto1;
    public javax.swing.JButton btnPunto2;
    public javax.swing.JButton btnPunto3;
    public javax.swing.JButton btnPunto4;
    public javax.swing.JButton btnPunto5;
    public javax.swing.JButton btnPunto6;
    public javax.swing.JButton btnPunto7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
