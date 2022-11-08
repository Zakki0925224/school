package sample;

public class Kuku {
    public Kuku() {
        // 1~9までの数字で掛け算九九を表示
        var num = 0;

        while (true) {
            System.out.print("1~9までの数字を入力:");

            try {
                num = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
                continue;
            }

            if (num >= 1 && num <= 9)
                break;
            System.out.println("1~9以外の数字が入力されました。");
        }

        for (var i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}