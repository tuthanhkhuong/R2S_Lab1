package Lab6.Bai2;

import java.util.Scanner;

public class Properties {
    private int a;

    private int b;

    public Properties() {
    }

    public Properties(int a) {
        this.a = a;
    }

    public Properties(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int tinhChuVi(){
        return  (a + b)*2;
    }

    public int tinhDienTich(){
        return a*b;
    }

    public void veTuGiac() {
        if (a == 0 || b == 0) {
            System.out.println("\nKhong the ve hinh !!!");
        } else if (a != 0 || b != 0) {
            for (int i = 1; i <= a; ++i) {
                for (int j = 1; j <= b; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public void ketQua(){
        String info = String.format("\nChu vi la: %d Dien tich la: %d\n",tinhChuVi(),tinhDienTich());
        System.out.printf(info);
    }


}
