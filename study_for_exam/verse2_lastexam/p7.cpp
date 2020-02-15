//キーボードから0以上100以下の整数データを10個入力 -> 40未満の数値の個数を表示
//データが0以上100以下だという判断は必要なし

#include <stdio.h>
#include <windows.h>
int main(void)
{
	int i, num, j=0;
	for (i = 1; i <= 10; i++)
	{
		printf_s("整数を入力...");
		scanf_s("%d", &num);
		if (num < 40)	j++;
	}
	printf_s("40未満の数値の個数は%d個です。\n", j);
	system("pause");
	return 0;
}