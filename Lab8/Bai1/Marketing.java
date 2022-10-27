package Lab8.Bai1;

public class Marketing extends Staff{
    protected int doanhSo;

    public Marketing() {
    }

    public Marketing(String ten, int maSo, int luongCb, int thamNien, int doanhSo) {
        super(ten, maSo, luongCb, thamNien);
        this.doanhSo = doanhSo;
    }

    public double hoaHong(double hh){
        if (doanhSo < 5000000) {
            System.out.println("Khong co hoa hong.");
        }else if (doanhSo < 10000000){
            hh = 0.05 * doanhSo;
        }else if (doanhSo < 20000000){
            hh = 0.1 * doanhSo;
        }else
            hh = 0.2 * doanhSo;
        return hh;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        if (doanhSo <0){
            this.doanhSo = 0;
        }else {
            this.doanhSo = doanhSo;
        }
    }

    @Override
    public int tinhLuong() {
        int luongThuclanh = 0;
        return luongThuclanh;
    }

    @Override
    public void xuatThongTinNV() {
        System.out.println("----------Thong tin NV----------");
        System.out.println("Ten: " + ten);
        System.out.println("Ma so: " + maSo);
        System.out.println("Luong co ban: " + luongCb);
        System.out.println("Tham nien: " + thamNien);
        System.out.println("He so luong: " + heSoL);
        System.out.println("Doanh so: " + doanhSo);
    }
}
