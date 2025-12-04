package bai6;

import java.util.Scanner;

public class Display20Numbers {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N =2 ;
        System.out.println("Nhập số lượng số nguyên tố: ");
        int numbers = scanner.nextInt();
        do {
            if (isPrime(N)){
                System.out.println(N);
                count++;
            }
            N++;
        }while (count < numbers);
    }
}
