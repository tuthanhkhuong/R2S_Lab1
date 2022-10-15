package Lab5.Bai2;

import Lab5.Bai2.Rectangle;

import java.util.Scanner;

public class RectangleManagement {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();
        System.out.println("Nhập chiều dài HCN: ");
        rec.setX(sc.nextDouble());
        System.out.println("Nhập chiều rộng HCN: ");
        rec.setY(sc.nextDouble());

        rec.Result();


    }

}
