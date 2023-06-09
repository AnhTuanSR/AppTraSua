/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KinhDoanh;

import DataBase.DBAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.SQLException;
import static LoginKH.DangNhap_1.sodienthoai;
import static KinhDoanh.GioHang.TongTien;
import java.util.Calendar;
/**
 *
 * @author ASUS
 */
public class ThanhToanOL extends javax.swing.JFrame {
    Connection con;
    public PreparedStatement pet,pet1;
    public static ResultSet rs = null, rs1 = null ;
    

    /**
     * Creates new form GiaoHang
     */
    public ThanhToanOL() {
        initComponents();
        LoadData(); 
        LoadData2();
        long millis=System.currentTimeMillis();   
        java.sql.Date date=new java.sql.Date(millis);   
        cldLich.setDate(date);
        cldLich.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbLoaiThanhToan = new javax.swing.JComboBox<>();
        btnThanhtoan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnGiohang = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSonha = new javax.swing.JTextPane();
        cbbQuan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        txtPhuong = new javax.swing.JTextField();
        lblTongtien = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKhuyenmai = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMucKM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnTrove = new javax.swing.JButton();
        cldLich = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thanh Toán");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("TOCTOC");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Địa chỉ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Tổng tiền");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Loại thanh toán");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        cbbLoaiThanhToan.setBackground(new java.awt.Color(255, 204, 255));
        cbbLoaiThanhToan.setForeground(new java.awt.Color(51, 51, 51));
        cbbLoaiThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thẻ ATM nội địa", "Tiền mặt", "Momo" }));
        getContentPane().add(cbbLoaiThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 200, -1));

        btnThanhtoan.setBackground(new java.awt.Color(255, 0, 0));
        btnThanhtoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThanhtoan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhtoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/Favorites_16x16.png"))); // NOI18N
        btnThanhtoan.setText("Thanh toán");
        btnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanActionPerformed(evt);
            }
        });
        getContentPane().add(btnThanhtoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("Số điện thoại");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 30));

        btnGiohang.setBackground(new java.awt.Color(255, 255, 0));
        btnGiohang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGiohang.setForeground(new java.awt.Color(102, 102, 255));
        btnGiohang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/giohang.jpg"))); // NOI18N
        btnGiohang.setText("Cart");
        btnGiohang.setPreferredSize(new java.awt.Dimension(85, 25));
        btnGiohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiohangActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiohang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        btnHome.setBackground(new java.awt.Color(255, 255, 0));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(102, 102, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Positive/Positive_16x16.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setText("Số nhà/Đường");

        jLabel7.setText("Quận/Huyện");

        jScrollPane1.setViewportView(txtSonha);

        cbbQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12", "Quận Gò Vấp", "Quận Thủ Dức", "Quận Bình Thạnh", "Quận Phú Nhuận", "Quận Tân Bình", "Quận Tân Phú", "Quận Bình Tân" }));

        jLabel8.setText("Thành Phố");

        jLabel9.setText("Phường");

        txtTP.setText("tp.Hồ Chí Minh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(cbbQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhuong))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 320, 200));

        lblTongtien.setBackground(new java.awt.Color(153, 255, 255));
        lblTongtien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTongtien.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(lblTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setText("Ngày đặt");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 0));
        jLabel12.setText("Dịp khuyến mãi");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jScrollPane2.setViewportView(txtKhuyenmai);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 180, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 0));
        jLabel13.setText("Số lượng còn");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 60, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Khuyến mãi");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));
        getContentPane().add(txtMucKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 60, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel15.setText("%");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 20, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("VND");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        btnTrove.setBackground(new java.awt.Color(255, 255, 153));
        btnTrove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTrove.setForeground(new java.awt.Color(0, 0, 204));
        btnTrove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo/Undo_16x16.png"))); // NOI18N
        btnTrove.setText("Trở về");
        btnTrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroveActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrove, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, 30));
        getContentPane().add(cldLich, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 150, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OL.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 715));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadData()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            Connection con = DriverManager.getConnection(url);
            String sql = "select sodienthoai from GioHang where sodienthoai = ? group by sodienthoai" ;  
            String sql1 = "select * from KhuyenMai where TinhTrangKM = N'Mở'";
            pet = con.prepareStatement(sql);
            pet1 = con.prepareStatement(sql1);
            pet.setString(1, sodienthoai);
            rs = pet.executeQuery();
            rs1 = pet1.executeQuery();
            while(rs.next())
            {
                txtSDT.setText(rs.getString("sodienthoai"));
            }
            while(rs1.next())
            {
                txtKhuyenmai.setText(rs1.getString("DipKhuyenMai"));
                txtSoluong.setText(rs1.getString("SoLuong"));
                txtMucKM.setText(rs1.getString("MucKM"));
                int sl = rs1.getInt("SoLuong");
                if(sl == 0)
                {
                    txtKhuyenmai.setText("");
                    txtMucKM.setText("");
                }
                
            }
            rs.close();
            rs1.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        txtTP.setEditable(false);
        txtKhuyenmai.setEditable(false);
        txtSoluong.setEditable(false);
        txtMucKM.setEditable(false);
    }
    public void LoadData2()
    {
        if(txtSDT.getText().equals(""))
        {
            txtSDT.setEditable(true);
        }
        else
        {
            txtSDT.setEditable(false);
        }
        double MucKhuyenMai = 0;
        MucKhuyenMai = Double.parseDouble(txtMucKM.getText());     
        double TongTienTT = TongTien - (TongTien * (MucKhuyenMai * 1/100));
        lblTongtien.setText(""+TongTienTT);
    }
    private void btnGiohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiohangActionPerformed
        // TODO add your handling code here:
        GioHang frm = new GioHang();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnGiohangActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        acc.connect();
        if(txtSonha.getText().equals("") || txtPhuong.getText().equals("") || txtSDT.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "vui lòng điền đầy đủ thông tin");
        }
        else
        {
            String DipKM = txtKhuyenmai.getText();
            int SoLuong = Integer.parseInt(txtSoluong.getText());
            if(SoLuong == 0)
            {
                txtMucKM.setText("" + 0);
            }
            else
            {
                SoLuong = SoLuong - 1;
            }
            int MucKhuyenMai = Integer.parseInt(txtMucKM.getText());
            String sodienthoai = txtSDT.getText();
            String sonha = txtSonha.getText();
            String phuong = "Phường " + txtPhuong.getText();
            String quan = (String) cbbQuan.getSelectedItem();
            String thanhpho = txtTP.getText();
            String diachigiaohang = sonha + ", " + phuong + ", " + quan + ", " + thanhpho;
            String LoaiTT = (String) cbbLoaiThanhToan.getSelectedItem();
            Date NgayDat = new Date(cldLich.getDate().getTime());
            SimpleDateFormat formaterGio = new SimpleDateFormat("HH:mm:ss");         
            String GioDat = formaterGio.format(Calendar.getInstance().getTime()) ;
            System.out.println(GioDat +","+ NgayDat);
            String Tinhtrang = "Chưa giao hàng";
            double TongTien = Double.parseDouble(lblTongtien.getText()) ;
            TongTien = TongTien - (TongTien * (MucKhuyenMai * 1/100));
            int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đặt hàng ???","Xác nhận",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result  == JOptionPane.YES_OPTION)
            {
                try {
                    acc.InsertGiaoHang(sodienthoai,diachigiaohang,LoaiTT,NgayDat,TongTien,Tinhtrang,MucKhuyenMai,GioDat);
                    acc.Update("update KhuyenMai set SoLuong = '"+SoLuong+"' where DipKhuyenMai = N'"+DipKM+"'");
                } catch (SQLException ex) {
                    Logger.getLogger(ThanhToanOL.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Đặt hàng thành công !"
                    +"\n"+ "Cảm ơn quý khách đã tin dùng sản phẩm của chúng tôi!"
                    +"\n\n"+"\t\t\t\t"+ "Hẹn gặp lại!!");
                this.setVisible(false);
                Home frm = new Home();
                frm.setVisible(true);
                Camon_nhantin cm = new Camon_nhantin();
                cm.setVisible(true);
            }
        }
        Load();
    }//GEN-LAST:event_btnThanhtoanActionPerformed

    private void btnTroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroveActionPerformed
        // TODO add your handling code here:
        if(sodienthoai == null)
        {
            LoaiGiaoHang frm = new LoaiGiaoHang();
            this.setVisible(false);
            frm.setVisible(true);
        }
        else
        {
            GioHang frm = new GioHang();
            this.setVisible(false);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnTroveActionPerformed
    public void Load()
    {
        DBAccess acc = new DBAccess();
        acc.connect();
        acc.Update("update GioHang set IDHD = (select IDHD from GiaoHang where IDHD = (select MAX(IDHD) from GiaoHang)) where IDHD = 'null' and sodienthoai = '"+sodienthoai+"' ");
        acc.Update("update QLGioHang set IDHD = (select IDHD from GiaoHang where IDHD = (select MAX(IDHD) from GiaoHang)) where IDHD = 'null' and sodienthoai = '"+sodienthoai+"' ");
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
            java.util.logging.Logger.getLogger(ThanhToanOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToanOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToanOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToanOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToanOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiohang;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnThanhtoan;
    private javax.swing.JButton btnTrove;
    private javax.swing.JComboBox<String> cbbLoaiThanhToan;
    private javax.swing.JComboBox<String> cbbQuan;
    private com.toedter.calendar.JDateChooser cldLich;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTongtien;
    private javax.swing.JTextPane txtKhuyenmai;
    private javax.swing.JTextField txtMucKM;
    private javax.swing.JTextField txtPhuong;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextPane txtSonha;
    private javax.swing.JTextField txtTP;
    // End of variables declaration//GEN-END:variables
}
