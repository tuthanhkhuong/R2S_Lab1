package Lab2;

import java.util.Scanner;

public class Lab2_Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a");
        double a= sc.nextDouble();

        System.out.print("b");
        double b= sc.nextDouble();


        System.out.print("ch");
        char ch= sc.next().charAt(0);


        switch (ch){
            case '+':
                System.out.println("Phep tinh cong: " + a+b);
                break;
            case '-':
                System.out.println("Phep tinh tru: "+ (a-b));
                break;
            case '*':
                System.out.println("Phep tinh nhan: "+ (a*b));
                break;
            case '/':
                if (b!=0){
                    System.out.println("Phep tinh chia: " +a/b);
                    break;
                }


            default:{
                System.out.println("Nhap lai: ");
                break;

            }
        }
    }
}
