/*
2. Accept number of rows and number of columns from user and display 
below pattern.
Input : iRow = 4 iCol = 3
Output : 
1 2 3
1 2 3
1 2 3
1 2 3
*/
#include<stdio.h>
void display(int Row,int Col)
{
    for(int i=1;i<=Row;i++)
    {
        for(int j=1;j<=Col;j++)
        {
            printf("%d ",j);
        }
        printf("\n");
    }

}
int main()
{
    int iRow=0,iCol=0;
    printf("Enter Number of Rows : ");
    scanf("%d",&iRow);
    printf("Enter Number of Column : ");
    scanf("%d",&iCol);
    display(iRow,iCol);
    return 0;
}