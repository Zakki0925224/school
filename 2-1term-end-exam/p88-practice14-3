// キーボードから入力した10個の実数データの中の最大値と最小値を出力する。

#include <stdio.h>

int main(void)
{
    int cnt;
    double maxValue, minValue, value[10];

    for(cnt = 0; cnt <=10; cnt++)
    {
        printf("value[%d]=?>", cnt);
        scanf("%lf", &value[cnt]);
    }

    maxValue = value[0];
    minValue = value[0];

    for(cnt = 1; cnt <= 10; cnt++)
    {
        if (maxValue < value[cnt])
        {
            maxValue = value[cnt];
        }
        if (minValue > value[cnt])
        {
            minValue = value[cnt];
        }
    }

    printf("最大値は %lf \n", maxValue);
    printf("最小値は %lf \n", minValue);

    return 0;
}