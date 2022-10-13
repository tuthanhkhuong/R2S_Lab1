package Lab4.Bai1;

public class YC4 {
    public static void main (String [] args){
        int arr[] = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]=0;
            }
        }

        System.out.println("Mang thay doi sau khi the am bang 0: ");

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
