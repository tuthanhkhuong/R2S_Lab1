package Lab9;

import java.util.Scanner;

public class Account{
    private String soTK;

    private int soDuTK;

    public Account() {
    }

    public Account(String soTK, int soDuTK) {
        this.soTK = soTK;
        this.soDuTK = soDuTK;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public int getSoDuTK() {
        return soDuTK;
    }

    public void setSoDuTK(int soDuTK) {
        this.soDuTK = soDuTK;
    }

    Scanner sc = new Scanner(System.in);

    public void rutTien(){
        System.out.println("\nNhap so tien muon rut: ");
        int tienMuonRut= sc.nextInt();

        if (soDuTK >0 ){
            if (soDuTK > tienMuonRut){
                soDuTK = soDuTK - tienMuonRut;
                System.out.println("\nRut tien thanh cong !");
            }else {
                System.out.println("\nTai khoan khong co du tien de rut !");
            }
        }
        System.out.println("\nSo tai khoan: " + soTK);
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
