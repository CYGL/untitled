package pers.cygl.tedu.day1010;

import java.util.Scanner;

public class Test1_If {
    public static void main(String[] args) {
        for (;;) {
            double p = new Scanner(System.in).nextDouble();
            double z = 0;
            if (p >= 5000) {
                z = p * 0.5;
                System.out.println(z);
            } else if (p >= 2000) {
                z = p * 0.8;
                System.out.println(z);
            } else if (p >= 1000) {
                z = p * 0.9;
                System.out.println(z);
            } else {
                z = p;
                System.out.println(z);
            }
        }
    }
}
