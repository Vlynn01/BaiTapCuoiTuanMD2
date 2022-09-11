package Number;

import java.util.Scanner;

//Hoán đổi hai số bằng biến tạm thời (temp)

public class CachHoanDoiHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, temp;
        System.out.println("Vui lòng nhập số thứ nhất: ");
        a = scanner.nextFloat();
        System.out.println("Vui lòng nhập số thứ hai: ");
        b = scanner.nextFloat();

        //sử dụng thuật toán hoán đổi với biến trung gian temp
        temp = a;
        a = b;
        b = temp;
        System.out.println("Sau khi hoán đổi hai số: " + "\na: " + a + "\nb: " + b);

    }
}

//Hoán đổi hai số bằng các phép toán học đơn giản
/*

public class CachHoanDoiHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("Vui lòng nhập số thứ nhất: ");
        a = scanner.nextFloat();
        System.out.println("Vui lòng nhập số thứ hai: ");
        b = scanner.nextFloat();

        //sử dụng thuật toán hoán đổi với phép tính cộng trừ
        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("Sau khi hoán đổi hai số: " + "\na: " + a + "\nb: " + b);

    }
}
*/
