package Lab2;

import java.util.Scanner;

public class Lab2_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a' , 'A' :
                System.out.println("Ada");
                break;

            case 'b', 'B' :
                System.out.println("Basic");
                break;

            case 'c', 'C':
                System.out.println("Cobol");
                break;

            case 'd', 'D':
                System.out.println("Android");
                break;

            case 'f', 'F':
                System.out.println("Fortran");
                break;

            case 'w', 'W':
                System.out.println("Windows phone");
                break;

            default: {
                System.out.println("Bạn đã nhập sai.");
                break;
            }
        }
    }
}
