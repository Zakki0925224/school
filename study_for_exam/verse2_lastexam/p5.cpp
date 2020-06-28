// 整数a, bを入力した時、a ÷ b の計算をし、商と余りを表示する
// bが0の時は「入力ミスです！」と出力して終了

#include <stdio.h>

int main(void)
{
    int a, b, result, resultSurplus;

    printf("整数aを入力...>");
    scanf("%d", & a);
    printf("整数bを入力...>");
    scanf("%d", & b);

    if ( b == 0 )
    {
        printf("入力ミスです！\n");
        return 0;
    }

    result = a / b;
    resultSurplus = a % b;

    printf("商 -> %d\n", result);
    printf("余り -> %d\n", resultSurplus);

    return 0;

}
