/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginKH;

import DataBase.DBAccess;
import KinhDoanh.GioHang;
import KinhDoanh.Home;
import KinhDoanh.Product;
import KinhDoanh.Account;
import static LoginKH.DangKi.saltvalue;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import static LoginKH.PassBasedEnc.*;
/**
 *
 * @author ASUS
 */
public class DangNhap extends javax.swing.JFrame {
    public static String sodienthoai = null;

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDangnhap = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        ckcShowpass = new javax.swing.JCheckBox();
        btnQuenpass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setName("formDangnhap"); // NOI18N

        jLabel2.setText("Số điện thoại");

        jLabel3.setText("Mật khẩu");

        btnDangnhap.setBackground(new java.awt.Color(204, 204, 255));
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.setName("formD"); // NOI18N
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(204, 204, 255));
        btnThoat.setText("Cancel");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });

        btnQuenpass.setText("Quên Mật Khẩu");
        btnQuenpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckcShowpass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnQuenpass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnDangnhap)
                                .addGap(78, 78, 78)
                                .addComponent(btnThoat)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuenpass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckcShowpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangnhap)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO add your handling code here:
      //  while(kiemtra())
        if(txtSDT.getText().equals("") || txtPass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }
        else
        {
            try{
                sodienthoai = txtSDT.getText();
                String password = new String (txtPass.getPassword());
                

            /* generates an encrypted password. It can be stored in a database.*/  
                String encryptedpassword = PassBasedEnc.generateSecurePassword(password, saltvalue);
                DBAccess acc = new DBAccess();
                ResultSet sr =acc.Query(" select sodienthoai ,password,HoTen ,Email,DiaChi ,IDGT ,sault from Taikhoan where sodienthoai="+sodienthoai+"     ");
                
                if(sr.next()){
                    boolean status = LoginKH.PassBasedEnc.verifyUserPassword(password,sr.getString(3),sr.getString(8));
                    if(status==true)
                    {
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                        
                        Home frm = new Home();
                        frm.setVisible(true);
                        dispose();  
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null, "Đăng nhập thất bại, mời bạn vui lòng kiểm tra lại"); 
                    }
                    
                }else
                {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy số điện thoại!!");
                }
            }catch(Exception e){}
        }
            
         
    }//GEN-LAST:event_btnDangnhapActionPerformed

    
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
        TaikhoanKH frm = new TaikhoanKH();
        frm.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
      txtPass.setEchoChar((char)0); //password = JPasswordField
   } else {
      txtPass.setEchoChar('*');
   }
    }//GEN-LAST:event_ckcShowpassActionPerformed

    private void btnQuenpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenpassActionPerformed
        Quenpass frm = new Quenpass();
        frm.setVisible(true);   

        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuenpassActionPerformed

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
        // TODO add your handling code here:
        if ((txtSDT.getText() + evt.getKeyChar()).length() > 11) {
        evt.consume();
         }
    }//GEN-LAST:event_txtSDTKeyTyped

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnQuenpass;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
