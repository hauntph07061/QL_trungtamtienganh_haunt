/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HocVien;
import Helper.Jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducye
 */
public class HocVienDAO {
    public void insert(HocVien hv) {
        String sql = "INSERT INTO hocvien (maHV, hoTen, gioiTinh, ngaySinh, SDT, Email, anh) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Jdbc.executeUpdate(sql,
                hv.getMaHV(),
                hv.getHoTen(),
                hv.getGioiTinh(),
                hv.getNgaySinh(),
                hv.getSDT(),
                hv.getEmail(),
                hv.getAnh());
        }

    public void update(HocVien hv) {
        String sql = "UPDATE hocvien SET hoTen=?, gioiTinh=?, ngaySinh=?, SDT=?, Email=?, anh=? WHERE maHV=?";
        Jdbc.executeUpdate(sql,
                hv.getHoTen(),
                hv.getGioiTinh(),
                hv.getNgaySinh(),
                hv.getSDT(),
                hv.getEmail(),
                hv.getAnh(),
                hv.getMaHV());
    }

    public void delete(String MaCD) {
        String sql = "DELETE FROM hocvien WHERE maHV=?";
        Jdbc.executeUpdate(sql, MaCD);
    }

    public List<HocVien> select() {
        String sql = "SELECT * FROM hocvien";
        return select(sql);
    }

    public HocVien findById(String mahv) {
        String sql = "SELECT * FROM HocVien WHERE maHV=?";
        List<HocVien> list = select(sql, mahv);
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
