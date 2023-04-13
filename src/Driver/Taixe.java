/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import DataBase.DBAccess;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.io.DataOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Administrator
 */
public class Taixe extends javax.swing.JFrame {
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    Connection con;
    public PreparedStatement pet,pet1;
    public static ResultSet rs = null ,rs1 = null;
    /**
     * Creates new form Taixe
     */
    public Taixe() {
        initComponents();
        LoadDataHD();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        msg_pre = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabDonhang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        cbDagiao = new javax.swing.JCheckBox();
        btnHoantatdonhang = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabSanpham = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tài xế giao hàng");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Tài Xế Giao Hàng");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 84, 280, 91));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thông báo đơn hàng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        msg_pre.setText("Soạn tin cho khách hàng");
        msg_pre.setToolTipText("");
        getContentPane().add(msg_pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 193, 280, 58));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        tabDonhang.setBackground(new java.awt.Color(255, 255, 153));
        tabDonhang.setForeground(new java.awt.Color(255, 51, 51));
        tabDonhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Số điện thoại", "Họ tên", "Ngày đăt", "Loại thanh toán", "Địa chỉ giao hàng", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabDonhang.getTableHeader().setReorderingAllowed(false);
        tabDonhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDonhangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabDonhang);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 84, 921, 170));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));
        getContentPane().add(txtHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 140, -1));

        cbDagiao.setText("Đã giao");
        getContentPane().add(cbDagiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 93, -1));

        btnHoantatdonhang.setBackground(new java.awt.Color(255, 255, 255));
        btnHoantatdonhang.setForeground(new java.awt.Color(0, 0, 153));
        btnHoantatdonhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/Favorites_16x16.png"))); // NOI18N
        btnHoantatdonhang.setText("Hoàn tất đơn hàng");
        btnHoantatdonhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoantatdonhangActionPerformed(evt);
            }
        });
        getContentPane().add(btnHoantatdonhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 460, -1, 35));

        tabSanpham.setBackground(new java.awt.Color(255, 255, 153));
        tabSanpham.setForeground(new java.awt.Color(255, 51, 51));
        tabSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tên sản phẩm", "Số lượng", "Topping", "Tổng tiền sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        tabSanpham.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabSanpham);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 920, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg4.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1160, -310, 2445, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadDataHD () 
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            con = DriverManager.getConnection(url);
            String sql = "select IDHD,GiaoHang.sodienthoai,HoTen,NgayDat,TongTien,TenLoaiTT,DCgiaohang \n" +
                         "from GiaoHang,LoaiTT,Taikhoan \n" +
                         "where GiaoHang.IDLTT = LoaiTT.IDLTT and TinhTrang = N'Chưa giao hàng' and GiaoHang.sodienthoai = Taikhoan.sodienthoai "+
                         "ORDER BY IDHD";
            pet = con.prepareStatement(sql);
            rs = pet.executeQuery();
            String [] arr = {"Mã hóa đơn","Số điện thoại","Họ tên","Ngày đặt", "Loại thanh toán","Địa chỉ giao hàng","Tổng tiền"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs.next())
            {
                //txtSDT.setText(rs.getString("sodienthoai"));
                Vector vec = new Vector();
                vec.add(rs.getInt("IDHD"));
                vec.add(rs.getString("sodienthoai"));
                vec.add(rs.getString("HoTen"));
                vec.add(rs.getString("NgayDat"));
                vec.add(rs.getString("TenLoaiTT"));
                vec.add(rs.getString("DCgiaohang"));
                vec.add(rs.getString("TongTien")); 
                
                model.addRow(vec);
            }
            tabDonhang.setModel(model);
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
    public void LoadDataSP (String IDHD) 
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=AppTraSua;user=DoanJava;password=12345";
            con = DriverManager.getConnection(url);
            String sql = "select QLGioHang.IDHD,TenSP,SoLuong,Topping,TongTienSP\n" +
                         "from QLGioHang,Sanpham,GiaoHang\n" +
                         "where QLGioHang.IDHD = GiaoHang.IDHD and QLGioHang.IDSP = Sanpham.IDSP and QLGioHang.IDHD = ? ";
            pet1 = con.prepareStatement(sql);
            pet1.setString(1, IDHD);
            rs1 = pet1.executeQuery();
            String [] arr = {"Mã hóa dơn","Tên sản phẩm","Số lượng","Topping","Tổng tiền sản phẩm"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs1.next())
            {
                Vector vec = new Vector();
                vec.add(rs1.getString("IDHD"));
                vec.add(rs1.getString("TenSP"));
                vec.add(rs1.getInt("SoLuong")); 
                vec.add(rs1.getString("Topping"));
                vec.add(rs1.getInt("TongTienSP"));
                
                model.addRow(vec);
            }
            tabSanpham.setModel(model);
            rs1.close();
            pet1.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        
    }
    public void XoaTrangTABBLE()
    {
        DefaultTableModel m = (DefaultTableModel)tabSanpham.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
    }
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       try{
         String msgout="";
        msgout=msg_pre.getText().trim();
        dout.writeUTF(msgout);
        }
        catch(Exception ex)
        {
            
        }      
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnHoantatdonhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoantatdonhangActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        acc.connect();
        int i = tabDonhang.getSelectedRow();
        TableModel model = tabDonhang.getModel();
        String IDHD = model.getValueAt(i, 0).toString();
        String HoTen = model.getValueAt(i, 2).toString();
        if(cbDagiao.isSelected() == true)
        {
            String TinhTrang = cbDagiao.getText();
            acc.Update("update GiaoHang set TinhTrang = N'"+TinhTrang+"' where IDHD = '"+IDHD+"'");
            JOptionPane.showMessageDialog(this, "Đã hoàn tất đơn hàng số '"+"\t"+IDHD+" của "+HoTen+"' !!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vui lòng xác nhận đơn hàng đã giao !!!");
        }
        LoadDataHD();
        XoaTrangTABBLE();
        cbDagiao.setSelected(false);
    }//GEN-LAST:event_btnHoantatdonhangActionPerformed

    private void tabDonhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDonhangMouseClicked
        // TODO add your handling code here:
        int i = tabDonhang.getSelectedRow();
        TableModel model = tabDonhang.getModel();
        txtHoten.setText(model.getValueAt(i, 2).toString());
        String IDHD = model.getValueAt(i, 0).toString();
        LoadDataSP(IDHD);
        txtHoten.setEditable(false);
    }//GEN-LAST:event_tabDonhangMouseClicked

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
            java.util.logging.Logger.getLogger(Taixe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taixe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taixe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taixe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taixe().setVisible(true);
            }
        });
        String msgin="";
        try{
            ss = new ServerSocket(1201);
            s=ss.accept();
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            
            while(!msgin.equals("exit"))
            {
                msgin=din.readUTF();
                msg_area.setText(msg_area.getText().trim() + "\n Khách Hàng: "+ msgin);
             
            }     
        }
        catch(Exception e){
            
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoantatdonhang;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox cbDagiao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTextArea msg_area;
    private static javax.swing.JTextField msg_pre;
    private javax.swing.JTable tabDonhang;
    private javax.swing.JTable tabSanpham;
    private javax.swing.JTextField txtHoten;
    // End of variables declaration//GEN-END:variables
}
