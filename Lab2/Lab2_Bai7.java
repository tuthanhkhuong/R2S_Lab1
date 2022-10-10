package Lab2;

import java.util.Scanner;

public class Lab2_Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập gio: ");
        int gio= sc.nextInt();

        System.out.print("Nhập phut: ");
        int phut= sc.nextInt();

        System.out.print("Nhập giay: ");
        int giay= sc.nextInt();

        boolean isGio = (gio>0 && gio<=23);
        boolean isPhut = (phut>0 && phut<=60);
        boolean isGiay = (giay>0 && giay<=60);

        boolean isTime = false;

        if (isGio && isPhut && isGiay){
            isTime=true;
        }

        if (isTime){
            String thongtin= String.format("Thoi gian la: %d:%d:%d",gio,phut,giay);
            System.out.println(thongtin);
        }
    }
}
