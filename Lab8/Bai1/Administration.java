package Lab8.Bai1;

public class Administration extends Staff {
    protected  int phuCap;

    public Administration(String ten, int maSo, int luongCb, int thamNien, int phuCap) {
        super(ten, maSo, luongCb, thamNien);
        this.phuCap = phuCap;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        if (phuCap <0){
            this.phuCap = 0;
        }else {
            this.phuCap = phuCap;
        }
    }

    @Override
    public int tinhLuong(){
        return 0;
    }

    @Override
    public void xuatThongTinNV() {
        System.out.println("----------Thong tin NV----------");
        System.out.println("Ten: " + ten);
        System.out.println("Ma so: " + maSo);
        System.out.println("Luong co ban: " + luongCb);
        System.out.println("Tham nien: " + thamNien);
        System.out.println("He so luong: " + heSoL);
        System.out.println("Phu cap: " + phuCap);
    }


}
