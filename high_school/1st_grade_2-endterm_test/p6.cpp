// 0または負数が入力されるまでに入力した実数データのうち、最大値を出力する

#include <stdio.h>

int main(void)
{
    double value, maxValue = 0;

    while(1)
    {
        printf("値を入力...>");
        scanf("%lf", & value);

        if ( value <= 0 )
        {
            break;
        }

        if ( value > maxValue)
        {
            maxValue += value;
        }
    }

    printf("最大値は %lf です。\n", maxValue);

    return 0;
}
