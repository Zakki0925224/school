// キーボードから整数を入力した時、その数が3の倍数かどうかを出力
// 等価演算子は使わない

#include <stdio.h>

int main(void)
{
    int num;

    printf("整数を入力:");
    scanf("%d",&num);

    // num % 3 != 0
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