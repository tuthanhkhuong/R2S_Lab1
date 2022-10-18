package Lab6.Bai1;

import java.util.Scanner;

public class Properties {
    private String tenDienThoai;

    private String hangSX;

    private int ram;

    private int giaTien;

    public Properties() {
    }

    public Properties(String tenDienThoai, String hangSX, int ram, int giaTien) {
        this.tenDienThoai = tenDienThoai;
        this.hangSX = hangSX;
        this.ram = ram;
        this.giaTien = giaTien;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void inputPhone(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap ten dien thoai: ");
        tenDienThoai= sc.next();

        System.out.println("Nhap hang san xuat: ");
        hangSX= sc.next();

        System.out.println("Nhap ram: ");
        ram= sc.nextInt();

        System.out.println("Nhap gia tien: ");
        giaTien= sc.nextInt();

    }

    public void showInfo(){
        String info = String.format("Ten dien thoai: " + tenDienThoai + "\nHang san xuat: "
        + hangSX + "\nRam: " + ram + "\nGia tien: " + giaTien);
        System.out.printf(info);
    }

    public String comparePhone(Properties s2){
        String soSanh="";
        if (getGiaTien() > s2.getGiaTien()){
            soSanh = String.format("\nDien thoai: %s mac hon %s",
                    getTenDienThoai(), s2.getTenDienThoai());
        }else if (getGiaTien() < s2.getGiaTien()){
            soSanh = String.format("\nDien thoai: %s re hon %s",
                    getTenDienThoai(), s2.getTenDienThoai());
        }else {
            soSanh = String.format("\nDien thoai: %s ngang gia %s",
                    getTenDienThoai(), s2.getTenDienThoai());
        }
        return soSanh;
    }
}
