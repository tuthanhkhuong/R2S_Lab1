package Lab5.Bai3;

public class Worker {
    private String ten;
    private int namSinh;
    private String congViec;
    private String noiLam;

    public Worker() {
    }

    public Worker(String ten, int namSinh, String congViec, String noiLam) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.congViec = congViec;
        this.noiLam = noiLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getNoiLam() {
        return noiLam;
    }

    public void setNoiLam(String noiLam) {
        this.noiLam = noiLam;
    }

    public void output(){
        String info = String.format("Bạn tên là: %s. Bạn %s về %s tại %s\n",ten,getAge(),congViec,findWorkplace());
        System.out.printf(info);
        //System.out.printf("Ban ten la: %s",ten);
        //System.out.println("Ban: %d" );
    }

    public String findWorkplace(){
        switch (congViec){
            case "Giao duc":
                return "Truong hoc";


            case "Y Te":
                return "Benh vien";


            case "Luat":
                return "Toa an";


            case "Cong so":
                return "Van phong";


            default: case "Khac":
                return "Khong ro";

        }
    }

    public String getAge() {
        int age;

        age = 2022 - namSinh;
        if (age<20){
            return "Dang hoc";
        }else {
            return "Dang lam viec";
        }

    }
}
