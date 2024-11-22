/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BASE;

import javax.swing.JOptionPane;

/**
 *
 * @author 23106
 */
public class Frame_login extends javax.swing.JFrame {

    /**
     * Creates new form Frame_login
     */
    public Frame_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUSERNAME = new javax.swing.JTextField();
        txtPASSWORD = new javax.swing.JTextField();
        btnLOGIN = new javax.swing.JButton();
        btnREGISTRASI = new javax.swing.JButton();
        LabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUSERNAME.setBackground(new java.awt.Color(246, 212, 107));
        txtUSERNAME.setBorder(null);
        txtUSERNAME.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUSERNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSERNAMEActionPerformed(evt);
            }
        });
        getContentPane().add(txtUSERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 250, 30));

        txtPASSWORD.setBackground(new java.awt.Color(246, 212, 107));
        txtPASSWORD.setBorder(null);
        txtPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPASSWORDActionPerformed(evt);
            }
        });
        getContentPane().add(txtPASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 250, 20));

        btnLOGIN.setBackground(new java.awt.Color(45, 171, 24));
        btnLOGIN.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnLOGIN.setText("LOGIN");
        btnLOGIN.setBorder(null);
        btnLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGINActionPerformed(evt);
            }
        });
        getContentPane().add(btnLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 423, 100, 30));

        btnREGISTRASI.setBackground(new java.awt.Color(255, 190, 0));
        btnREGISTRASI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnREGISTRASI.setText("REGISTRASI");
        btnREGISTRASI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGISTRASIActionPerformed(evt);
            }
        });
        getContentPane().add(btnREGISTRASI, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 160, 40));

        LabelLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_componen_asset/frame login.png"))); // NOI18N
        getContentPane().add(LabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUSERNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSERNAMEActionPerformed
        JOptionPane.showMessageDialog(this, "Kolom Nama telah diisi: " + txtUSERNAME.getText());
    }//GEN-LAST:event_txtUSERNAMEActionPerformed

    private void btnLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGINActionPerformed
        String username = txtUSERNAME.getText();
    // String password = new String(txtPASSWORD.getPassword());

//    if (username.equals("NAJWA") && password.equals("12345")) {
//        JOptionPane.showMessageDialog(this, "Login Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//    } else {
//        JOptionPane.showMessageDialog(this, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
//    }       
    }//GEN-LAST:event_btnLOGINActionPerformed

    private void btnREGISTRASIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGISTRASIActionPerformed
     JOptionPane.showMessageDialog(this, "Fitur registrasi belum tersedia.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnREGISTRASIActionPerformed

    private void txtPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPASSWORDActionPerformed
         JOptionPane.showMessageDialog(this, "Anda menekan Enter di kolom password.");
    }//GEN-LAST:event_txtPASSWORDActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JButton btnLOGIN;
    private javax.swing.JButton btnREGISTRASI;
    private javax.swing.JTextField txtPASSWORD;
    private javax.swing.JTextField txtUSERNAME;
    // End of variables declaration//GEN-END:variables
}
