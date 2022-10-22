package BTLTHDT.CacKhaiNiemCoBan.Bai1;

import java.util.Scanner;

public class TamGiac {
    private double ma;
    private double mb;
    private double mc;

    public TamGiac() {
    }

    public TamGiac(double ma, double mb, double mc) {
        if (ma < 0 || ma >= mb + mc){
            this.ma = 0;
        }else {
            this.ma= ma;
        }
        System.out.println("ERROR");

        if (mb < 0 || mb >= ma + mc){
            this.mb = 0;
        }else {
            this.mb= mb;
        }
        System.out.println("ERROR");

        if (mc < 0 || mc >= ma + mb){
            this.mc = 0;
        }else {
            this.mc= mc;
        }
        System.out.println("ERROR");

        /*this.ma= ma;
        this.mb= mb;
        this.mc= mc;*/
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
        this.ma = ma;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    public void setMc(double mc) {
        this.mc = mc;
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
        ma= sc.nextDouble();

        System.out.println("Nhap vao mb: ");
        mb= sc.nextDouble();

        System.out.println("Nhap vao mc: ");
        mc= sc.nextDouble();
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
