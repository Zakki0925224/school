//「*」を使って10x19のピラミッドを作る

#include <stdio.h>
#include <windows.h>
int main(void)
{
	int i, j, k;

	for (i = 1; i <= 10; i++)
	{
		for (j = 10 - i; j > 0; j--)	putchar(' ');
		for (k = 1; k <= 2 * i - 1; k++)	putchar('*');
		putchar('\n');
	}

	system("pause");
	return 0;
}