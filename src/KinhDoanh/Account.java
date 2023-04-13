/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KinhDoanh;

import DataBase.DBAccess;
import LoginKH.DangNhap;
import LoginKH.Quenpass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static LoginKH.DangNhap_1.sodienthoai;

/**
 *
 * @author ASUS
 */
public class Account extends javax.swing.JFrame {

    Connection con;
    public PreparedStatement pet;
    public static ResultSet rs = null ;
    /**
     * Creates new form ThongTinTK
     */
    public Account() {
        initComponents();
        LoadData(sodienthoai);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        cbbUpdateTT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDoipass = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextPane();
        btnThoat = new javax.swing.JButton();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ACC.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin tài khoản");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbbUpdateTT.setBackground(new java.awt.Color(255, 255, 255));
        cbbUpdateTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upload/Upload_16x16.png"))); // NOI18N
        cbbUpdateTT.setText("Cập nhật thông tin");
        cbbUpdateTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUpdateTTActionPerformed(evt);
            }
        });
        getContentPane().add(cbbUpdateTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("SỐ ĐIỆN THOẠI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 169, -1));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("HỌ TÊN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("ĐỊA CHỈ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        btnDoipass.setBackground(new java.awt.Color(255, 255, 255));
        btnDoipass.setText("Đổi password");
        btnDoipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoipassActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoipass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 110, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("GIỚI TÍNH");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtDiachi.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 269, 58));

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        rdbNam.setText("Nam");
        getContentPane().add(rdbNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        rdbNu.setText("Nữ");
        getContentPane().add(rdbNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 138, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imageAc.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 406));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDoipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoipassActionPerformed
        Quenpass frm = new Quenpass();
        frm.setVisible(true); 
    }//GEN-LAST:event_btnDoipassActionPerformed

    private void cbbUpdateTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUpdateTTActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        acc.connect();
        if(txtEmail.getText().equals("") || txtUsername.getText().equals("") || txtDiachi.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }
        else
        {
            ButtonGroup group = new ButtonGroup();
            group.add(rdbNu);
            group.add(rdbNam);
            String GioiTinh = "";
            if(rdbNu.isSelected() == true)
            {
                GioiTinh = rdbNu.getText();
            }
            else
            {
                GioiTinh = rdbNam.getText();
            }
            String sodienthoai = txtSDT.getText();
            String username = txtUsername.getText();
            String email =  txtEmail.getText();
            String Diachi  = txtDiachi.getText();
            String password = txtPass.getText();
            try {
                acc.UpdateTK(sodienthoai,username,email,Diachi,password,GioiTinh);
                JOptionPane.showMessageDialog(this, "Cập nhật thành công !!");
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            LoadData(sodienthoai);
        }
    }//GEN-LAST:event_cbbUpdateTTActionPerformed

    public void LoadData(String sodienthoai)
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            con = DriverManager.getConnection(url);
            String sql = "select sodienthoai,GioiTinh,HoTen,Email,DiaChi,password from Taikhoan,GioiTinh where GioiTinh.IDGT = Taikhoan.IDGT and sodienthoai = ? ";
            pet = con.prepareStatement(sql);
            pet.setString(1,sodienthoai);
            rs = pet.executeQuery();
            ButtonGroup group = new ButtonGroup();
            group.add(rdbNu);
            group.add(rdbNam);
            while(rs.next())
            {
                txtSDT.setText(rs.getString("sodienthoai"));
                txtUsername.setText(rs.getNString("HoTen"));
                txtPass.setText(rs.getString("password"));
                if(rs.getString("GioiTinh").equals("Nữ"))
                {
                    rdbNu.setSelected(true);
                    rdbNam.setSelected(false);
                }
                else
                {
                    rdbNam.setSelected(true);
                    rdbNu.setSelected(false);  
                }
                txtEmail.setText(rs.getNString("Email"));
                txtDiachi.setText(rs.getNString("DiaChi"));         
            }
            txtSDT.setEditable(false);
            txtPass.setEditable(false);
            rs.close();
            pet.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoipass;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton cbbUpdateTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTextPane txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}