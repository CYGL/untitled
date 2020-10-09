package pers.cygl.tedu.day1009;

import java.util.Scanner;

public class Test_Max {
    public static void main(String[] args) {
        System.out.print("输入a的值：");
        int a = new Scanner(System.in).nextInt();
        System.out.print("输入b的值：");
        int b = new Scanner(System.in).nextInt();
        System.out.print("输入c的值：");
        int c = new Scanner(System.in).nextInt();
        System.out.print("输入d的值：");
        int d = new Scanner(System.in).nextInt();
        int max = (a>b)?a:b;
        max = (max>c)?max:c;
        max = (max>d)?max:d;
        System.out.println("最大值为："+max);
        System.out.print("输入e的值：");
        int e = new Scanner(System.in).nextInt();
        max = (max>e)?max:e;
        System.out.println("最大值为："+max);

    }
}
