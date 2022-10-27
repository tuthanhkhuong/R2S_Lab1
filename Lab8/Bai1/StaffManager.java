package Lab8.Bai1;

public class StaffManager {
    static int top = 0;

    private Staff[] staffs;
    public StaffManager() {
        staffs = new Staff[10];
    }

    public void nhapNV(Staff staff){
        if (top < 100){
            staffs[top] = staff;
            top ++;
        }else {
            System.out.println("Khong the nhap them !");
        }
    }



    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager();

        Staff staff = new Administration("A",1,1000,2,100);
        staffManager.nhapNV(staff);
        staff.xuatThongTinNV();

            staff = new Marketing("B",2,900,1,2);
            staffManager.nhapNV(staff);
            staff.xuatThongTinNV();

            staff = new Marketing("C",3,700,5,5);
            staffManager.nhapNV(staff);
            staff.xuatThongTinNV();


        System.out.println("Stop !");

    }

}
