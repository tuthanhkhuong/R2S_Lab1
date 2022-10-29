package Lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class User extends Account{
    private String ten;
    private String gioTinh;
    private String ngaySinh;
    private String noiSinh;
    private int sdt;
    private String email;

    public User() {
    }

    public User(String ten, String gioTinh, String ngaySinh, String noiSinh, int sdt, String email) {
        this.ten = ten;
        this.gioTinh = gioTinh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(String gioTinh) {
        this.gioTinh = gioTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Scanner sc = new Scanner(System.in);
    Account ac = new Account();

    public void nhapThongTin(){
        System.out.println("Nhap so tai khoan: ");
        ac.setSoTK(sc.nextInt());

        System.out.println("Nhap ten tai khoan: ");
        ten = sc.next();

        System.out.println("Nhap gioi tinh: ");
        gioTinh= sc.next();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
        try {
            System.out.println("Nhap ngay sinh: ");
            ngaySinh = sc.next();
            df.parse(ngaySinh); // parse dateString thành kiểu Date

        }
        catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
            System.out.println("Invalid date");
        }

        System.out.println("Nhap noi sinh: ");
        noiSinh = sc.next();

        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextInt();

        System.out.println("Nhap email: ");
        email = sc.next();
    }

    public void xuatThongTin(){
        System.out.println("\n----------Thong tin Khach hang----------");
        System.out.printf("\nSo tai khoan: %d" ,getSoTK());
        System.out.printf("\nTen tai khoan: %s" ,getTen());
        System.out.printf("\nGioi tinh: %s" ,getGioTinh());
        System.out.println("\nNgay sinh: " + getNgaySinh());
        System.out.printf("\nNoi sinh: %s" ,getNoiSinh());
        System.out.printf("\nSo dien thoai: %d" ,getSdt());
        System.out.printf("\nEmail: %s \n" ,getEmail());

    }
}
