/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import DataBase.DBAccess;
import Driver.Taixe;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import QuanLi.QuanLi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import KinhDoanh.InHoaDon;


/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {
    Connection con;
    public PreparedStatement pet;
    public static ResultSet rs = null ;
    public Statement stmt;

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDangnhap = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        ckcShowpass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tên tài khoản");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 35, -1, -1));

        jLabel3.setText("Mật khẩu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 81, -1, -1));

        btnDangnhap.setBackground(new java.awt.Color(204, 204, 255));
        btnDangnhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.setName("formD"); // NOI18N
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 147, -1, -1));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 32, 160, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 78, 160, -1));

        btnThoat.setBackground(new java.awt.Color(204, 204, 255));
        btnThoat.setForeground(new java.awt.Color(255, 102, 51));
        btnThoat.setText("Cancel");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 147, -1, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imageDanfnhap.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 402, 185));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO add your handling code here:
        //  while(kiemtra())
        if(txtUsername.getText().equals("") || txtPass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }
        else
        {
            try{
                String username = txtUsername.getText();
                String password = new String (txtPass.getPassword());
                DBAccess acc = new DBAccess();   
                
                ResultSet sr =acc.Query("select * from TaikhoanAD where username='"+username+"' and password ='"+password+"'   ");
                if(sr.next())
                {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công"); 
                    rs = acc.Query("select [Chức vụ],NhanVien.Username from TaikhoanAD,ChucVu,NhanVien "
                             + "where ChucVu.IDCV = NhanVien.IDCV and TaikhoanAD.IDNV = NhanVien.IDNV AND TaikhoanAD.username = N'"+username+"' and password = '"+password+"'");
                    while(rs.next())
                    {
                        String chucvu = rs.getNString("Chức vụ");
                        if(chucvu.equals("Tài xế"))
                        {
                            Taixe tx = new Taixe();
                            this.setVisible(false);
                            tx.setVisible(true);
                        }
                        else
                        {
                            if(chucvu.equals("Quản lí"))
                            {
                                QuanLi frm = new QuanLi();
                                this.setVisible(false);
                                frm.setVisible(true);
                            }
                            else
                            {
                                InHoaDon frm = new InHoaDon();
                                this.setVisible(false);
                                frm.setVisible(true);
                            }
                            
                        }
                    }
                }else
                {
                    JOptionPane.showMessageDialog(null, "Tài khoản đăng nhập sai !!!");
                }
            }catch(Exception e){}
        }

    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPass.setEchoChar((char)0); //password = JPasswordField
        } else {
            txtPass.setEchoChar('*');
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
