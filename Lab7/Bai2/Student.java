package Lab7.Bai2;

public class Student {
    private int id;
    private String name;
    private float maths;
    private float literature;
    private float english;

    public Student() {
    }

    public Student(int id, String name, float maths, float literature, float english) {
        this.id = id;
        this.name = name;
        this.maths = maths;
        this.literature = literature;
        this.english = english;
    }

    public float getMaths() {
        return maths;
    }

    public float getLiterature() {
        return literature;
    }

    public float getEnglish() {
        return english;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public void setLiterature(float literature) {
        this.literature = literature;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float diemTrungBinh(){
        float dtb= (maths + literature + english)/3;

        if (dtb >= 8.5){
            System.out.println("Xep loai gioi");
        }else if (dtb >= 6.5){
            System.out.println("Xep loai kha");
        }else if (dtb >= 5) {
            System.out.println("Xep loai trung binh");
        }else if (dtb >= 3.5) {
            System.out.println("Xep loai yeu ");
        }else if (dtb <3.5 && dtb>=0) {
            System.out.println("Xep loai kem");
        }else {
            System.out.println("Error !!!!!");
        }

        return (maths + literature + english)/3;
    }

    public void xemThongTin(){
        System.out.print("id: " + id);
        System.out.print("- name: " + name);
        System.out.print("- maths: " + maths);
        System.out.print("- literature: " + literature);
        System.out.print("- english: " + english + "\n");
    }

    public void xetHocBong(){
        float xepLoai = (maths + literature + english)/3;
        if (xepLoai >= 8.5){
            System.out.println("Duoc cap hoc bong !");
        }else {
            System.out.println("Khong duoc cap hoc bong !");
        }
    }

    public void xetLenLop(){
        float dk = (maths + literature + english)/3;
        if (dk >= 5.0){
            System.out.println("Duoc len lop !");
        } else if (dk >= 3.5) {
            System.out.println("Phai thi lai !");
        } else if (dk < 3.5 && dk >= 0) {
            System.out.println("O lai lop !");
        }else {
            System.out.println("Error !!!!");
        }
    }
}
