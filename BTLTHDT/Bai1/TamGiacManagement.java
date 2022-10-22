package BTLTHDT.Bai1;

public class TamGiacManagement {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac();
        TamGiac tg2 = new TamGiac();
        TamGiac tg3 = new TamGiac();
        TamGiac tg4 = new TamGiac();
        TamGiac tg5 = new TamGiac();

        //Chua rang buoc duoc dk canh <0
        tg1.nhapTamGiac();

        System.out.println("\n---------Thong tin 3 canh tam giac---------");
        System.out.println(tg1);

        System.out.println("\n---------Chu vi, Dien tich---------");
        tg1.hienThi();

        System.out.println("\n---------Loai tam giac---------");
        tg1.laTamGiac();
    }
}
