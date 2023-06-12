package Lection_04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Result res = new Result(num1, num2);
        System.out.println(res);
        sc.close();
    }
}
