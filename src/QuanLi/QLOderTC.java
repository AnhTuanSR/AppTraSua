/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import DataBase.DBAccess;
import KinhDoanh.Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class QLOderTC extends javax.swing.JFrame {

    Connection con;
    public PreparedStatement pet,pet1;
    public static ResultSet rs = null ,rs1 = null,rs2 = null;
    public Statement stmt;
    /**
     * Creates new form QLOderTaicho
     */
    public QLOderTC() {
        initComponents();
        LoadData();
        setColumn();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabGiohang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabHoaDon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hóa đơn");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabGiohang.setBackground(new java.awt.Color(255, 255, 204));
        tabGiohang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tabGiohang.setForeground(new java.awt.Color(204, 0, 51));
        tabGiohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã giỏ hàng", "Tên SP", "Đơn Giá", "Số lượng", "Topping", "Tổng giá SP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabGiohang.setGridColor(new java.awt.Color(51, 51, 255));
        tabGiohang.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tabGiohang.setSelectionForeground(new java.awt.Color(255, 0, 0));
        tabGiohang.getTableHeader().setReorderingAllowed(false);
        tabGiohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabGiohangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabGiohang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 910, 210));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Tổng thu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, -1, 30));

        txtTongtien.setToolTipText("");
        txtTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongtienActionPerformed(evt);
            }
        });
        getContentPane().add(txtTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("HÓA ĐƠN TẠI QUÁN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        tabHoaDon.setBackground(new java.awt.Color(255, 255, 204));
        tabHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tabHoaDon.setForeground(new java.awt.Color(255, 0, 0));
        tabHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Loại thanh toán", "Ngày đặt", "Mức khuyến mãi", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabHoaDon.setGridColor(new java.awt.Color(51, 51, 255));
        tabHoaDon.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tabHoaDon.setSelectionForeground(new java.awt.Color(255, 0, 0));
        tabHoaDon.getTableHeader().setReorderingAllowed(false);
        tabHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabHoaDon);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 910, 200));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo/Undo_16x16.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMAGEQLTC.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LoadData()
    {
        DBAccess acc = new DBAccess();
        try
        {
            rs = acc.Query("select IDHDTC,NgayDat,TenLoaiTT,MucKhuyenMai,TongTien\n" +
                            "from ThongKeOderTaiCho,LoaiTT where LoaiTT.IDLTT = ThongKeOderTaiCho.IDLTT ");
            String [] arr = {"Mã hóa đơn","Ngày đặt","Loại thanh toán","Mức khuyến mãi","Tổng tiền"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs.next())
            {
                Vector vec = new Vector();
                vec.add(rs.getString("IDHDTC"));
                vec.add(rs.getString("NgayDat"));
                vec.add(rs.getString("TenLoaiTT"));
                vec.add(rs.getInt("MucKhuyenMai"));
                vec.add(rs.getString("TongTien"));

                model.addRow(vec);
            }
            rs2 = acc.Query("select sum(TongTien) as TongThu from ThongKeOderTaiCho");
            while(rs2.next())
            {
                txtTongtien.setText(rs2.getString("TongThu")+" VND");
            }
            tabHoaDon.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    public void setColumn()
    {
        tabHoaDon.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabHoaDon.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabHoaDon.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabHoaDon.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabHoaDon.getColumnModel().getColumn(4).setPreferredWidth(30);
        tabHoaDon.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        tabGiohang.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabGiohang.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabGiohang.getColumnModel().getColumn(2).setPreferredWidth(30);
        tabGiohang.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabGiohang.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabGiohang.getColumnModel().getColumn(5).setPreferredWidth(40);
        tabGiohang.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
    public void LoadDataSP (String IDHDTC) 
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            con = DriverManager.getConnection(url);
            String sql = "select IDGH,TenSP,Gia,SoLuong,Topping,TongTienSP\n" +
                        "from GioHangTC,Sanpham,ThongKeOderTaiCho\n" +
                        "where  Sanpham.IDSP = GioHangTC.IDSP and GioHangTC.IDHDTC = ? and GioHangTC.IDHDTC = ThongKeOderTaiCho.IDHDTC ";
            pet = con.prepareStatement(sql);
            pet.setString(1, IDHDTC);
            rs1 = pet.executeQuery();
            String [] arr = {"Mã giỏ hàng","Tên sản phẩm","Đơn giá","Số lượng","Topping","Tổng tiền sản phẩm"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs1.next())
            {
                Vector vec = new Vector();
                vec.add(rs1.getString("IDGH"));
                vec.add(rs1.getString("TenSP"));
                vec.add(rs1.getString("Gia"));
                vec.add(rs1.getInt("SoLuong")); 
                vec.add(rs1.getString("Topping"));
                vec.add(rs1.getInt("TongTienSP"));
                
                model.addRow(vec);
            }
            tabGiohang.setModel(model);
            rs1.close();
            pet.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    private void tabGiohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGiohangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabGiohangMouseClicked

    private void txtTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongtienActionPerformed

    private void tabHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHoaDonMouseClicked
        // TODO add your handling code here:
        int i = tabHoaDon.getSelectedRow();
        TableModel model = tabHoaDon.getModel();
        String IDHDTC = model.getValueAt(i, 0).toString();
        LoadDataSP(IDHDTC);
        setColumn();
    }//GEN-LAST:event_tabHoaDonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLOderTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLOderTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLOderTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLOderTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QLOderTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabGiohang;
    private javax.swing.JTable tabHoaDon;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
