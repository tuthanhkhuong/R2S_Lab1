package Lab2;

import java.util.Scanner;

public class Lab2_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("So ngay trong thang");

        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();

        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        if ((thang <1 ) || (thang >12)){
            System.out.println("Nhap thang tu 1 den 12");
        }
        else
            if ((thang == 4) || (thang == 6) || (thang == 9) || (thang == 11)) {
            System.out.println("So ngay trong thang "+ thang+ " nam " + nam + " la: 30");
        }
        else
            if((thang == 1) || (thang == 3) || (thang == 5) || (thang == 7) || (thang == 8) || (thang == 10) || (thang == 12)) {
            System.out.println("So ngay trong thang "+ thang +" nam " + nam + " la: 31");
        }
        else
            if ((thang == 2) && ((nam % 4) == 0) && ((nam % 100) > 0)){
            System.out.println("So ngay trong thang "+ thang +" năm " + nam + " la: 29");
        }
        else {
            System.out.println("So ngay trong thang " + thang + " năm " + nam + " la: 28");
        }
    }
}
