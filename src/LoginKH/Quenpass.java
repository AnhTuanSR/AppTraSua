/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginKH;
import java.util.regex.Pattern; 
import DataBase.DBAccess;
import javax.swing.JOptionPane;
import java.util.regex.Pattern; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchAlgorithmException;  
import java.security.SecureRandom;  
import java.security.spec.InvalidKeySpecException;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;  
import java.util.Base64;  
import java.util.Random;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;  
import javax.crypto.spec.PBEKeySpec;  
import javax.swing.ButtonGroup;
import static LoginKH.PassBasedEnc.*;
import static LoginKH.DangNhap_1.sodienthoai;


public class Quenpass extends javax.swing.JFrame {
    static String saltvalue = LoginKH.PassBasedEnc.getSaltvalue(30);
    
    public Quenpass() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassmoi = new javax.swing.JPasswordField();
        txtConpass = new javax.swing.JPasswordField();
        txtSDT = new javax.swing.JTextField();
        btnDangki = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        ckcShowpass = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quên password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cập Mật Khẩu Mới");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 13, 162, 28));

        jLabel2.setText("Số Điện Thoại");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, -1, -1));

        jLabel3.setText("Mật Khẩu Mới");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 120, -1, -1));

        jLabel4.setText("Nhập Lại Mật Khẩu Mới");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 160, -1, -1));
        getContentPane().add(txtPassmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 117, 171, -1));
        getContentPane().add(txtConpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 157, 171, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 77, 171, -1));

        btnDangki.setBackground(new java.awt.Color(255, 255, 102));
        btnDangki.setForeground(new java.awt.Color(0, 0, 204));
        btnDangki.setText("Cập nhật");
        btnDangki.setActionCommand("DangKi");
        btnDangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangki, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 228, -1, -1));

        btnThoat.setBackground(new java.awt.Color(255, 255, 102));
        btnThoat.setForeground(new java.awt.Color(0, 0, 204));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 228, -1, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 188, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imageQuenpass.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkiActionPerformed
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20}");
        String sodienthoai = txtSDT.getText();
        String password = new String(txtPassmoi.getPassword());
        int kq=0;    
       
        // check password length and special char
        pattern.matcher(password).matches();

        if(pattern.matcher(password).matches()==true)
        {

            String encryptedpassword = PassBasedEnc.generateSecurePassword(password, saltvalue);
            DBAccess acc = new DBAccess();
            ResultSet sr =acc.Query("select * from Taikhoan where sodienthoai='"+sodienthoai+"' ");
            try {
                if( sr.next() )
                {
                    kq = acc.Update("Update Taikhoan set password= '"+encryptedpassword+"', sault='"+saltvalue+"' WHERE sodienthoai ='"+sodienthoai+"' ");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Quenpass.class.getName()).log(Level.SEVERE, null, ex);
            }
             if(kq!=0){
                JOptionPane.showMessageDialog(null,"Update Password thành công");
                DangNhap_1 frm = new DangNhap_1();
                frm.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Update Password thất bại");
            }
        }
        else
        DangKi.infoBox("Mật khẩu không hợp lệ hoặc không đủ mạnh, hãy chọn mật khẩu mới ( có thể có chữ viết hoa hoặc những kí tự đặt biệt )", "THÔNG BÁO");

        
    }//GEN-LAST:event_btnDangkiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPassmoi.setEchoChar((char)0);
            txtConpass.setEchoChar((char)0);
        } else {
            txtPassmoi.setEchoChar('*');
            txtConpass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckcShowpassActionPerformed

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
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quenpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangki;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtConpass;
    private javax.swing.JPasswordField txtPassmoi;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
