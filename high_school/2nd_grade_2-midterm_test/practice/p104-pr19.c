// 変数aに12345を代入し、ポインタを使って変数aの値を2倍する
// 2倍する前後で、変数の値とアドレスがそれぞれどうなるかを出力する

#include <stdio.h>
int main(void)
{
    int a = 12345;
    int *p;

    printf("2倍前\tアドレス=%x\t値=%d\n", &a, a);

    p = &a;
    a *= 2;

    printf("2倍後\tアドレス=%x\t値=%d\n", &p, *p);

    return 0;
}