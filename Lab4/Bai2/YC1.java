package Lab4.Bai2;

import java.util.Random;
import java.util.Scanner;

public class YC1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = new Random().nextInt(20);
           System.out.println(arr[i]);
        }

        int demX=0;

        System.out.println("Moi ban nhap X: ");
        int x=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                demX++;
            }
        }
        System.out.println("So lan xuat hien cua X la: " + demX);
    }
}
