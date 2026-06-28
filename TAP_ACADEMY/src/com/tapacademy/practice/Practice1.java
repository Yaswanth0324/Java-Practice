package com.tapacademy.practice;

import java.util.Scanner;

class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println(n);
            return;
        }

        for (int i = 0; i < r && n >= 10; i++) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n);
    }
}

	
	
	
	

