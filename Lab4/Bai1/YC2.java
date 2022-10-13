package Lab4.Bai1;

public class YC2 {
    public static void main (String [] args){
        int arr[] = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};

        int cout=0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i]%6==0){
                cout++;
            }
        }
        System.out.println("So phan tu chia het cho 2 va 6 la: " + cout);
    }
}
