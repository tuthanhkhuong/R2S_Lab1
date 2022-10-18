package Lab6.Bai2;

public class TuGiacManagement {
    public static void main(String[] args) {
        Properties t1 = new Properties();
        t1.veTuGiac();
        t1.phanLoaiTG();
        t1.ketQua();

        System.out.println("----------------*----------------");

        Properties t2 = new Properties(7);
        t2.veTuGiac();
        t2.phanLoaiTG();
        t2.ketQua();

        System.out.println("----------------*----------------");

        Properties t3 = new Properties(3 ,5);
        t3.veTuGiac();
        t3.phanLoaiTG();
        t3.ketQua();
    }
}
