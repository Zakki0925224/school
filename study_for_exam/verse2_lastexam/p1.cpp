//p84　節末問題
// キーボードから整数を入力したとき、その数が3の倍数かどうかを出力する
// 等価演算子を使わない

#include <stdio.h>

int main(void)
{
    int num;

    printf("整数を入力..\n");
    printf(">");
    scanf("%d", &num);

    // n % 3 != 0 と同義
    if (num % 3)
    {
        printf("3の倍数ではありません。\n");
    }
    else
    {
        printf("3の倍数です。\n");
    }
    

    return 0;
}
