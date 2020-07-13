// char型配列の要素

#include <stdio.h>

int main(void)
{
    char str[6] = "tokyo";
    int i;

    printf("%s\n", str); // str[0]からnull文字の前まで出力
    
    for (i = 0; i < 6; i++)
    {
        // str[0]からstr[5]までの各要素の値を16進数で出力
        printf("str[%d]=%x\n", i, str[i]);
    }

    str[3] = '\0';
    printf("\n%s\n", str); // str[0]からnull文字の前まで出力

    for (i = 0; i < 6; i++)
    {
        // str[0]からstr[5]までの各要素の値を16進数で出力
        printf("str[%d]=%x\n", i, str[i]);
    }

    return 0;
}