package Lab4.Bai1;


public class YC1 {
    public static void main (String [] args){
        int arr[] = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};

        for(int i = 0; i <= arr.length; i++) {
            if (arr[i] % 2 == 1){
                System.out.println("So le trong mang la: " + arr[i] + " tai vi tri " + i);
            }
        }
    }
}
