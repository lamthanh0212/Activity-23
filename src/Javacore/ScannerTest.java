package Javacore;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int num = scanner.nextInt();
        System.out.println( + (num) +"x1="+ (num*1));
        System.out.println( + (num) +"x2="+ (num*2));
        System.out.println( + (num) +"x3="+ (num*3));
        System.out.println("...");
        System.out.println( + (num) +"x10="+ (num*10));


    }
}
