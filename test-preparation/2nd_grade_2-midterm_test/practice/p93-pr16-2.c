// 要素の数が40のchar型配列str1, str2, str3を初期値なしで宣言
// str1に"Let's "、str2に"study "、str3に"programming."を代入しつなげて出力する
// ただしstrcatは使わない

#include <stdio.h>
int main(void)
{
    char str1[40], str2[40], str3[40];

    strcpy(str1, "Let's ");
    strcpy(str2, "study ");
    strcpy(str3, "programming.");

    printf("%s", str1);
    printf("%s", str2);
    printf("%s\n", str3);

    return 0;
}