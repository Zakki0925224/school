// 魔法陣の縦・横の合計を計算して表形式で出力する
// 2次元配列を使う

#include <stdio.h>
int main(void)
{
    int i, j;
    int mahou[5][5] =   {
                            {17, 24, 1, 8, 15},
                            {23, 5, 7, 14, 16},
                            {4, 6, 13, 20, 22},
                            {10, 12, 19, 21, 3},
                            {11, 18, 25, 2, 9}
                        };

    int verticalTotal[5] = {0, 0, 0, 0, 0};
    int horizontalTotal[5] = {0, 0, 0, 0, 0};

    // 横合計の計算
    for ( i = 0; i < 5; i++)
        for (j = 0; j <5; j++)
            horizontalTotal[i] += mahou[i][j];

    // 縦合計の計算
    for ( i = 0; i < 5; i++)
        for (j = 0; j <5; j++)
            verticalTotal[i] += mahou[j][i];

    // 出力
    for ( i = 0; i < 5; i++)
    {
        for (j = 0; j <5; j++)
        {
            printf("%7d", mahou[i][j]);
        }

        printf("%7d", horizontalTotal[i]);
        printf("\n");
    }

    for ( i = 0; i < 5; i++)
    {
        printf("%7d", verticalTotal[i]);
    }

    return 0;
}