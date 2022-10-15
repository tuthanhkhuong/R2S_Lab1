package Lab5.Bai1;

import java.util.Scanner;

public class Student {
    private int msSV;

    private String tenSV;


    public Student() {
    }

    public Student(int msSV, String tenSV) {
        this.msSV = msSV;
        this.tenSV = tenSV;
    }

    public int getMsSV() {
        return msSV;
    }

    public void setMsSV(int msSV) {
        this.msSV = msSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void sayHello(){
        String info = String.format("Hello! I am %s , ID number: %d \n",tenSV,msSV);
        System.out.printf(info);
    }

    /*
    public void fillInfo(Scanner sc) {
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
    }
    */

}
