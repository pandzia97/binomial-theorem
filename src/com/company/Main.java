package com.company;

import java.util.Scanner;

public class Main {
    public static long Silnia(int x) {
        long silnia_licz = 1;
        for (int i = 2; i <= x; i++) {
            silnia_licz *= i;
        }
        return silnia_licz;
    }

    public static long Newton(int N, int K) {
        long result = 1;

        for (int i = 0; i <= K; i++) {
            result = Silnia(N) / (Silnia(K) * Silnia(N - K));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        System.out.println("Enter K: ");
        int K = scanner.nextInt();

        if (K == 0 || K == N) {
            System.out.println("1");
        } else {
            System.out.println((Newton(N, K)));
        }
    }
}
