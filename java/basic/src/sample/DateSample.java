package sample;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample
{
    public DateSample()
    {
        var dt = new Date();
        System.out.println(dt.getTime());

        var past = new Date(1600705425827L);
        System.out.println(past);

        var cal = Calendar.getInstance();
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print(cal.get(Calendar.MONTH) + "月");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "時");
        System.out.print(cal.get(Calendar.MINUTE) + "分");
        System.out.print(cal.get(Calendar.SECOND) + "秒\n");

        var sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(dt));

        var sdf2 = new SimpleDateFormat("yyyy年MM月dd日(E) HH時mm分ss秒");
        System.out.println(sdf2.format(dt));
    }
}
