//p84　節末問題
//キーボードから整数を入力した時、その数が３の倍数かどうかを出力するプログラムをつくりなさい。ただし、等価演算子を使わずに条件を記述しなさい。

#include <stdio.h>
#include <windows.h>
int main(void)
{
	int num;
	printf_s("整数を入力...");
	scanf_s("%d", &num);
	if (num % 3)	printf_s("3の倍数です。\n");
	else		printf_s("3の倍数ではありません。\n");
	
	system("pause");
	return 0;
}
