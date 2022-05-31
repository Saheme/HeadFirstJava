package Beginer_Guide.P1;

public class ifDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) {
            System.out.println("a меньше b");
        }
        if (a == b) {
            System.out.println("Вы не должны увидеть этот текст");
        }
        System.out.println();
        c = a - b;
        System.out.println("с равно -1");
        if (c >= 0) {
            System.out.println("c не отрицательное число");
        }
        if (c < 0) {
            System.out.println("c отрицательное число");
        }
        System.out.println();
        c = b - a;
        System.out.println("с = 1");
        if (c >= 0) {
            System.out.println("c положительное число");
        }
        if (c < 0) {
            System.out.println("c отрицательное число");
        }
    }
}
