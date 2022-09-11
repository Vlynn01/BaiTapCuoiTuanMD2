package CanBan;

import java.util.Scanner;

public class NhanHaiSo {
    public static void main(String[] args) {
        double num1, num2, tich;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số thứ nhất: ");
        num1 = scanner.nextDouble();
        System.out.println("Vui lòng nhập số thứ hai: ");
        num2 = scanner.nextDouble();
        tich = num1 * num2;
        System.out.println("Tích của hai số là: " + tich);
    }
}
