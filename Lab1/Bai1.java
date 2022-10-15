package Lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main (String [] args){
        //khai bao bien
        double length, width;
        double area, cir;

        //nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length=sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width=sc.nextDouble();

        //tinh chu vi, dien tich
        area=length*width;
        cir=(length+width)*2;
        System.out.println("Area = " +area);
        System.out.println("Cir = " +cir);

    }
}
