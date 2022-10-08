package Lab3.Bai1;

import java.util.Scanner;

public class YC2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap: ");
        int n= sc.nextInt();

        for (int i = n; i > 1; i--) {
            System.out.println(i);
        }

    }
}
