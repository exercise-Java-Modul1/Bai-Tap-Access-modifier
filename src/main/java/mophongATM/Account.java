package mophongATM;

import java.util.Scanner;

public class Account {
    private int id;
    private double money;
    private String name;

    public Account() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    Scanner scanner = new Scanner(System.in);

    public void NhapTT() {
        System.out.print("Họ tên: ");
        name = scanner.nextLine();
        System.out.print("Id: ");
        id = scanner.nextInt();
        System.out.print("Số dư tài khoản: ");
        money = scanner.nextDouble();
    }
    public void Showinfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Số dư tài khoản hiện tại: " + money);
    }
}
