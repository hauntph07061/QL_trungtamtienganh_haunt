/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ducye
 */
public class GiaoVien {
    String maGV, hoTen,pass, email, anh;
    Boolean vaiTro;
    int SDT;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String hoTen, String pass, String email, String anh, Boolean vaiTro, int SDT) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.pass = pass;
        this.email = email;
        this.anh = anh;
        this.vaiTro = vaiTro;
        this.SDT = SDT;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    
    
}
