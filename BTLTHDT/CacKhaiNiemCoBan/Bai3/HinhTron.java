package BTLTHDT.CacKhaiNiemCoBan.Bai3;

import java.util.Scanner;

public class HinhTron extends ToaDo{
    private String tam;
    private double banKinh;

    Scanner sc = new Scanner(System.in);
    public HinhTron() {
    }

    public HinhTron(String tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi(){
        return banKinh * 2 * 3.14;
    }

    public double tinhDienTich(){
        return banKinh * banKinh * 3.14;
    }

    @Override
    public String toString() {
        String print = String.format("Hinh tron co tam: %s(%.1f,%.1f)" +
                        " Voi ban kinh: %.2f " +
                " Co dien tich va Chu vi lan luot la %.2f va %.2f"
                ,tam,getX(),getY(),banKinh,tinhDienTich(),tinhChuVi());
        return print;
    }

}
