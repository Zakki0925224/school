//0または負数が入力されるまでに入力した実数データのうち、最大値を表示する

#include <stdio.h>
#include <windows.h>
int main(void)
{
	double num, max = 0;
	while (1)
	{
		printf_s("値を入力...");
		scanf_s("%lf", &num);
		
		//numが正数だということを確認 -> 最大値の処理
		if (num <= 0)
			break;
		if (max < num)
			max = num;
	}
	printf_s("最大値は%lfです。\n", max);
	system("pause");
	return 0;
}