/*
2. Accept number of rows and number of columns from user and display below 
pattern.
 
Input : iRow = 4 iCol = 4
Output : 
A B C D
a b c d
A B C D
a b c d
*/
#include<stdio.h>
void display(int iRow,int iCol)
{
    for(int i=1;i<=iRow;i++)
    {
        char ch1='A';
        char ch2='a';
        for(int j=1;j<=iCol;j++)
        {
           if((i%2)==0)
           {
               printf("%c ",ch2);
               ch2++;
           }
           else
           {
              printf("%c ",ch1); 
              ch1++;
           }
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