package pers.cygl.tedu.day1009;

import java.util.Scanner;

public class Test_Year {
    public static void main(String[] args) {

      /*  if(y%4==0 && y%100!=0){
            System.out.println(y+"年是闰年");
        }else if(y%400==0){
            System.out.println(y+"年是闰年");
        }else {
            System.out.println(y+"年是平年");
        }*/

            System.out.print("输入5个年号：");
            Scanner  scanner = new Scanner(System.in);
            int[] y = new int[5];
            for (int i=0;i<5;i++){
                int b = scanner.nextInt();
                y[i] = b;
                if ((y[i] % 4 == 0 && y[i] % 100 != 0) || y[i] % 400 == 0) {
                    System.out.println(y[i]+ "年是闰年");
                } else {
                    System.out.println(y[i]+ "年是平年");
                }
            }
            for (;;){
            System.out.print("输入年号：");
            int y1 = new Scanner(System.in).nextInt();
            if ((y1 % 4 == 0 && y1% 100 != 0) || y1 % 400 == 0) {
                System.out.println(y1+ "年是闰年");
            } else {
                System.out.println(y1+ "年是平年");
            }
        }

    }
}
