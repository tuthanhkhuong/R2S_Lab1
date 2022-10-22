package BTLTHDT.CacKhaiNiemCoBan.Bai1;

import java.util.Scanner;

public class TamGiac {
    private double ma;
    private double mb;
    private double mc;

    public TamGiac() {
    }

    public TamGiac(double ma, double mb, double mc) {
        this.ma= ma;
        this.mb= mb;
        this.mc= mc;
    }

    public double getMa() {
        return ma;
    }

    public double getMb() {
        return mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMa(double ma) {
        if (ma < 0){
            this.ma = 0;
        }else
            this.ma= 0;

    }

    public void setMb(double mb) {
        if (mb < 0){
            this.mb = 0;
        }else
            this.mb= 0;

    }

    public void setMc(double mc) {
        if (mc < 0){
            this.mc = 0;
        }else
            this.mc= 0;

    }

    public double tinhChuVi(){
        return (ma + mb + mc)/2;
    }

    public double tinhDienTich(){
        double cv = (ma + mb + mc)/2;
        double number= cv * (cv - ma) * (cv - mb) * (cv - mc);
        double squareRoot = Math.sqrt(number);
        return squareRoot;
    }

    public void hienThi(){
        System.out.printf("\nChu vi tam giac la: %.2f",tinhChuVi());
        System.out.printf("\nDien tich tam giac la: %.2f",tinhDienTich());
    }

    public String toString(){
        return "\nCanh ma: " + ma + "\nCanh mb: " + mb + "\nCanh mc: " + mc;
    }

    public void nhapTamGiac(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ma: ");
        setMa(sc.nextDouble());

        System.out.println("Nhap vao mb: ");
        setMb(sc.nextDouble());

        System.out.println("Nhap vao mc: ");
        setMc(sc.nextDouble());
    }

    public void laTamGiac(){
        String kq = "";

        if (ma > 0 && mb > 0 && mc > 0) {
            boolean dk1 = (ma+mb>mc);
            boolean dk2= (mb+mc>ma);
            boolean dk3 = (ma+mc>mb);
            if (dk1 && dk2 && dk3)
            {
                if (ma==mb && mb==mc){
                    System.out.println("\nTam giac deu !");
                }else
                if (ma==mb || ma==mc || mb==mc){
                    System.out.println("\nTam giac can !");
                }else
                if ( ma*ma==mb*mb+mc*mc){
                    System.out.println("\nTam giac vuong tai A !");
                }else
                if (mb*mb==ma*ma+mc*mc){
                    System.out.println("\nTam giac vuong tai B !");
                }else
                if (mc*mc==ma*ma+mb*mb){
                    System.out.println("\nTam giac vuong tai C !");
                }else {
                    System.out.println("\nTam giac thuong");
                }
            }else {
                System.out.println("\n3 canh khong tao thanh tam giac");
            }
        }

    }
}
