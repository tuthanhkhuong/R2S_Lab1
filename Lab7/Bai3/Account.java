package Lab7.Bai3;

import java.util.Scanner;

public class Account {
    private int maPin;
    private int soDuTK;
    private String tenTK;

    public Account() {
    }

    public Account(int soDuTK, String tenTK) {
        this.soDuTK = soDuTK;
        this.tenTK = tenTK;
    }

    public int getSoDuTK() {
        return soDuTK;
    }

    public int getMaPin() {
        return maPin;
    }

    public void setSoDuTK(int soDuTK) {
        this.soDuTK = soDuTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public void setMaPin(int maPin) {
        this.maPin = maPin;
    }

    public void hienThongTin(){
        System.out.println("Ten tai khoan: " + tenTK);
        System.out.println("So du tai khoan: " + soDuTK);
    }
    public void rutTien(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap so tien muon rut: ");
        int tienMuonRut= sc.nextInt();

        if (soDuTK >0){
            if (soDuTK > tienMuonRut){
                soDuTK = soDuTK - tienMuonRut;
                System.out.println("\nRut tien thanh cong !");
            }else {
                System.out.println("\nTai khoan khong co du tien de rut !");
            }
        }

        System.out.println("\nSo du tai khoan: " + soDuTK);
    }

    public void soDu(int tienMuonRut){
        soDuTK = soDuTK + tienMuonRut;
    }

    public void chuyenKhoan(Account ac1){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap so tien muon chuyen: ");
        int tienMuonChuyen= sc.nextInt();

        if (ac1.soDuTK > 0 && ac1.soDuTK <= ac1.getSoDuTK()){
            ac1.soDuTK = ac1.soDuTK + tienMuonChuyen;
            System.out.println("\nDa chuyen khoan thanh cong !");
        }else {
            System.out.println("\nTai khoan khong co du tien de chuyen !");
        }
    }

    public void thayDoiPin(){

    }


}
