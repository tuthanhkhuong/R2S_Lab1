import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args){
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
    }
}
