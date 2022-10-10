package Lab3.Bai2;

import java.util.Scanner;

public class YC1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap: ");
        int n= sc.nextInt();

        long gt=1;

        for (int i = 1; i <= n; i++) {
            gt = gt* i;
        }
        System.out.println("Giai thua cua " +n+ " la: " + gt);

    }
}
