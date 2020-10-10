// 1バイト文字を用いた10文字以内の文字列を2組入力したとき、1行あけてからそれぞれの文字列を出力する
// また、文字数の比較を出力する

#include <stdio.h>
#include <string.h>
int main(void)
{
    char str1[25], str2[25];
    int n1, n2;

    printf("文字列1は?\n");
    scanf("%s", str1);

    printf("文字列2は?\n");
    scanf("%s", str2);

    n1 = strlen(str1);
    n2 = strlen(str2);

    printf("\n%sの文字列は%dです。\n", str1, n1);
    printf("%sの文字列は%dです。\n", str2, n2);

    if (n1 > n2)
        printf("\n%s > %s\n", str1, str2);
    
    else if (n1 == n2)
        printf("\n%s = %s\n", str1, str2);
    
    else
        printf("\n%s < %s \n", str1, str2);

    return 0;
}