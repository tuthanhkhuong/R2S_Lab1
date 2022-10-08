package Lab3.Bai1;

import java.util.Scanner;

public class YC3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap: ");
        int n= sc.nextInt();

        for (int i = 1; i <= n; i=i+2) {
            System.out.println(i);
        }

    }
}
