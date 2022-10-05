import java.util.Scanner;

public class Bai3 {

    public static void TongHieuTichThuong(int x, int y){

        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap x: ");
        x = sc.nextInt();

        System.out.print("Nhap y: ");
        y = sc.nextInt();

        int tong= x+y;
        int hieu= x-y;
        int tich=x*y;
        int thuong= x/y;

        System.out.print("tong: "+ tong);
        System.out.print("hieu: "+ hieu);
        System.out.print("tich: "+ tich);
        System.out.print("thuong: "+ thuong);
    }
}
