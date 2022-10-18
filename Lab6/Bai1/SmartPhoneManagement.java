package Lab6.Bai1;

public class SmartPhoneManagement {
    public static void main (String[] args){
        Properties s1 = new Properties();
        s1.inputPhone();

        Properties s2 = new Properties("ip13 Pro X","Apple",156,1200);

        System.out.println(s1.comparePhone(s2));

    }
}
