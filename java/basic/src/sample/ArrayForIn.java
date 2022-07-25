package sample;
public class ArrayForIn {
    public ArrayForIn() {
        String[] arr = {
            "おはよう",
            "こんにちは",
            "こんばんは"
        };

        // 要素数指定で中身を確認
        System.out.println(arr[0]);

        // for文で1個ずつ取り出す
        for (var i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        // 拡張for
        for (var s : arr) {
            System.out.println(s);
        }
    }
}