import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int pack, distance;
        int shift,feedback;
        int call, electric;
        int other;
        double salary;

        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap package: ");
        pack = sc.nextInt();

        System.out.print("Nhap distance: ");
        distance = sc.nextInt();

        System.out.print("Nhap shift: ");
        shift = sc.nextInt();

        System.out.print("Nhap feedback: ");
        feedback = sc.nextInt();

        System.out.print("Nhap call: ");
        call = sc.nextInt();

        System.out.print("Nhap electric: ");
        electric = sc.nextInt();

        System.out.print("Nhap other: ");
        other = sc.nextInt();

        salary = pack * 50 + distance * 75 + shift * 50 * 0.1 + feedback + call + electric + other;
        System.out.print("Salary: " +salary);


    }
}
