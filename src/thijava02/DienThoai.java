/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thijava02;

import java.io.Serializable;

/**
 *
 * @author THUYVU
 */
public class DienThoai implements Serializable {
    private String tenSP;
    private String hang;
    private double giaSP;

    public DienThoai(String tenSP, String hang, double giaSP) {
        this.tenSP = tenSP;
        this.hang = hang;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "tenSP=" + tenSP + ", hang=" + hang + ", giaSP=" + giaSP + '}';
    }
    
    public String getStatus(double gia) {
        if (gia > 1000) {
            return "Tot";
        } else {
            return "Binh thuong";
        }
    }
}
