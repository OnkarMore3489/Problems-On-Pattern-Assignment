/*
3. Accept number of rows and number of columns from user and display below 
pattern.
 
Input : iRow = 3 iCol = 5
Output : 
A A A A A
B B B B B
C C C C C
*/
#include<stdio.h>
void display(int iRow,int iCol)
{
    char ch='A';
    for(int i=1;i<=iRow;i++)
    {
        for(int j=1;j<=iCol;j++)
        {
         printf("%c ",ch);
        }
        ch++;
        printf("\n");
    }
}
int main()
{
    int iValue1=0,iValue2=0;
    printf("Enter the row : ");
    scanf("%d",&iValue1);
    printf("Enter the column : ");
    scanf("%d",&iValue2);
    display(iValue1,iValue2);
    return 0;
}
