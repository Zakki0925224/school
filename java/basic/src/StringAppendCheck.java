public class StringAppendCheck
{
    public StringAppendCheck()
    {
        // +演算子とstring builderの性能差
        var sb  = new StringBuilder();

        var test = "";
        var cnt = 0;

        System.out.println("開始");
        var startTime = System.currentTimeMillis();
        for (var i = 0; i < 500000; i++)
        {
            test += i;
            cnt += 1;
            System.out.println(cnt);
        }
        var endTime = System.currentTimeMillis();
        System.out.println("終了");
        System.out.println("時間: " + (endTime - startTime) + "ms");

        var test2 = "";

        System.out.println("開始");
        var startTime2 = System.currentTimeMillis();
        for (var i = 0; i < 500000; i++)
        {
            sb.append(i);
        }
        test2 = sb.toString();
        var endTime2 = System.currentTimeMillis();
        System.out.println("終了");
        System.out.println("時間: " + (endTime2 - startTime2) + "ms");
    }
}
