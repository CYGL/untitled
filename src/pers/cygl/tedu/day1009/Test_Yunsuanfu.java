package pers.cygl.tedu.day1009;

public class Test_Yunsuanfu {
    public static void main(String[] args) {
       /* int a = 1;
        System.out.println(a++);//先用后变化
        int b = 1;
        System.out.println(++b);//先变化后用
        System.out.println(++a+b+a++);

        int c = 10;//9//8//7
        System.out.println(c--);
        int d = 10;//9//
        System.out.println(--d);
        System.out.println(--c-d-c--);//8-9-8=-9
        System.out.println(c);
        System.out.println(d);*/
        int a = 1;
        int b = a++;
        System.out.println(b);
        int c= a++;
        System.out.println(c);
    }
}
