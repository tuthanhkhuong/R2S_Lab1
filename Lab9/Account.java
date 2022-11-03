package Lab9;

import java.util.Scanner;

public class Account{
    private int soTK;
    private int soDuTK;

    public Account() {
    }

    public Account(int soTK, int soDuTK) {
        this.soTK = soTK;
        this.soDuTK = soDuTK;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public int getSoDuTK() {
        return soDuTK;
    }

    public void setSoDuTK(int soDuTK) {
        this.soDuTK = soDuTK;
    }

    Scanner sc = new Scanner(System.in);

    private static void close(int i) {
    }

    public void rutTien(){
        int id;
        int tienMuonRut=0;

        System.out.println("\nNhap so tai khoan: ");
        id= sc.nextInt();

        if (id == this.soTK){
            System.out.println("\nNhap so tien muon rut: ");
            tienMuonRut= sc.nextInt();
        }else{
            System.out.println("So tai khoan ban nhap sai !!!");
        }
        if (soDuTK >=0 && id == this.soTK){
            if (soDuTK >= tienMuonRut){
                soDuTK = soDuTK - tienMuonRut;
                System.out.println("\nRut tien thanh cong !");
            }else {
                System.out.println("\nTai khoan khong co du tien de rut !");
            }
            System.out.printf("\nSo tai khoan: " + soTK);
            System.out.println("\nSo du tai khoan: " + soDuTK);
        }

    }

    public void napTien() {
        int id;
        int tienMuonNap=0;

        System.out.println("\nNhap so tai khoan: ");
        id= sc.nextInt();

        if (id == this.soTK){
            System.out.println("\nNhap so tien muon nap: ");
            tienMuonNap= sc.nextInt();
        }else {
            System.out.println("So tai khoan ban nhap sai !!!");
        }
        if (soDuTK >= 0 && id == this.soTK){
            soDuTK = soDuTK + tienMuonNap;
            System.out.println("\nNap tien thanh cong !");
        }else {
            System.out.println("Khong the nap tien vo tai khoan !");
        }
        System.out.println("\nSo tai khoan: " + soTK);
        System.out.println("\nSo du tai khoan: " + soDuTK);
    }

    public void hienThiGD(){
        int id;
        int soLanGD = 0;

        System.out.println("\nNhap so tai khoan: ");
        id= sc.nextInt();

        if (id == this.soTK){
            System.out.println("The number of transaction are: " + soLanGD);
        }else {
            System.out.println("Loi !");
        }

    }

}
