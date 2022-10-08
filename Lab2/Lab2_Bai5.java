package Lab2;

import java.util.Scanner;

public class Lab2_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a' :
                System.out.println("Ada");
                break;
            case 'b':
                System.out.println("Basic");
                break;
            case 'c':
                System.out.println("Cobol");
                break;
            case 'd':
                System.out.println("Android");
                break;
            case 'f':
                System.out.println("Fortran");
                break;
            case 'w':
                System.out.println("Windows phone");
                break;

            case 'A' :
                System.out.println("Ada");
                break;
            case 'B':
                System.out.println("Basic");
                break;
            case 'C':
                System.out.println("Cobol");
                break;
            case 'D':
                System.out.println("Android");
                break;
            case 'F':
                System.out.println("Fortran");
                break;
            case 'W':
                System.out.println("Windows phone");
                break;
            default: {
                System.out.println("Bạn đã nhập sai.");
                break;
            }
        }
    }
}
