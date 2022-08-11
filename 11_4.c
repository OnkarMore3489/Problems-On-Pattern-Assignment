/*
4. Accept number of rows and number of columns from user and display below 
pattern.
 
Input : iRow = 4 iCol = 5
Output : 
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/
#include<stdio.h>
void display(int iRow,int iCol)
{
    for(int i=iRow;i>=1;i--)
    {
        for(int j=1;j<=iCol;j++)
        {
         printf("%d ",i);
        }
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