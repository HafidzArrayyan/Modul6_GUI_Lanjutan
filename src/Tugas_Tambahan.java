
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Tugas_Tambahan extends javax.swing.JFrame {

    /**
     * Creates new form Tugas_Tambahan
     */
    public Tugas_Tambahan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bbiner = new javax.swing.JTextField();
        bdesimal = new javax.swing.JTextField();
        cbiner = new javax.swing.JButton();
        cdesimal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bilangan Biner");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 190, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bilangan Desimal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 130, 30);
        getContentPane().add(bbiner);
        bbiner.setBounds(150, 190, 270, 30);
        getContentPane().add(bdesimal);
        bdesimal.setBounds(150, 80, 270, 30);

        cbiner.setBackground(new java.awt.Color(255, 153, 0));
        cbiner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbiner.setText("Convert to Biner");
        cbiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbinerActionPerformed(evt);
            }
        });
        getContentPane().add(cbiner);
        cbiner.setBounds(100, 130, 160, 40);

        cdesimal.setBackground(new java.awt.Color(255, 153, 0));
        cdesimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdesimal.setText("Convert to Desimal");
        cdesimal.setToolTipText("");
        cdesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdesimalActionPerformed(evt);
            }
        });
        getContentPane().add(cdesimal);
        cdesimal.setBounds(310, 130, 170, 40);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 300);

        setBounds(0, 0, 552, 342);
    }// </editor-fold>//GEN-END:initComponents

    private void cbinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbinerActionPerformed
        // TODO add your handling code here:
        try{
            int des=Integer.valueOf(bdesimal.getText()); 
            String biner=Integer.toBinaryString(des);
            bbiner.setText(String.valueOf(biner));
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error : "+"Inputan harus berupa angka","Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+"Kotak input belum terisi","Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cbinerActionPerformed

    private void cdesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdesimalActionPerformed
        // TODO add your handling code here:
       try{
           String biner=bbiner.getText();
           int des=Integer.parseInt(biner,2);
           bdesimal.setText(String.valueOf(des));
       }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error : "+"Inputan harus berupa angka","Message",
                    JOptionPane.INFORMATION_MESSAGE);
       }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error : "+"Kotak input belum terisi","Message",
                    JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cdesimalActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Tugas_Tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas_Tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas_Tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas_Tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas_Tambahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bbiner;
    private javax.swing.JTextField bdesimal;
    private javax.swing.JButton cbiner;
    private javax.swing.JButton cdesimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
