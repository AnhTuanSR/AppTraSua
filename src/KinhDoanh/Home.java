/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KinhDoanh;
import LoginKH.TrangChu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static LoginKH.DangNhap_1.sodienthoai;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {
    Connection con;
    public PreparedStatement pet;
    public static ResultSet rs = null ;
    public Statement stmt;
    

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        LoadData(sodienthoai);
    }

   /* public Home()
    {
        initComponents();
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTaikhoan = new javax.swing.JButton();
        btnGiohang = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HomeTT = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuyItNow = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        txtSDT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnTaikhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnTaikhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTaikhoan.setForeground(new java.awt.Color(0, 0, 204));
        btnTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/User_16x16.png"))); // NOI18N
        btnTaikhoan.setText("Account");
        btnTaikhoan.setBorder(btnGiohang.getBorder());
        btnTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaikhoanActionPerformed(evt);
            }
        });

        btnGiohang.setBackground(new java.awt.Color(255, 255, 255));
        btnGiohang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGiohang.setForeground(new java.awt.Color(0, 0, 204));
        btnGiohang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/giohang.jpg"))); // NOI18N
        btnGiohang.setText("Cart");
        btnGiohang.setBorder(btnGiohang.getBorder());
        btnGiohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiohangActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 51, 153));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Globe/Globe_16x16.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnProduct.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(0, 51, 153));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/Favorites_16x16.png"))); // NOI18N
        btnProduct.setText("Product");
        btnProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTaikhoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGiohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaikhoan)
                    .addComponent(btnGiohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 550));

        HomeTT.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("TOCTOC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("MILK TEA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("FOR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("EVERYONE"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Welcome to TOCTOC !!!");

        btnBuyItNow.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyItNow.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBuyItNow.setText("BUY IT NOW!!");
        btnBuyItNow.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        btnBuyItNow.setMaximumSize(new java.awt.Dimension(165, 35));
        btnBuyItNow.setMinimumSize(new java.awt.Dimension(165, 35));
        btnBuyItNow.setPreferredSize(new java.awt.Dimension(165, 35));
        btnBuyItNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyItNowActionPerformed(evt);
            }
        });

        btnDangxuat.setBackground(new java.awt.Color(255, 255, 255));
        btnDangxuat.setForeground(new java.awt.Color(0, 0, 204));
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log Out/Log Out_16x16.png"))); // NOI18N
        btnDangxuat.setText("Log Out");
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pixlr-bg-result.png"))); // NOI18N

        javax.swing.GroupLayout HomeTTLayout = new javax.swing.GroupLayout(HomeTT);
        HomeTT.setLayout(HomeTTLayout);
        HomeTTLayout.setHorizontalGroup(
            HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTTLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeTTLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDangxuat)
                        .addContainerGap())
                    .addGroup(HomeTTLayout.createSequentialGroup()
                        .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeTTLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnBuyItNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(HomeTTLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        HomeTTLayout.setVerticalGroup(
            HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDangxuat))
                    .addComponent(jLabel8))
                .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeTTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(HomeTTLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(HomeTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuyItNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );

        jPanel1.add(HomeTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 0, -1, 549));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadData(String sodienthoai)
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            con = DriverManager.getConnection(url);
            String sql = "select sodienthoai from Taikhoan where sodienthoai = ? ";
            pet = con.prepareStatement(sql);
            pet.setString(1,sodienthoai);
            rs = pet.executeQuery();
            while(rs.next())
            {
                txtSDT.setText(rs.getString("sodienthoai"));        
            }
            rs.close();
            pet.close();
            con.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        if(txtSDT.getText().equals(""))
        {
            btnTaikhoan.setEnabled(false);
        }
    }
    private void btnTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaikhoanActionPerformed
        // TODO add your handling code here:
        Account frm = new Account();
        frm.setVisible(true);
    }//GEN-LAST:event_btnTaikhoanActionPerformed

    private void btnGiohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiohangActionPerformed
        // TODO add your handling code here:
        GioHang frm = new GioHang();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnGiohangActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        Product frm = new Product();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnBuyItNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyItNowActionPerformed
        // TODO add your handling code here:
        Product frm = new Product();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnBuyItNowActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        // TODO add your handling code here:
       TrangChu frm = new TrangChu();
       this.setVisible(false);
       frm.setVisible(true);
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
       Home frm = new Home();
       this.setVisible(false);
       frm.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeTT;
    private javax.swing.JButton btnBuyItNow;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnGiohang;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnTaikhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel txtSDT;
    // End of variables declaration//GEN-END:variables
}