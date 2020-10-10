package pers.cygl.tedu.day1010;

import java.util.Scanner;

public class Test2_score {
    public static void main(String[] args) {
        /*for (;;) {
            System.out.println("输入五个成绩：");
            Scanner scanner = new Scanner(System.in);
            int[] s = new int[5];
            for (int i = 0; i < 5; i++) {
                int score = scanner.nextInt();
                s[i] = score;
                if (s[i] >= 90) {
                    System.out.println(s[i] + "优秀");
                } else if (s[i] <= 89 && s[i] >= 80) {
                    System.out.println(s[i] + "良好");
                } else if (s[i] <= 79 && s[i] >= 70) {
                    System.out.println(s[i] + "中等");
                } else if (s[i] >= 60 && s[i] <= 69) {
                    System.out.println(s[i] + "及格");
                } else if(s[i] < 60){
                    System.out.println(s[i] + "不及格");
                }
            }
        }*/
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i=0;i<3;i++){
            int b = scanner.nextInt();
            a[i] = b;
            System.out.println(a[i]);
        }
    }
}
