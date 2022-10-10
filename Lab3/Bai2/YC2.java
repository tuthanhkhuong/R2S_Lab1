package Lab3.Bai2;

import java.util.Scanner;

public class YC2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap: ");
        int n= sc.nextInt();

        long sum=0;
        long gt=1;

        for (int i = 1; i <= n; i++) {
            gt = gt* i;
            sum +=gt;
        }
        System.out.println("Tong giai thua cua " + n +" la: " + sum);

    }
}
