package bai5;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangles");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------");
                    for (int i = 1; i <= 5; i++) {
                        for (int space = 5 - i; space > 0; space--) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }

                    System.out.println("--------------");
                    for (int i = 5; i >= 0; i--) {
                        for (int a = 5 - i; a > 0; a--) {
                            System.out.print("  ");
                        }
                        for (int j = i; j >= 1; j--) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <=7; i++) {
                        for (int space = 7 - i; space > 0; space--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }

            }
        }

    }
}
