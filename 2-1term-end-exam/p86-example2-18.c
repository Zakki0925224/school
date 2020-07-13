// 配列の合計と平均

#include <stdio.h>

int main(void)
{
    int a[5] = {13, 56, 27, 44, 39};
    int i, sum;
    double ave;

    sum = 0;

    for (i = 0;  i < 5; i++)
    {
        sum += a[i];
        printf("%5d", a[i]);
    }

    ave = sum / 5.0; // 5と5.0は別物。整数同士で割ると小数点以下が無視される。
    printf("\n合計 = %d, 平均 = %.2f\n", sum, ave);

    return 0;
}