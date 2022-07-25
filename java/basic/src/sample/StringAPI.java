package sample;
public class StringAPI
{
    public StringAPI()
    {
        // 一部に文字列を含んでいるかチェック
        var sample = "Central Information Univercity";

        if (sample.contains("Central"))
        {
            System.out.println("Centralを含んだ文字です");
        }

        // 対象の文字列から始まっているかチェック
        var sc = new java.util.Scanner(System.in);
        System.out.print("学籍番号を入力: ");
        var s = sc.nextLine();

        if (s.startsWith("f22"))
        {
            System.out.println("1年生");
        }
        else if (s.startsWith("f21"))
        {
            System.out.println("2年生");
        }
        else if (s.startsWith("f20"))
        {
            System.out.println("3年生");
        }
        else if (s.startsWith("f19"))
        {
            System.out.println("4年生");
        }

        System.out.print("住所を入力: ");
        var s2 = sc.nextLine();
        sc.close();

        // 対象の文字列で終わっているかチェック
        if (s2.endsWith("川崎市"))
        {
            System.out.println("あなたは川崎市出身ですね");
        }

        // 対象の文字の位置を取得
        System.out.println(s2.indexOf("💩"));

        // substringとの相性がいい
        var iroha = "いろはにほへとちりぬるをわかよたれそつねならむうゐのおくやまけふこえてあさきゆめみしゑひもせすん";
        var targetIndex = iroha.indexOf("あさきゆめみし");
        var targetLength = "あさきゆめみし".length();
        var result = iroha.substring(targetIndex, targetIndex + targetLength);
        System.out.println(result);

        // 対象の文字の位置を後ろから取得
        var file = "Java実習基礎A.xlsx";
        // ファイル名だけ
        // last index of - 後ろからのposではなく後ろから検索
        var fileName = file.substring(0, file.lastIndexOf("."));
        System.out.println(fileName);
    }
}