//キーボードから２つの整数a,bを入力した時、a÷bの計算を行い、商とあまりを表示する
//bが0のとき「入力ミスです！」と表示し終了

#include <stdio.h>
int main(void)
{
	int a, b, ans1,ans2;
	printf_s("整数aを入力...");
	scanf_s("%d", &a);
	printf_s("整数bを入力...");
	scanf_s("%d", &b);

	if (b == 0)
	{
		printf_s("入力ミスです！\n");
		system("pause");
		return 0;
	}
	else
	{
		ans1 = a / b;
		ans2 = a % b;
		printf_s("商...%d\nあまり...%d\n", ans1, ans2);
	}

	return 0;
}
