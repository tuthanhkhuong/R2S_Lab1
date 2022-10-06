package Lab2;

import java.util.Scanner;

public class Lab2_Bai2 {
    public static void main(String[] args){
        double x,y,z;
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap vao diem Toan: ");
        x = sc.nextDouble();
        System.out.print("Nhap vao diem Ly: ");
        y = sc.nextDouble();
        System.out.print("Nhap vao diem Hoa: ");
        z = sc.nextDouble();

        double tbc = (x+y+z)/ 3;
        System.out.println("Trung binh cong diem 3 mon = " +tbc);

        if(tbc <5){
            System.out.print("XL Yeu");
        }
        if(tbc <6.5){
            System.out.print("XL Trung Binh");
        }
        if(tbc <8){
            System.out.print("XL Kha");
        }
        if(tbc <10){
            System.out.print("XL Gioi");
        }

    }
}
