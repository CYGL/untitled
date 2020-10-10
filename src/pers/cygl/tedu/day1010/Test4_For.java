package pers.cygl.tedu.day1010;

public class Test4_For {
    public static void main(String[] args) {
        String name = "陈杨光林";
        for (int i=0;i<=10;i++){
            System.out.print(i+name);
        }
        System.out.println();
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+ "");
            }
            System.out.println();
        }
    }
}
