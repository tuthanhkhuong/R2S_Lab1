package Lab2;

import java.util.Scanner;

public class Lab2_Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a= sc.nextInt();

        System.out.print("Nhập b: ");
        int b= sc.nextInt();

        System.out.print("Nhập c: ");
        int c= sc.nextInt();

        String kq = "";

        if (a > 0 && b > 0 && c > 0) {
            if ((a+b>c) && (b+c>a) && (a+c>b)){
                kq="Tam giac";
                if (a>b){
                    kq=kq+" deu";
                }
            }
        }else
            System.out.println("Loi!!!!!");
        System.out.println(kq);
    }
}
