package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main (String [] args){
        int diem = 10;
        int Giaban, Giamua;

        String ketQua = "";

        Scanner scanner = new Scanner(System.in);


        while (true) {
            Random rd = new Random();
            // số máy ra được random từ 1 đến 5
            Giaban = 1 + rd.nextInt(5);

            System.out.print("Moi ban nhap vao gia mua: ");
            Giamua = scanner.nextInt();

            if (Giamua > Giaban) {
                ketQua = "==> Giá trị giá mua nhập \n" +
                        "vào cao hơn giá trị giá bán.Mời đoán lại !";
                System.out.println(ketQua);
                diem--;
            } else if(Giamua < Giaban){
                ketQua = "==>  Giá trị giá mua nhập \n" +
                        "vào thấp hơn giá trị giá bán.Mời đoán lại !";
                System.out.println(ketQua);
                diem++;
            }

            if (diem == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (diem == 10) {
                System.out.println("Chuc mung! Ban da chien thang!");
                break;
            }
        }
    }
}
