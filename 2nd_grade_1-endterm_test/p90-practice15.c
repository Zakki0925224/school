// char型配列を"OKINAWA"を初期値として宣言し、文字列の順番を逆にして"AWANIKO"と出力する。

#include <stdio.h>
#include <string.h>

int main(void)
{
    int code = 1;

    // strlen関数を使う処理
    if(code == 0)
    {
        int cnt;
        char str[] = "OKINAWA";

        // strlen(str) null文字も含みます
        for(cnt = strlen(str) - 1; cnt >= 0; cnt--)
        {
            printf("%c", str[cnt]);
        }
    }

    // strlen関数を使わない処理
    else if (code == 1)
    {
        int cnt;
        char str[] = "OKINAWA";

        for(cnt = 6; cnt >= 0; cnt--)
        {
            printf("%c", str[cnt]);
        }
    }

    return 0;
}