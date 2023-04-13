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
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class TraSuaXanh extends java.awt.Frame {

    /**
     * Creates new form TraSuaXanh
     */
    public TraSuaXanh() {
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
        btnAnh9 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnAnh5 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnAnh11 = new javax.swing.JButton();
        btnAnh17 = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("src/image/5.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnAnh12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(660, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnh9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh9ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 110));

        btnAnh5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 110));

        btnAnh11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh11ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 110));

        btnAnh17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh17ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, 110));

        btnAnh12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnh12ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnh12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 110));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Trà sữa xanh");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void LoadImage(){
        int MenuTSX = 5;
        JButton[] btnList1 = {btnAnh5,btnAnh9,btnAnh11,btnAnh12,btnAnh17};
        for(int i = 1; i <= MenuTSX; i++)
        {
            ImageIcon icon = new ImageIcon("./src/Image/milkTeaMenu/" + i + ".jpg");
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(btnList1[i-1].getWidth(), btnList1[i-1].getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaleIcon = new ImageIcon(imgScale);
            btnList1[i-1].setIcon(scaleIcon);
        }
    }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnAnh17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh17ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP17");
            while(rs.next())
            {
                btnAnh17.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh17.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh17.setText("");
    }//GEN-LAST:event_btnAnh17ActionPerformed

    private void btnAnh12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh12ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP12");
            while(rs.next())
            {
                btnAnh12.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh12.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh12.setText("");
    }//GEN-LAST:event_btnAnh12ActionPerformed

    private void btnAnh5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh5ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP05");
            while(rs.next())
            {
                btnAnh5.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh5.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh5.setText("");
    }//GEN-LAST:event_btnAnh5ActionPerformed

    private void btnAnh9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh9ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP09");
            while(rs.next())
            {
                btnAnh9.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh9.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh9.setText("");
    }//GEN-LAST:event_btnAnh9ActionPerformed

    private void btnAnh11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnh11ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.GetData4("SP11");
            while(rs.next())
            {
                btnAnh11.setText(rs.getString("IDSP"));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        String IDSP = btnAnh11.getText().toString();
        ChiTietSanPham frm = new ChiTietSanPham(IDSP);
        frm.setVisible(true);
        btnAnh11.setText("");
    }//GEN-LAST:event_btnAnh11ActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraSuaXanh().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnh11;
    private javax.swing.JButton btnAnh12;
    private javax.swing.JButton btnAnh17;
    private javax.swing.JButton btnAnh5;
    private javax.swing.JButton btnAnh9;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
