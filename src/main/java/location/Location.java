package location;

import java.util.Scanner;

public class Location {
    static Scanner sc = new Scanner(System.in);
    private int x = 2;
    private int y = 3;
    double[][] array;

    public Location() {

    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
        array = new double[x][y];

    }

    public void Nhap() {
        System.out.println("Nhập giá trị cho tùng phần tử trong mảng: ");
        for (int i = 0; i < x; i++) {
            System.out.println("Dòng thứ :" + (i + 1));
            for (int j = 0; j < y; j++) {
                double number = sc.nextDouble();
                array[i][j] = number;
            }
            System.out.println();
        }
    }

    public void locateLargest() {
        double max = array[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    a = j + 1;
                    b = i + 1;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max + " ở dòng " + b + " cột " + a);
    }
}
