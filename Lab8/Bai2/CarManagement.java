package Lab8.Bai2;

public class CarManagement {
    public static void main(String[] args) {
        Car car1 = new Car("Alpha", "Honda", "2010", 16, 1500);
        Car car2 = new Car("Beta", "Toyota", "2011", 2, 2000);
        Car car3 = new Car("Celta ", "Honda", "2022", 7, 3500);

        car1.getInfor();
        car2.getInfor();
        car3.getInfor();

        System.out.printf("\nThue xe %s la: %.2f",car1.getName(), car1.calculateTax());
        System.out.printf("\nThue xe %s la: %.2f",car2.getName(),car2.calculateTax());
        System.out.printf("\nThue xe %s la: %.2f \n",car3.getName(),car3.calculateTax());

        System.out.println("\n-------Thong tin gia xe sau thue-------");

        System.out.printf("\nGia xe %s sau thue la: %.2f",car1.getName(), car1.calculatePrice());
        System.out.printf("\nGia xe %s sau thue la: %.2f",car2.getName(),car2.calculatePrice());
        System.out.printf("\nGia xe %s sau thue la: %.2f",car3.getName(),car3.calculatePrice());


    }
}
