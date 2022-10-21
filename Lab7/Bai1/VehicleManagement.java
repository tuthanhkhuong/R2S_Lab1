package Lab7.Bai1;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        v1.nhapXe();
        v2.nhapXe();
        v3.nhapXe();

        System.out.println("\n-----Bảng kê tiền thuế trước bạ của xe 1-----");
        v1.hienThiThongTin();
        v1.thueTruocBa();

        System.out.println("\n-----Bảng kê tiền thuế trước bạ của xe 2-----");
        v2.hienThiThongTin();
        v2.thueTruocBa();

        System.out.println("\n-----Bảng kê tiền thuế trước bạ của xe 3-----");
        v3.hienThiThongTin();
        v3.thueTruocBa();

    }
}
