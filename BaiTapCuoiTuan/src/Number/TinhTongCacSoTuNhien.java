package Number;

import java.util.Scanner;

//Tính tổng các số tự nhiên bằng vòng lặp for Java
public class TinhTongCacSoTuNhien {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến " + num + " là: " + sum);
    }
}

