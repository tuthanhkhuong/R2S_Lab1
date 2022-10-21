package Lab6.Bai4;

public class PhanSo {
    private int tuSo;

    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGonPhanSo(){
        int i = timUSCLN(tuSo,mauSo);
        tuSo = tuSo / i;
        mauSo = mauSo / i;

    }

    public PhanSo congPhanSo(PhanSo ps2){
        int ts = tuSo* ps2.mauSo + ps2.tuSo*mauSo;
        int ms = mauSo* ps2.mauSo;
       // PhanSo p = new PhanSo(ts,ms);
       // System.out.println("Tổng hai phân số = " + p.tuSo + "/" + p.mauSo);
        return new PhanSo(ts,ms);
    }

    public void hienThiPhanSo(){
        if (tuSo*mauSo<0){
            System.out.println("\t" + Math.abs(tuSo)+ "/" + Math.abs(mauSo));
        }else {
            System.out.println("\t" + Math.abs(tuSo)+ "/" + Math.abs(mauSo));
        }
    }


}
