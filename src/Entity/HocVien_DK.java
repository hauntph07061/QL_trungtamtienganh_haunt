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
public class HocVien_DK {
    String hoTen,email,anh;
    Boolean gioiTinh;
    int SDT;
    Date ngaySinh, ngayDK;

    public HocVien_DK() {
    }

    public HocVien_DK(String hoTen, String email, String anh, Boolean gioiTinh, int SDT, Date ngaySinh, Date ngayDK) {
        this.hoTen = hoTen;
        this.email = email;
        this.anh = anh;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.ngaySinh = ngaySinh;
        this.ngayDK = ngayDK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
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
