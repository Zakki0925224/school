//float型とdouble型の変数を宣言→初期化
//それぞれに0.01を１万回加えて、誤差を確認。

#include <stdio.h>
#include <windows.h>
int main(void)
{
	float num1 = 0;
	double num2 = 0;
	int i;
	//↓最大値の「<=」に注意
	//最大値を超えるとオーバーフローする
	for (i = 1; i <= 10000; i++)
	{
		num1 = num1 + 0.01;
		num2 = num2 + 0.01;
	}
	printf_s("float ->%f\ndouble ->%lf\n", num1, num2);
	system("pause");
	return 0;

}