// 0または負数が入力されるまでに入力した実数データのうち、最大の値を出力する。

#include <stdio.h>

int main(void)
{
    double num, maxNum = 0;

    while(1)
    {
        printf("実数データを入力...>");
        scanf("%lf", &num);

        if (maxNum < num)
        {
            maxNum = num;
        }

        if (num <= 0)
        {
            break;
        }
    }

    printf("最大値 -> %lf", maxNum);

    return 0;
}