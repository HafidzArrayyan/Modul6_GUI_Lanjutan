
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
public class Uji_Kebolehan extends javax.swing.JFrame {

    /**
     * Creates new form Uji_Kebolehan
     */
    public Uji_Kebolehan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tinggibadan = new javax.swing.JTextField();
        beratbadan = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jk = new javax.swing.JLabel();
        rdbperempuan = new javax.swing.JRadioButton();
        rdblaki = new javax.swing.JRadioButton();
        hitung = new javax.swing.JButton();
        cobalagi = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saran = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 330, 40);

        jLabel2.setText("Tinggi Badan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 90, 30);

        jLabel3.setText("Berat Badan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 90, 30);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 90, 30);
        getContentPane().add(tinggibadan);
        tinggibadan.setBounds(140, 110, 330, 30);
        getContentPane().add(beratbadan);
        beratbadan.setBounds(140, 150, 330, 30);
        getContentPane().add(nama);
        nama.setBounds(140, 70, 330, 30);

        jk.setText("Jenis Kelamin");
        getContentPane().add(jk);
        jk.setBounds(50, 180, 90, 30);

        buttonGroup1.add(rdbperempuan);
        rdbperempuan.setText("Perempuan");
        getContentPane().add(rdbperempuan);
        rdbperempuan.setBounds(280, 180, 93, 30);

        buttonGroup1.add(rdblaki);
        rdblaki.setText("Laki-Laki");
        getContentPane().add(rdblaki);
        rdblaki.setBounds(140, 180, 90, 30);

        hitung.setBackground(new java.awt.Color(255, 0, 102));
        hitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(160, 230, 69, 23);

        cobalagi.setBackground(new java.awt.Color(255, 0, 102));
        cobalagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cobalagi.setText("Coba Lagi");
        cobalagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobalagiActionPerformed(evt);
            }
        });
        getContentPane().add(cobalagi);
        cobalagi.setBounds(250, 230, 110, 23);

        keluar.setBackground(new java.awt.Color(255, 0, 102));
        keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(380, 230, 69, 23);

        jLabel6.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 260, 170, 30);
        getContentPane().add(ideal);
        ideal.setBounds(270, 260, 70, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 260, 40, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 300, 210, 30);
        getContentPane().add(saran);
        saran.setBounds(50, 380, 420, 30);
        getContentPane().add(hasil);
        hasil.setBounds(50, 340, 420, 30);

        setBounds(0, 0, 518, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        double t,b,h=0;
        
        //untuk mengambil nilai tingi dan berat serta nama
        try{
            t=Double.valueOf(tinggibadan.getText());
            b=Double.valueOf(beratbadan.getText());
            String nm=nama.getText();
            
            //pilihan jenis kelamin
            if(rdblaki.isSelected()){
                h =(t-100)*1;
        } else if (rdbperempuan.isSelected()){
            h=(t-104)*1;
        }
            String temp = Double.toString(h);
            
            //logika untuk analisa hasil kesehatan
            if(h<b){
                ideal.setText(temp);
                hasil.setText("Maaf "+nm+", Anda kelebihan berat badan");
                saran.setText("Atur pola makan dan perbanyak olahraga");
            }else if(h>b){
                ideal.setText(temp);
                hasil.setText("Maaf "+nm+", Anda kekurangan berat badan");
                saran.setText("Perbanyak makan makanan yang bergizi dan berkarbohidrat");
            }else{
                ideal.setText(temp);
                hasil.setText("Berat badan Anda sudah ideal");
                saran.setText("Pertahankan dan tetap hidup sehat");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Kotak input belum terisi semua!","Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_hitungActionPerformed

    private void cobalagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobalagiActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        tinggibadan.setText("");
        beratbadan.setText("");
        ideal.setText("");
        hasil.setText("");
        saran.setText("");
        
        jk.setText("");
    }//GEN-LAST:event_cobalagiActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Uji_Kebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uji_Kebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uji_Kebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uji_Kebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uji_Kebolehan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratbadan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cobalagi;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jk;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rdblaki;
    private javax.swing.JRadioButton rdbperempuan;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tinggibadan;
    // End of variables declaration//GEN-END:variables
}
