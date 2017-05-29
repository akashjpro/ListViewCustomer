package com.akashjpro.listviewcustomer;

/**
 * Created by Akashjpro on 9/1/2016.
 */
public class TraiCay {
    private String ten;
    private String moTa;
    private Integer hinhTraiCay;

    public TraiCay(Integer hinhTraiCay, String moTa, String ten) {
        this.hinhTraiCay = hinhTraiCay;
        this.moTa = moTa;
        this.ten = ten;
    }

    public Integer getHinhTraiCay() {
        return hinhTraiCay;
    }

    public void setHinhTraiCay(Integer hinhTraiCay) {
        this.hinhTraiCay = hinhTraiCay;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
