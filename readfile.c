#include <stdio.h>
#define MAXCHAR 1000;
int main()
{
	int cha;
	FILE *fp;
	char *token;
	char str[MAXCHAR];
	char* filename ="test.txt";
	fp=fopen(filename,"r");
	if (fp==NULL)
	{
		printf("cannot open file %s\n", filename);
		return 1;
	}
	while (fgets(str, MAXCHAR, fp) != NULL)
	{
		token = strtok(str, s);
		if (str[])
	}
	fclose(fp);
	return 0;
}