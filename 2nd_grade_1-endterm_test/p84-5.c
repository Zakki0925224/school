// 整数a,bを入力してa÷bの計算をし、その商と余りを出力する
// bの値が0のとき、「入力ミスです！」と出力して終了する

#include <stdio.h>

int main(void)
{
    int a,b, ans, reAns;

    printf("整数aを入力...>");
    scanf("%d",&a);
    printf("整数bを入力...>");
    scanf("%d",&b);

    if (b == 0)
    {
        printf("入力ミスです！\n");
        return 0;
    }

    ans = a / b;
    reAns = a % b;

    printf("\n商 -> %d\n", ans);
    printf("余り -> %d\n", reAns);

    return 0;

}