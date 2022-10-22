package Lab7.Bai3;

import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ac1 = new Account();
        System.out.println("Nhap ma PIN: ");
        ac1.setMaPin(sc.nextInt());

        System.out.println("Nhap ten tai khoan: ");
        ac1.setTenTK(sc.next());

        System.out.println("Nhap so du tai khoan: ");
        ac1.setSoDuTK(sc.nextInt());

        Account ac2 = new Account();
        System.out.println("Nhap ma PIN: ");
        ac2.setMaPin(sc.nextInt());

        System.out.println("Nhap ten tai khoan: ");
        ac2.setTenTK(sc.next());

        System.out.println("Nhap so du tai khoan: ");
        ac2.setSoDuTK(sc.nextInt());

        System.out.println("\n--------Thay doi PIN tai khoan 1--------");
        ac1.thayDoiPin();

        System.out.println("\n--------Thong tin tai khoan 1--------");
        ac1.hienThongTin();
        ac1.rutTien();
        ac1.chuyenKhoan(ac2);

        System.out.println("\n--------Thong tin tai khoan 2--------");
        ac2.hienThongTin();
    }
}
