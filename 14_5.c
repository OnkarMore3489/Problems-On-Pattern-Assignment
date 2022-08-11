/*
5. Accept number of rows and number of columns from user and display below 
pattern.
 
Input : iRow = 4 iCol = 4
Output : 
1 2 3 4
  2 3 4
    3 4
      4
*/
#include<stdio.h>
void display(int iRow,int iCol)
{
    for(int i=1;i<=iRow;i++)
    {
        for(int j=1;j<=iCol;j++)
        {
            if(j>i || i==j)
            {
             printf("%d ",j);
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
}
int main()
{
    int iValue1=0,iValue2=0;
    printf("Enter the rows : ");
    scanf("%d",&iValue1);
    printf("Enter the column : ");
    scanf("%d",&iValue2);
    display(iValue1,iValue2);
    return 0;
}