package BTLTHDT.CacKhaiNiemCoBan.Bai3;

public class HinhTron extends ToaDo{
    private ToaDo tam;
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi(){
        return banKinh * 2 * 3.14;
    }

    public double tinhDienTich(){
        return banKinh * banKinh * 3.14;
    }

    public void hienThi(){
        System.out.printf("Hinh tron co tam: " ,tam);
        System.out.printf("voi ban kinh: " ,banKinh);
        System.out.printf("Co dien tich va Chu vi lan luot la %.2f va %.2f"
                ,tinhDienTich(),tinhChuVi());
    }
}
