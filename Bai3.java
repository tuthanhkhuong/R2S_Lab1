import java.util.Scanner;

public class Bai3 {

    // Bai 3.1 Nhap 2 so x va y tinh tong hieu tich thuong
    /*public static void main(String[] args){
        int x;
        int y;
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap vao x: ");
        x = sc.nextInt();

        System.out.print("Nhap vao y: ");
        y = sc.nextInt();

        System.out.println("tong: "+ (x+y));
        System.out.println("hieu: "+ (x-y));
        System.out.println("tich: "+ (x*y));
        System.out.println("thuong: " + (float)x/y);
        System.out.println("phandu: "+ (x%y));
    }*/


    // Bai 3.2 Chuyen do C sang do F
    /*public static void main(String[] args){
        double c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao do C: ");
        c = sc.nextDouble();

        double f=  (double) (9*c/5) + 32 ;
        System.out.println(c+ "Do C = "+ f+ "Do F" );

    }*/


    // Bai 3.3 Tinh tong va trung binh cong
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
        System.out.println("Tong diem 3 mon = " + (x+y+z));
        System.out.println("Trung binh cong diem 3 mon = " +tbc);
    }
}
