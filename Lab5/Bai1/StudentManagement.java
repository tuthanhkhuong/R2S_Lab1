package Lab5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Student sv1 = new Student();
        System.out.println("Nhap ten sinh vien 1: ");
        sv1.setTenSV(sc.nextLine());
        System.out.println("Nhap ma so sinh vien 1: ");
        sv1.setMsSV(sc.nextInt());
        sc.nextLine();

        Student sv2 = new Student();
        System.out.println("Nhap ten sinh vien 2: ");
        sv2.setTenSV(sc.nextLine());
        System.out.println("Nhap ma so sinh vien 2: ");
        sv2.setMsSV(sc.nextInt());
        sc.nextLine();

        Student sv3 = new Student();
        System.out.println("Nhap ten sinh vien 3: ");
        sv3.setTenSV(sc.nextLine());
        System.out.println("Nhap ma so sinh vien 3: ");
        sv3.setMsSV(sc.nextInt());
        sc.nextLine();

        sv1.sayHello();
        sv2.sayHello();
        sv3.sayHello();
    }
}
