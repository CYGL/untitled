package pers.cygl.tedu.day0930;

import java.awt.geom.FlatteningPathIterator;
import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        /*System.out.print("名字1：");
        String name = new Scanner(System.in).nextLine();
        System.out.print("年龄1：");
        int age= new Scanner(System.in).nextInt();
        System.out.println("大家好，我系"+name+"，是兄弟就来砍我"+"，我年龄"+age+"，我在贪婪玩月杀猪");
        System.out.print("名字2：");
        String name2 = new Scanner(System.in).nextLine();
        System.out.print("年龄2：");
        int age2 = new Scanner(System.in).nextInt();
        System.out.println("大家好，我系"+name2+"，是兄弟就来砍我"+"，我年龄"+age2+"，我在贪婪玩月杀猪");*/


/*        System.out.print("输入半径：");
        double r = new Scanner(System.in).nextDouble();
        double m ;
        m = r * r * Math.PI;
        System.out.println("圆的面积为："+m);*/


/*        System.out.print("输入整数a:");
        int a=new Scanner(System.in).nextInt();
        System.out.print("输入整数b:");
        int b=new Scanner(System.in).nextInt();
        int t=a;//a=1,b=2,t=1
        a=b;//b=2,a=2,t=1
        b=t;//t=1,b=1,a=2
        System.out.println(a);//a=2
        System.out.println(b);//b=1*/


        float max5 = Float.MAX_VALUE ;
        float min5 = Float.MIN_VALUE ;
        System.out.println(max5);//3.4028235E38
        System.out.println(min5);//1.4E-45

        float a = (float)3.14;
        float b = 0.000000000000000000000000000000000000000000001f;
        double c = Float.MAX_VALUE ;
        float d = 3.21545f;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

    }
}
