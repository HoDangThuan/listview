package com.example.lenovo.listview;

/**
 * Created by Lenovo on 06-Mar-18.
 */

public class DienThoai {
    private String ten, mota;
    private int hinh, icon;

    public DienThoai(String ten, String mota, int hinh, int icon) {
        this.ten = ten;
        this.mota = mota;
        this.hinh = hinh;
        this.icon = icon;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTen() {
        return ten;
    }

    public String getMota() {
        return mota;
    }

    public int getHinh() {
        return hinh;
    }

    public int getIcon() {
        return icon;
    }
}
