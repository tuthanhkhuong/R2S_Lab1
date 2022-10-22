package Lab7.Bai2;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student= new Student();

        System.out.println("Nhap id: ");
        student.setId(sc.nextInt());

        System.out.println("Nhap name: ");
        student.setName(sc.next());

        System.out.println("Nhap maths");
        student.setMaths(sc.nextFloat());

        System.out.println("Nhap literature");
        student.setLiterature(sc.nextFloat());

        System.out.println("Nhap english");
        student.setEnglish(sc.nextFloat());

        System.out.println("\n----------Xem thông tin của đối tượng----------");
        student.xemThongTin();

        System.out.println("\n----------Xếp loại của đối tượng----------");
        student.diemTrungBinh();

        System.out.println("\n----------Xét học bổng----------");
        student.xetHocBong();

        System.out.println("\n----------Xem đối tượng có được lên lớp hay không----------");
        student.xetLenLop();
    }
}
