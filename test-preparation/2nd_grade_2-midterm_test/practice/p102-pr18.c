// double型の変数a = 1.23, b = 4.56を宣言
// アドレス演算子を使ってそれぞれの変数のアドレスを表示するとともにポインタを使って変数の値を表示する

#include <stdio.h>
int main(void)
{
    double a = 1.23, b = 4.56;
    double *pointaA, *pointaB;
    
    pointaA = &a;
    pointaB = &b;
    
    printf("変数a\tアドレス=%x\t値=%f\n", &pointaA, *pointaA);
    printf("変数b\tアドレス=%x\t値=%f\n", &pointaB, *pointaB);
    
    return 0;
}