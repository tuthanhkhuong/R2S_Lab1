package Lab8.Bai1;

import java.util.Scanner;

public class Staff {
    protected String ten;
    protected int maSo;
    protected int luongCb;

    protected int heSoL = 1;
    protected int thamNien;

    Scanner sc = new Scanner(System.in);
    public Staff() {
    }

    public Staff(String ten, int maSo, int luongCb, int thamNien) {
        this.ten = ten;
        this.maSo = maSo;
        this.luongCb = luongCb;
        this.thamNien = thamNien;
    }

    public String getTen() {
        return ten;
    }

    public int getMaSo() {
        return maSo;
    }

    public int getLuongCb() {
        return luongCb;
    }

    public int getHeSoL() {
        return heSoL;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public void setLuongCb(int luongCb) {
        this.luongCb = luongCb;
    }

    public void setThamNien(int thamNien) {
        if(thamNien <0){
            this.thamNien = 0;
        } else {
            this.thamNien = thamNien;
        }
    }

    public int tinhLuong(){
        int luongThucLanh=0;
        if (heSoL%5==0){
            for (int i = 0; i < 50; i++) {
                luongThucLanh = luongCb * (heSoL *i);
            }
        }
        return luongCb * heSoL;
    }

    public void nhapThongTinNV(){
        System.out.println("Nhap ma so nhan vien: ");
        maSo = sc.nextInt();

        System.out.println("Nhap ten nhan vien: ");
        ten = sc.next();

        System.out.println("Nhap luong can ban nhan vien: ");
        luongCb = sc.nextInt();

        System.out.println("Nhap tham nien nhan vien: ");
        setThamNien(sc.nextInt());

    }

    public void xuatThongTinNV(){
        System.out.println("----------Thong tin NV----------");
        System.out.println("Ten: " + ten);
        System.out.println("Ma so: " + maSo);
        System.out.println("Luong co ban: " + luongCb);
        System.out.println("Tham nien: " + thamNien);
        System.out.println("He so luong: " + heSoL);
    }
}
