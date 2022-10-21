package Lab7.Bai1;

import java.util.Scanner;

public class Vehicle {
    private String ten;
    private String tenLoai;
    private int dungTich;
    private int triGia;

    public Vehicle() {
    }

    public Vehicle(String ten, String tenLoai, int dungTich, int triGia) {
        this.ten = ten;
        this.tenLoai = tenLoai;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public String getTen() {
        return ten;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public int getTriGia() {
        return triGia;
    }

    public void setDungTich(int dungTich) {
        if (dungTich<0){
            dungTich=0;
        }
        this.dungTich = dungTich;
    }

    public void setTriGia(int triGia) {
        if (triGia<0){
            triGia=0;
        }
        this.triGia = triGia;
    }

    public void setTen(String ten) {
        if (ten == null){
            ten = "Khong biet";
        }
        this.ten = ten;
    }

    public void setTenLoai(String tenLoai) {
        if (tenLoai == null){
            tenLoai = "Khong biet";
        }
        this.tenLoai = tenLoai;
    }

    public void hienThiThongTin(){
        String info = String.format("\nTen chu xe la: %s " +
                "\nTen loai xe la: %s " +
                "\nDung tich xe la: %d " +
                "\nTri gia xe la: %d" +
                "\nThue truoc ba la: %d\n",ten,tenLoai,dungTich,triGia,thueTruocBa());
        System.out.printf(info);
    }

    public void nhapXe(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten chu xe: ");
        ten= sc.next();

        System.out.println("Nhap ten loai xe: ");
        tenLoai= sc.next();

        System.out.println("Nhap dung tich xe: ");
        dungTich= sc.nextInt();

        System.out.println("Nhap tri gia xe: ");
        triGia= sc.nextInt();

    }
    public int thueTruocBa(){
        int heSo=0;
        int thueTruocBa =heSo * triGia;
        if (dungTich<100){
            heSo=1;
        }else if (dungTich>=100 && dungTich<200){
            heSo=3;
        }else if (dungTich >= 200){
            heSo=5;
        }
        return heSo*triGia;
    }


}
