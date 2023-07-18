package com.example.hoadonbanhang;

public class Khach_Hang {
    private String Ten;
    private String SDT;

    public Khach_Hang(String ten, String SDT) {
        Ten = ten;
        this.SDT = SDT;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSDT() {
        return SDT;
    }

    public String toString() {
        return "Tên: " + Ten + ", Số điện thoại: " + SDT;
    }
}
