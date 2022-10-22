package Lab7.Bai1;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        v1.nhapXe();
      //  v2.nhapXe();
      //  v3.nhapXe();

        System.out.println("\n-----Hiển thị toàn bộ thông tin xe-----");
        v1.hienThiThongTin();
      //  v2.hienThiThongTin();
      //  v3.hienThiThongTin();

        System.out.println("\n-----Bảng kê tiền thuế trước bạ của toàn bộ xe -----\n");
        v1.thueTruocBa();
      //  v2.thueTruocBa();
      //  v3.thueTruocBa();

    }
}
