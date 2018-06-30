package mophongATM;

import java.util.Scanner;

public class MayATM {
    public static void main(String[] args) {
        Account[] accounts;
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng người gửi tiền: ");
        int n = sc.nextInt();

        accounts = new Account[n];
        System.out.println("Nhập dữ liệu cho máy ATM");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            System.out.println("Người thứ " + (i + 1));
            accounts[i].NhapTT();
        }
        while (true) {
            System.out.print("Nhập id của bạn: ");
            int id = sc.nextInt();
            int dem = 1;
            for (int i = 0; i < accounts.length; i++) {
                if (id == accounts[i].getId()) {
                    System.out.println("Main menu: ");
                    System.out.println("1. Check balance");
                    System.out.println("2. Withdrow");
                    System.out.println("3. Deposit");
                    System.out.println("4. ShowInfo");
                    System.out.println("5. Exit");
                    System.out.println();
                    while (true) {
                        System.out.print("Nhập lựa chọn: ");
                        int chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                System.out.println("1. Check balance");
                                System.out.println("Số dư tài khoản hiện tại của bạn là: " + accounts[i].getMoney());
                                break;
                            case 2:
                                System.out.println("2. Withdrow");
                                System.out.print("Nhập số tiền bạn muốn rút: ");
                                double money_rut = sc.nextDouble();
                                break;
                            case 3:
                                System.out.println("3. Deposit");
                                System.out.print("Nhập số tiền bạn muốn gửi: ");
                                double money_gui = sc.nextDouble();
                                break;
                            case 4:
                                System.out.println("4. ShowInfo");
                                accounts[i].Showinfo();
                                break;
                            case 5:
                                System.out.println("Exit");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Exit");
                                System.exit(0);
                                break;
                        }
                        dem++;
                    }

                }
            }
            if (dem == 1) {
                System.out.println("Id bạn nhập không đúng. Bạn có muốn nhập lại id không?: ");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập lựa chọn: ");
                String yes_or_no = scanner.nextLine();
                switch (yes_or_no) {
                    case "yes":
                        continue;
                    case "no":
                        System.exit(0);
                    default:
                        System.exit(0);
                }
            }
        }
    }
}
