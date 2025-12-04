package bai2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalInterest = 0;
        System.out.println("Nhập số lượng tiền cho vay : ");
        double money = scanner.nextDouble();

        System.out.println("Tỉ lệ lãi suất theo tháng: ");
        double interestRate  = scanner.nextDouble();

        System.out.println("Số tháng cho vay: ");
        int month = scanner.nextInt();

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100)/12 * month;
        }

        System.out.println("Tổng số tiền lãi là: " + totalInterest);


    }
}
