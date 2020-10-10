// 変数とポインタによる加減算の比較

#include <stdio.h>
int main(void)
{
    int i, j;
    int *p1, *p2;

    p1 = &i;
    p2 = &j;

    *p1 = 76;
    *p2 = 54;

    printf("変数の値による加減算\n");
    printf("%d + %d = %d\n", i, j, i + j);
    printf("%d - %d = %d\n", i, j, i - j);
    printf("ポインタによる加減算\n");
    printf("%d + %d = %d\n", *p1, *p2, *p1 + *p2);
    printf("%d - %d = %d\n", *p1, *p2, *p1 - *p2);

    return 0;

}