package pers.cygl.tedu.day1009;

public class Test_Rule {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5/2.0);
        System.out.println(5/2d);
        System.out.println(5d/2);
        System.out.println(5.0+2);

        byte a = 1;
        byte b = 2;
        byte c = (byte)(a+b);
        System.out.println("c="+c);
        short d = 1;
        short e = 2;
        short f = (short)(d+e);
        System.out.println("f="+f);

        System.out.println(300000000*60*60*24*365);
        System.out.println(300000000l*60*60*24*365);
        System.out.println(.1/0);
        int z;
        z = (a>b)?a:b;
        System.out.println(z);
    }
}
