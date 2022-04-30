package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if (n < 0) {
            System.out.println("Error");
        } else {
            double s = 0;
            double result = 0;
            for (int i = 0; i <= n; i++) {
                int p = 1;
                for (i = 1; i <= n; i++) {
                    p *= i;
                }
                s = Math.pow((-1), n) * Math.pow(x, n) / (p);
                result = result + s;
            }
        }

    }
}







