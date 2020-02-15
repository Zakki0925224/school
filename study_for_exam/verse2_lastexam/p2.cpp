//西暦年（４けたの整数）を入力し、その年がうるう年かどうか
//4、400で割り切れればうるう年
//100で割り切れればうるう年ではない

#include <stdio.h>
#include <windows.h>
int main(void)
{
	int year;
	printf_s("西暦を入力...");
	scanf_s("%d", &year);
	
	if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))	printf_s("うるう年です。\n");
	else	printf_s("うるう年ではありません。\n");
	system("pause");
	return 0;

}
