/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class ViewAddAluno extends javax.swing.JFrame {

    /**
     * Creates new form ViewAddEscola
     */
    public ViewAddAluno() {
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

        textMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDataInscrição = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textMatricula.setBackground(new java.awt.Color(255, 255, 255));
        textMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(textMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATRICULA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 190, -1));

        jTextSerie.setBackground(new java.awt.Color(255, 255, 255));
        jTextSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSerieActionPerformed(evt);
            }
        });
        getContentPane().add(jTextSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA DE INSCRIÇÃO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 270, -1));

        jTextDataInscrição.setBackground(new java.awt.Color(255, 255, 255));
        jTextDataInscrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataInscriçãoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDataInscrição, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SÉRIE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 130, -1));

        textNome.setBackground(new java.awt.Color(255, 255, 255));
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 230, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADICIONANDO ALUNO(A)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 470, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewImagens/Design sem nome (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 0, 1332, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMatriculaActionPerformed

    private void jTextSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSerieActionPerformed

    private void jTextDataInscriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataInscriçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataInscriçãoActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAddAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAddAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAddAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAddAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAddAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextDataInscrição;
    private javax.swing.JTextField jTextSerie;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextDataInscrição() {
        return jTextDataInscrição;
    }

    public void setjTextDataInscrição(JTextField jTextDataInscrição) {
        this.jTextDataInscrição = jTextDataInscrição;
    }

    public JTextField getjTextSerie() {
        return jTextSerie;
    }

    public void setjTextSerie(JTextField jTextSerie) {
        this.jTextSerie = jTextSerie;
    }

    public JTextField getTextMatricula() {
        return textMatricula;
    }

    public void setTextMatricula(JTextField textMatricula) {
        this.textMatricula = textMatricula;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    public void setTextNome(JTextField textNome) {
        this.textNome = textNome;
    }

    

}
