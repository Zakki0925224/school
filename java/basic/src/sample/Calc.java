package sample;

public class Calc {

    public Calc() {
        // 足し算
        System.out.println(3 + 5);

        // 引き算
        System.out.println(3 - 5);

        // 掛け算
        System.out.println(3 * 5);

        // 割り算
        System.out.println(3 / 5);

        // 剰余
        System.out.println(3 % 5);

        var a = 1;
        a += 10;

        System.out.println("a: " + a);

        var b = 1;
        b = b + 1;
        b += 1;
        b++;

        System.out.println("b: " + b);

        b = b - 1;
        b -= 1;
        b--;
    }
}