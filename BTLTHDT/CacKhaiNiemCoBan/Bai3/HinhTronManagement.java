package BTLTHDT.CacKhaiNiemCoBan.Bai3;

import java.util.Scanner;

public class HinhTronManagement {
    public static void main(String[] args) {
        ToaDo toaDo = new ToaDo(5,5);

        //Lam sao de truyen tham so hinh tron tam 0(5,5)
        // vao cons 2 tham so trong HinhTron
      //  HinhTron ht = new HinhTron(5,10.5);


        Scanner sc = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        System.out.println("Nhap ban kinh: ");

        ht.setBanKinh(sc.nextDouble());
        ht.hienThi();
    }
}
