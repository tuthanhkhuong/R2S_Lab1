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

    public void rutTien(Account account){
        System.out.println("\nNhap so tien muon rut: ");
        int tienMuonRut= sc.nextInt();

        if (soDuTK >=0 && this.getSoTK() == soTK){
            if (soDuTK >= tienMuonRut){
                soDuTK = soDuTK - tienMuonRut;
                System.out.println("\nRut tien thanh cong !");
            }else {
                System.out.println("\nTai khoan khong co du tien de rut !");
            }
        }
        System.out.printf("\nSo tai khoan: " + getSoTK());
        System.out.println("\nSo du tai khoan: " + soDuTK);
    }



    public void napTien() {
        System.out.println("\nNhap so tien muon nap: ");
        int tienMuonNap= sc.nextInt();

        if (soDuTK >= 0 ){
            soDuTK = soDuTK + tienMuonNap;
            System.out.println("\nNap tien thanh cong !");
        }else {
            System.out.println("Error !!");
        }
        System.out.println("\nSo tai khoan: " + soTK);
        System.out.println("\nSo du tai khoan: " + soDuTK);
    }
}
