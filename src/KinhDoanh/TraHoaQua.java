/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KinhDoanh;

import DataBase.DBAccess;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static LoginKH.DangNhap_1.sodienthoai;

/**
 *
 * @author Administrator
 */
public class TraHoaQua extends java.awt.Frame {
    Connection con;
    public PreparedStatement pet;
    public static ResultSet rs = null ;
    public Statement stmt;

    /**
     * Creates new form TraHoaQua
     */
    public TraHoaQua() {
        initComponents();
        LoadImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btnAnh2 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        btnAnh16 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnAnh13 = new javax.swing.JButton();
        btnAnh14 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnAnh15 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnThoat = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(660, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 223, 125, 111));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Trà hoa quả");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnAnh16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh16ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh16, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 83, 130, 110));

        btnAnh13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh13ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh13, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 83, 130, 110));

        btnAnh14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh14ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh14, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 223, 130, 110));

        btnAnh15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh15ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh15, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 83, 130, 110));

        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void LoadImage(){
        int MenuTHQ = 5;
        JButton[] btnList2 = {btnAnh2,btnAnh13,btnAnh14,btnAnh15,btnAnh16};
        for(int i = 1; i <= MenuTHQ; i++)
        {
            ImageIcon icon = new ImageIcon("./src/Image/teaMenu/" + i + ".jpg");
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(btnList2[i-1].getWidth(), btnList2[i-1].getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaleIcon = new ImageIcon(imgScale);
            btnList2[i-1].setIcon(scaleIcon);
        }
    }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnAnh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh2ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP02");
            while(rs.next())
            {
                btnAnh2.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh2.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh2.setText("");
    }//GEN-LAST:event_btnAnh2ActionPerformed

    private void btnAnh16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh16ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP16");
            while(rs.next())
            {
                btnAnh16.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh16.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh16.setText("");
    }//GEN-LAST:event_btnAnh16ActionPerformed

    private void btnAnh13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh13ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP13");
            while(rs.next())
            {
                btnAnh13.setText(rs.getString("IDSP"));
                //btnAnh13.setText(rs.getString("Anh"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh13.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh13.setText("");
    }//GEN-LAST:event_btnAnh13ActionPerformed

    private void btnAnh14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh14ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP14");
            while(rs.next())
            {
                btnAnh14.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh14.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh14.setText("");
    }//GEN-LAST:event_btnAnh14ActionPerformed

    private void btnAnh15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh15ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP15");
            while(rs.next())
            {
                btnAnh15.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh15.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh15.setText("");
    }//GEN-LAST:event_btnAnh15ActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        Product frm = new Product();
        this.setVisible(false);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(TraSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraHoaQua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnh13;
    private javax.swing.JButton btnAnh14;
    private javax.swing.JButton btnAnh15;
    private javax.swing.JButton btnAnh16;
    private javax.swing.JButton btnAnh2;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
