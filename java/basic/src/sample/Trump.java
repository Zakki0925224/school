package sample;
import java.util.*;
import java.util.stream.Collectors;

public class Trump
{
    public Trump()
    {
        var cnt = 5;
        var cards1 = "03S 03S 03S 03S 03S".split(" ");

        var cardsOrder = Arrays.asList(new String[] {"03", "04", "05", "06", "07", "08", "09", "10", "0J", "0Q", "0K", "0A", "02"});
        var marksOrder = Arrays.asList(new String[] {"D", "C", "H", "S"});

        var priorities = new int[cnt];

        for (var i = 1; i <= cnt; i++)
        {
            var cardCodeIndex = cardsOrder.indexOf(cards1[i - 1].substring(0, 2));
            var markCodeIndex = marksOrder.indexOf(cards1[i - 1].substring(2, 3));

            priorities[i - 1] = (cardCodeIndex + markCodeIndex) * i;
        }

        var result = sortWithPriorities(cards1, priorities);

        for (var i = 0; i < cards1.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    private static String[] sortWithPriorities(String[] array, int[] priorities)
    {
        var result = new String[array.length];
        var prioritiesIndex = new int[priorities.length];
        var tmp = new int[priorities.length];
        System.arraycopy(priorities, 0, tmp, 0, tmp.length);

        Arrays.sort(priorities);

        for (var i = 0; i < priorities.length; i++)
        {
            prioritiesIndex[i] = Arrays.stream(priorities).boxed().collect(Collectors.toList()).indexOf(tmp[i]);
        }

        for (var i = 0; i < result.length; i++)
        {
            result[prioritiesIndex[i]] = array[i];
        }

        return result;
    }
}