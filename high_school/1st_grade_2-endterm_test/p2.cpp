// 西暦を入力し、その年がうるう年かどうかを判定する
// 4で割り切れればうるう年、100で割り切れるときはうるう年ではない、400で割り切れればうるう年

#include <stdio.h>

int main(void)
{
    int year;

    printf("西暦を入力...\n");
    printf(">");
    scanf("%d", &year);

    if ((year % 4 == 0) || ((year % 400 == 0) && (year % 100 != 0)))
    {
        printf("うるう年です。\n");
    }
    else
    {
        printf("うるう年ではありません。\n");
    }
    
    return 0;
}
