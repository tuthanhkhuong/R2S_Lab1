package Lab5.Bai3;

import Lab5.Bai1.Student;

import java.util.Scanner;

public class WorkerManagement {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);

        Worker wk1 = new Worker();
        System.out.println("Nhap ten cong nhan 1: ");
        wk1.setTen(sc.nextLine());
        System.out.println("Nhap nam sinh cong nhan 1: ");
        wk1.setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap cong viec cong nhan 1: ");
        wk1.setCongViec(sc.nextLine());


        Worker wk2 = new Worker();
        System.out.println("Nhap ten cong nhan 2: ");
        wk2.setTen(sc.nextLine());
        System.out.println("Nhap nam sinh cong nhan 2: ");
        wk2.setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap cong viec cong nhan 2: ");
        wk2.setCongViec(sc.nextLine());


        Worker wk3 = new Worker();
        System.out.println("Nhap ten cong nhan 3: ");
        wk3.setTen(sc.nextLine());
        System.out.println("Nhap nam sinh cong nhan 3: ");
        wk3.setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap cong viec cong nhan 3: ");
        wk3.setCongViec(sc.nextLine());


        wk1.output();
        wk2.output();
        wk3.output();
    }
}
