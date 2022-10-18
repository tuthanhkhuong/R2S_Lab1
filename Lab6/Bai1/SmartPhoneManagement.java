package Lab6.Bai1;

public class SmartPhoneManagement {
    public static void main (String[] args){
        Properties s1 = new Properties();
        s1.inputPhone();
        s1.showInfo();

        Properties s2 = new Properties();
        s2.inputPhone();
        s2.showInfo();

        System.out.println(s1.comparePhone(s2));

    }
}
