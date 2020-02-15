//1-5までの数字で回答するアンケートの集計
//データは20個、1-5以外のデータはエラーとして数える。
//switch文を使う

#include <stdio.h>
#include <windows.h>
int main(void)
{
	int ans, i, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, err = 0;
	
	for (i=0;i<20;i++)
	{
		printf_s("1-5までの数字を入力...");
		scanf_s("%d", &ans);
		switch (ans)
		{
		case 1:
			c1++;
			break;

		case 2:
			c2++;
			break;

		case 3:
			c3++;
			break;

		case 4:
			c4++;
			break;

		case 5:
			c5++;
			break;

		default:
			err++;
			break;
		}
	}
	
	printf_s("集計結果\n1 -> %d\n2 -> %d\n3 -> %d\n4 -> %d\n5 -> %d\nエラー件数 -> %d\n", c1, c2, c3, c4, c5, err);
	system("pause");
	return 0;
}