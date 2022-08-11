/*
5. Accept number of rows and number of columns from user and display 
below pattern.
Input : iRow = 3 iCol = 4
Output : 
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/
#include<stdio.h>
void display(int Row,int Col)
{
    int No=1;
    for(int i=1;i<=Row;i++)
    {
        for(int j=1;j<=Col;j++)
        {
            printf("%d ",No);
        }
        No++;
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