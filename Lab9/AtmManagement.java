package Lab9;

import java.util.Scanner;

public class AtmManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        Account account = new Account();

        do {
            System.out.println("\nOpen an account");
            System.out.println("Make a deposit");
            System.out.println("Make a withdraw");
            System.out.println("Show the number of transactions");
            System.out.println("Exit the ATM");

            System.out.println("\nYour choice: ");
            String ch = sc.next();

            switch (ch){
                case "open" :
                    user.nhapThongTin();
                    user.xuatThongTin();
                    break;

                case "deposit":
                    account.napTien();
                    account.getSoTK();
                    user.getTen();
                    account.getSoDuTK();
                    break;

                case "withdraw" :
                    account.rutTien(account);
                    account.getSoTK();
                    user.getTen();
                    account.getSoDuTK();
                    break;

                case "show":
                    break;

                case "quit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Loi !");
                    break;
            }
        }while (true);
    }


}
