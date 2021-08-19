/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.GiaoVien;
import Helper.Jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haunguyen
 */
public class GiaoVienDAO {
    public void insert(GiaoVien gv) {
        String sql = "INSERT INTO giaovien (maGV, hoTen, pass, vaiTro, SDT, Email, anh) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Jdbc.executeUpdate(sql,
                gv.getMaGV(),
                gv.getHoTen(),
                gv.getPass(),
                gv.getVaiTro(),
                gv.getSDT(),
                gv.getEmail(),
                gv.getAnh());
        }

    public void update(GiaoVien gv) {
        String sql = "UPDATE giaovien SET maGV=?,hoTen=?, pass=?, vaiTro=?, SDT=?, Email=?, anh=? WHERE maGV=?";
        Jdbc.executeUpdate(sql,
                gv.getMaGV(),
                gv.getHoTen(),
                gv.getPass(),
                gv.getVaiTro(),
                gv.getSDT(),
                gv.getEmail(),
                gv.getAnh());
    }

    public void delete(String maGV) {
        String sql = "DELETE FROM hocvien WHERE maGV=?";
        Jdbc.executeUpdate(sql, maGV);
    }
// return select(sql);
//    public List<GiaoVien> select() {
//        String sql = "SELECT * FROM GiaoVien";
//       return select(sql);
//    }
    public List<GiaoVien> select(){
        String sql="select * from GiaoVien";
     return (List<GiaoVien>) select(sql);
    }

    public GiaoVien findById(String maGV) {
        String sql = "SELECT * FROM HocVien WHERE maGV=?";
        List<GiaoVien> list = (List<GiaoVien>) select(sql, maGV);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<HocVien> select(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Jdbc.executeQuery(sql, args);
                while (rs.next()) {
                    HocVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private HocVien readFromResultSet(ResultSet rs) throws SQLException {
        HocVien hv = new HocVien();
        hv.setMaHV(rs.getString("MaHV"));
        hv.setHoTen(rs.getString("HoTen"));
        hv.setGioiTinh(rs.getBoolean("GioiTinh"));
        hv.setNgaySinh(rs.getDate("NgaySinh"));
        hv.setSDT(rs.getString("SDT"));
        hv.setEmail(rs.getString("Email"));
        hv.setNgayDK(rs.getDate("NgayDK"));
        hv.setAnh(rs.getString("Anh"));
        return hv;
        
    }
}
