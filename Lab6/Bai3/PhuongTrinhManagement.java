package Lab6.Bai3;

import java.util.Scanner;

public class PhuongTrinhManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Propeties pt1 = new Propeties();

        System.out.println("------------Phuong trinh 1------------");
        System.out.println("Nhap a: ");
        pt1.setA(sc.nextInt());
        System.out.println("Nhap b: ");
        pt1.setB(sc.nextInt());
        System.out.println("Nhap c: ");
        pt1.setC(sc.nextInt());

        Propeties pt2 = new Propeties();

        System.out.println("------------Phuong trinh 2------------");
        System.out.println("Nhap a: ");
        pt2.setA(sc.nextInt());
        System.out.println("Nhap b: ");
        pt2.setB(sc.nextInt());
        System.out.println("Nhap c: ");
        pt2.setC(sc.nextInt());

        pt1.timDelta();
        pt2.timDelta();

    }
}
