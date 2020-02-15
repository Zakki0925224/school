//n個の異なる数字の並べ方がP通りあるとすれば、P=1*2*...*nで求めることができる。
//nを入力した時、並べ方が何通りあるか表示する
//nが0以下 or 10以上のときは再入力させる、繰り返しには無限ループを使う。

#include <stdio.h>
#include <windows.h>
int main(void)
{
	//変数i,pの初期値を1にする（計算バグ防止）
	int n, i, p=1;
	while (1)
	{
		printf_s("数値nを入力...");
		scanf_s("%d", &n);
		if (n > 0 && n < 10)	break;
	}
	
	//初期値が0のときは「<」「>」
	//初期値が1のときは「<=」「>=」
	for (i = 1; i <= n; i++)	p *= i;
	printf_s("並べ方は%d通りです。\n", p);

	system("pause");
	return 0;
}