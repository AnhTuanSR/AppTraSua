package DataBase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luan
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Date;
import static LoginKH.DangNhap_1.sodienthoai;

public class DBAccess {
    private Connection con;
    private Statement stmt;
    public DBAccess(){
        try {
            MyConnect mycon = new MyConnect();
            con = mycon.getConnect();
            stmt = con.createStatement();
        }catch(Exception e){
            
        }
    }
    public void InsertSP(String IDSP,String TenSP,String IDLoai, String ChiTiet,int Gia) throws SQLException{
        Statement st = con.createStatement();
        if(IDLoai=="Trà sữa")
        {
           IDLoai="L01";
        }
        else{
            if(IDLoai=="Trà sữa xanh")
            {
                IDLoai="L02";
            }
            else {
                if(IDLoai=="Trà hoa quả")
                {
                    IDLoai="L03";
                }
            }
        }
        String sql = "insert into Sanpham values('"+IDSP+"',N'"+TenSP+"','"+IDLoai+"',N'"+ChiTiet+"','"+Gia+"')  ";
        st.executeUpdate(sql); 
    }
    public void InsertNV(String IDNV, String Username, String IDGT , String SDT, String IDCV, String Diachi) throws SQLException{
        Statement st = con.createStatement();
        if(IDCV=="Nhân viên order")
        {
           IDCV="CV01";
        }
        else{
            if(IDCV=="Tài xế")
            {
                IDCV="CV02";
            }
            else 
            {
                if(IDCV=="Quản lí")
                {
                    IDCV="CV03";
                }
                else
                {
                    if(IDCV=="Phục vụ")
                    {
                        IDCV="CV04";
                    }
                    else
                    {
                        IDCV="CV05";
                    }
                }
            }
        }
        if(IDGT == "Nam")
        {
            IDGT="0";
        }
        else
        {
            IDGT="1";
        }
        String sql = "insert into NhanVien values('"+IDNV+"',N'"+Username+"','"+SDT+"','"+IDCV+"',N'"+Diachi+"','"+IDGT+"')  ";
        st.executeUpdate(sql); 
    }
    public void Insert(int IDDonHang,String Ten) throws SQLException{
        Statement st = con.createStatement();
        String sql = "insert into DON values('"+IDDonHang+"',N'"+Ten+"')  ";
        st.executeUpdate(sql); 
    }
    public void InsertKM(String IDKM,String DipKhuyenMai,int MucKM,int SoLuong,String TinhTrangKM) throws SQLException{
        Statement st = con.createStatement();
        String sql = "insert into KhuyenMai values(N'"+IDKM+"',N'"+DipKhuyenMai+"','"+MucKM+"','"+SoLuong+"','"+TinhTrangKM+"') ";
        st.executeUpdate(sql); 
    }
     public void InsertGH(String IDKH,String IDSP, int SoLuong,String Topping, int TongGiaSP) throws SQLException{
        Statement st = con.createStatement();
        String sql = "insert into GioHang values('"+IDKH+"',N'"+IDSP+"','"+SoLuong+"',N'"+Topping+"','"+TongGiaSP+"')  ";
        st.executeUpdate(sql); 
    }
    public void InsertGiaoHang(String sodienthoai,String DCgiaohang,String IDLTT,Date NgayDat, double TongTien, String TinhTrang,int MucKM,String GioDat) throws SQLException{
        Statement st = con.createStatement();
        if(IDLTT=="Thẻ ATM nội địa")
        {
            IDLTT="TT1";
        }
        else{
            if(IDLTT=="Tiền mặt")
            {
                IDLTT="TT2";
            }
            else
            { 
                IDLTT="TT3";
            }
        } 
        String sql = "insert into GiaoHang values('"+sodienthoai+"',N'"+DCgiaohang+"','"+IDLTT+"','"+NgayDat+"','"+TongTien+"',N'"+TinhTrang+"','"+MucKM+"','"+GioDat+"')  ";
        st.executeUpdate(sql); 
    }
     public void InsertOderTC(String IDLTT,String NgayDat, int MucKhuyenMai , double TongTien) throws SQLException{
        Statement st = con.createStatement();
        if(IDLTT=="Thẻ ATM nội địa")
        {
            IDLTT="TT1";
        }
        else{
            if(IDLTT=="Tiền mặt")
            {
                IDLTT="TT2";
            }
            else
            { 
                IDLTT="TT3";
            }
        } 
        String sql = "insert into ThongKeOderTaiCho values('"+IDLTT+"','"+NgayDat+"','"+MucKhuyenMai+"','"+TongTien+"')  ";
        st.executeUpdate(sql); 
    }
    public int Update(String str){
        try{
            int i = stmt.executeUpdate(str);
            return i;
        }catch(Exception e){
            return -1;
        }
    }
    public ResultSet Query(String srt){
        try{
            ResultSet rs=stmt.executeQuery(srt);
            return rs;
            
        }catch(Exception e){
            return null;
        }
    }
    public void connect()
    {
       MyConnect m = new MyConnect();
       m.getConnect();
    }
    public ResultSet GetData1() throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from NhanVien,Chucvu,GioiTinh where NhanVien.IDCV = Chucvu.IDCV and NhanVien.IDGT = GioiTinh.IDGT";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetData2() throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Sanpham,Loai where Sanpham.IDLoai = Loai.IDLoai";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetDataTK1(String tab, String tab2) throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Taikhoan,GioiTinh where HoTen = N'"+tab+"' and sodienthoai = N'"+tab2+"' and Taikhoan.IDGT = GioiTinh.IDGT";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetDataTK3(String tab) throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Taikhoan,GioiTinh where HoTen = N'"+tab+"' and Taikhoan.IDGT = GioiTinh.IDGT";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetDataTK4(String tab) throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Taikhoan,GioiTinh where sodienthoai = N'"+tab+"' and Taikhoan.IDGT = GioiTinh.IDGT";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetData4(String tab) throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Sanpham,Loai where IDSP = '"+tab+"'";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet DataKhuyenMai() throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from KhuyenMai" ;
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetDataGH(String tab) throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Sanpham,Loai where IDSP = '"+tab+"'";
        kq = st.executeQuery(sql);
        return kq;
    }
    public ResultSet GetDataTK2() throws SQLException{
        ResultSet kq = null;
        Statement st = con.createStatement();
        String sql = "select * from Taikhoan,GioiTinh where Taikhoan.IDGT = GioiTinh.IDGT";
        kq = st.executeQuery(sql);
        return kq;
    }
    public void deleteTK(String tab) throws SQLException
    {
        Statement st = con.createStatement();
        String TK = "DELETE from Taikhoan,GioiTinh where sodienthoai = '"+tab+"'";
        st.executeUpdate(TK);
    }
    public void deleteSP(String tab) throws SQLException
    {
        Statement st = con.createStatement();
        String SP = "DELETE from Sanpham where IDSP = '"+tab+"' ";
        st.executeUpdate(SP);
    }
    public void deleteKM(String tab) throws SQLException
    {
        Statement st = con.createStatement();
        String KM = "DELETE from KhuyenMai where IDKM = '"+tab+"' ";
        st.executeUpdate(KM);
    }
    public void deleteNV(String tab) throws SQLException
    {
        Statement st = con.createStatement();
        String NV = "DELETE from NhanVien where IDNV = '"+tab+"' ";
        st.executeUpdate(NV);
    }
    public void deleteGH(String tab) throws SQLException
    {
        Statement st = con.createStatement();
        String SP = "DELETE from GioHang where IDGH = '"+tab+"' ";
        st.executeUpdate(SP);
    }
    public void UpdateSP(String IDSP,String TenSP,String IDLoai, String ChiTiet, String Gia) throws SQLException{
        Statement st = con.createStatement();
        if(IDLoai=="Trà sữa")
        {
           IDLoai="L01";
        }
        else{
            if(IDLoai=="Trà sữa xanh")
            {
                IDLoai="L02";
            }
            else {
                if(IDLoai=="Trà hoa quả")
                {
                    IDLoai="L03";
                } 
            }
        }
        String sql = "update Sanpham set TenSP = N'"+TenSP+"',IDLoai = '"+IDLoai+"',ChiTiet = N'"+ChiTiet+"',Gia = '"+Gia+"' where IDSP ='"+IDSP+"'";
        st.executeUpdate(sql); 
    }
    public void UpdateGH(int IDGH,String sodienthoai,String IDSP, int SoLuong,String Topping,int TongTienSP) throws SQLException{
        Statement st = con.createStatement();
        String sql = "update GioHang set sodienthoai = '"+sodienthoai+"',IDSP = '"+IDSP+"', SoLuong = '"+SoLuong+"',Topping = N'"+Topping+"',TongTienSP = '"+TongTienSP+"' where IDGH = '"+IDGH+"'  ";
        st.executeUpdate(sql); 
    }
    public void UpdateGH2(String IDHD) throws SQLException{
        Statement st = con.createStatement();
        String sql = "update GioHang set IDHD = '"+IDHD+"' where sodienthoai = '"+sodienthoai+"'";
        st.executeUpdate(sql); 
    }
    public void UpdateNV(String IDNV, String Username,String IDGT, String SDT, String IDCV, String Diachi) throws SQLException{
        Statement st = con.createStatement();
        if(IDCV=="Nhân viên order")
        {
           IDCV="CV01";
        }
        else{
            if(IDCV=="Tài xế")
            {
                IDCV="CV02";
            }
            else 
            {
                if(IDCV=="Quản lí")
                {
                    IDCV="CV03";
                }
                else
                {
                    if(IDCV=="Phục vụ")
                    {
                        IDCV="CV04";
                    }
                    else
                    {
                        IDCV="CV05";
                    }
                }
            }
        }
        if(IDGT == "Nam")
        {
            IDGT="0";
        }
        else
        {
            IDGT="1";
        }
        String sql = "update NhanVien set username = N'"+Username+"',SDT = '"+SDT+"',IDCV = '"+IDCV+"',Diachi = N'"+Diachi+"',IDGT = '"+IDGT+"' where IDNV = '"+IDNV+"'  ";
        st.executeUpdate(sql); 
    }
    public void UpdateTK(String sodienthoai, String HoTen, String Email, String Diachi, String password,String IDGT) throws SQLException{
        if(IDGT == "Nam")
        {
            IDGT="0";
        }
        else
        {
            IDGT="1";
        }
        Statement st = con.createStatement();
        String sql = "update Taikhoan set  HoTen = N'"+HoTen+"',Email = N'"+Email+"',Diachi = N'"+Diachi+"',password = '"+password+"',IDGT = '"+IDGT+"' where sodienthoai = '"+sodienthoai+"'  ";
        st.executeUpdate(sql); 
    }
}
