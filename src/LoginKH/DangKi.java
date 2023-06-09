/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginKH;
import org.apache.commons.validator.routines.EmailValidator;
import DataBase.DBAccess;
import javax.swing.JOptionPane;
import java.util.regex.Pattern; 
import javax.swing.ButtonGroup;

/**
 *
 * @author ASUS
 */
public class DangKi extends javax.swing.JFrame {
    static String saltvalue = PassBasedEnc.getSaltvalue(30);
    /**
     * Creates new form DangKi
     */
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    public DangKi() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rdbNam);
        group.add(rdbNu);
    }
  

    public static boolean isValidEmail(String email) {
       // create the EmailValidator instance
       EmailValidator validator = EmailValidator.getInstance();

       // check for valid email addresses using isValid method
       return validator.isValid(email);
   }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangki = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtHoten = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        ckcShowpass = new javax.swing.JCheckBox();
        lbLoiEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng kí tài khoản");
        setMinimumSize(new java.awt.Dimension(340, 450));
        setPreferredSize(new java.awt.Dimension(331, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangki.setBackground(new java.awt.Color(255, 0, 0));
        btnDangki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/Favorites_16x16.png"))); // NOI18N
        btnDangki.setText("Đăng kí");
        btnDangki.setActionCommand("DangKi");
        btnDangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangki, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 100, 30));

        btnThoat.setBackground(new java.awt.Color(153, 153, 255));
        btnThoat.setForeground(new java.awt.Color(51, 51, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        txtHoten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHotenKeyTyped(evt);
            }
        });
        getContentPane().add(txtHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 170, -1));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 130, 30));

        jLabel3.setText("Số điện thoại");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel4.setText("Mật khẩu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel5.setText("Họ và Tên");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, -1));

        jLabel7.setText("Địa Chỉ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, -1, -1));

        txtEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtEmailInputMethodTextChanged(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, -1));

        jLabel8.setText("Giới Tính");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        rdbNam.setText("Nam");
        rdbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNamActionPerformed(evt);
            }
        });
        getContentPane().add(rdbNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        rdbNu.setText("Nữ");
        rdbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNuActionPerformed(evt);
            }
        });
        getContentPane().add(rdbNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, 20));

        lbLoiEmail.setText("✓");
        getContentPane().add(lbLoiEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 20, 20));

        jScrollPane1.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imageDangki.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        TaikhoanKH frm = new TaikhoanKH();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed
        private Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20}");
      
    private void btnDangkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkiActionPerformed
        String generatedPassword = null;
        String sodienthoai = txtSDT.getText();
        String hoten=txtHoten.getText();
        String diachi=txtDiachi.getText();
        String email=txtEmail.getText();
        String gt="";
        String password = new String(txtPass.getPassword());
        ButtonGroup group = new ButtonGroup();
        group.add(rdbNam);
        group.add(rdbNu);

        if(rdbNu.isSelected() == true)
        {
            gt = "0";
        }
        else
        {
            gt = "1";
        }     
        pattern.matcher(password).matches();
         
            if(pattern.matcher(password).matches()==true)
            {
                String encryptedpassword = PassBasedEnc.generateSecurePassword(password, saltvalue);  
                DBAccess acc = new DBAccess();
                int kq = acc.Update("insert into Taikhoan values('"+sodienthoai+"','"+encryptedpassword+"',N'"+hoten+"','"+email+"',N'"+diachi+"','"+gt+"','"+saltvalue+"')  ");
                if(kq!=0){
                    JOptionPane.showMessageDialog(null,"Đăng kí thành công");    
                    DangNhap_1 frm = new DangNhap_1();
                    frm.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Đăng kí thất bại");
                }
            }
            else
            {
                DangKi.infoBox("Mật khẩu cần chữ in hoa,chữ thường ,số và kí tự đặt biệt, hãy chọn mật khẩu mới !", "THÔNG BÁO"); 
            }
    }//GEN-LAST:event_btnDangkiActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if ((txtPass.getText() + evt.getKeyChar()).length() > 20) {
        evt.consume();
    }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtHotenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHotenKeyTyped
         if ((txtHoten.getText() + evt.getKeyChar()).length() > 30) {
        evt.consume();
        }
    }//GEN-LAST:event_txtHotenKeyTyped

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
        // TODO add your handling code here:
        if ((txtSDT.getText() + evt.getKeyChar()).length() > 11) {
        evt.consume();
        }
    }//GEN-LAST:event_txtSDTKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        
        if(isValidEmail(txtEmail.getText()))
        {
            lbLoiEmail.setText("✓");
        }
        else
            lbLoiEmail.setText("x");
        
    }//GEN-LAST:event_txtEmailKeyTyped

    private void rdbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNamActionPerformed

    private void rdbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNuActionPerformed

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPass.setEchoChar((char)0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckcShowpassActionPerformed

    private void txtEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtEmailInputMethodTextChanged
        
    }//GEN-LAST:event_txtEmailInputMethodTextChanged
   
    
    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) 
       {
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
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangki;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbLoiEmail;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTextPane txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
