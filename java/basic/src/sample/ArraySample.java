package sample;

public class ArraySample {
    public ArraySample() {
        // int arr[]; <- 非推奨

        var arr = new int[5];
        arr[0] = 100;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]); <- ArrayIndexOutOfBoundsException

        var num = arr.length;
        System.out.println("要素数は" + num + "です。");

        // 初期値を宣言時に格納する
        // var arr2 = new int[5];
        // arr2[0] = 1;
        // arr2[1] = 2;
        // arr2[2] = 3;
        // arr2[3] = 4;
        // arr2[4] = 5;
        var arr2 = new int[] { 1, 2, 3, 4, 5 };

        var arr3 = new int[] {
                10, // 国語
                40, // 社会
                20, // 数学
                30 // 英語
        };

        // var sum = arr3[0] + arr3[1] + arr3[2];
        // System.out.println("合計は" + sum + "です。");

        var sum = 0;
        for (var i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }

        System.out.println("合計は" + sum + "です。");

        // 課題：以下の配列の偶数のみ足し算するfor
        int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var sum2 = 0;

        for (var i : numArr) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }

        System.out.println("偶数の合計は" + sum2 + "です。");

        // 素数のみ足し算
        var sum3 = 0;

        for (var i : numArr) {
            var cnt = 0;
            for (var j : numArr) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                sum3 += i;
            }
        }

        System.out.println("素数の合計は" + sum3 + "です。");
    }
}