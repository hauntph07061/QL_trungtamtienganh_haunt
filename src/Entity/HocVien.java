/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author ducye
 */
public class HocVien {
    String maHV,hoTen,Email,anh;
    Boolean gioiTinh;
    String SDT;
    Date ngaySinh, ngayDK;

    public HocVien() {
    }

    public HocVien(String maHV, String hoTen, String Email, String anh, Boolean gioiTinh, String SDT, Date ngaySinh, Date ngayDK) {
        this.maHV = maHV;
        this.hoTen = hoTen;
        this.Email = Email;
        this.anh = anh;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.ngaySinh = ngaySinh;
        this.ngayDK = ngayDK;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }
    
    
}
