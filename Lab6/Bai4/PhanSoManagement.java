package Lab6.Bai4;

import java.util.Scanner;

public class PhanSoManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo ps3 = new PhanSo();

        System.out.println("-------Phan so 1-------");

        System.out.println("Nhap tu so: ");
        ps1.setTuSo(sc.nextInt());

        System.out.println("Nhap mau so: ");
        ps1.setMauSo(sc.nextInt());

        System.out.println("-------Phan so 2-------");

        System.out.println("Nhap tu so: ");
        ps2.setTuSo(sc.nextInt());

        System.out.println("Nhap mau so: ");
        ps2.setMauSo(sc.nextInt());

        System.out.println("-------Hien thi 2 phan so-------");

        System.out.println("Phan so thu 1: ");
        ps1.hienThiPhanSo();

        System.out.println("Phan so thu 2: ");
        ps2.hienThiPhanSo();

        System.out.println("-------Cong 2 phan so-------");
        ps3=ps1.congPhanSo(ps2);
        ps3.hienThiPhanSo();

        System.out.println("-------Rut gon 2 phan so-------");
        ps3.rutGonPhanSo();
        ps3.hienThiPhanSo();

    }
}
