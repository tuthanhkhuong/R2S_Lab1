package Lab3.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class YC3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int s = 0;

        for (int i = 1; i <= n ; i++){
            if (i%3==0 && i%7 ==0){
                s=s+1;
            }
        }
        System.out.print("số lượng các số nguyên chia hết cả 3 và 7 trong phạm vi từ " + n + " la: " + s);
    }
}
