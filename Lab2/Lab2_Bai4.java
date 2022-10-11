package Lab2;

import java.util.Scanner;

public class Lab2_Bai4 {
    public static void main(String[] args) {
        boolean isLeaf = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap nam: ");
        int year=sc.nextInt();

        System.out.println("Moi ban nhap thang: ");
        byte month= sc.nextByte();

        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("Thang co 31 ngay");
                break;

            case  4,6,9,11:
                System.out.println("Thang co 30 ngay");
                break;

            case 2:
                if(year%4 ==0){
                    isLeaf=false;
                }else{
                    isLeaf = true;
                }
                if (year%400==0) isLeaf=true;

                if (isLeaf) System.out.println("Thang co 29 ngay");
                else System.out.println("Thang co 28 ngay");
                break;

            default:
                System.out.println("Error !!!!");
        }
    }
}
