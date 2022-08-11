/*
4. Accept number from user and display below pattern.
Input : 4
Output : # 1 * # 2 * # 3 * # 4 *
*/
#include<stdio.h>
void display(int iNo)
{
    for(int i=1;i<=iNo;i++)
    {
        printf("# %d * ",i);
    }
}
int main()
{
    int iValue=0;
    printf("Enter the Number : ");
    scanf("%d",&iValue);
    display(iValue);
    return 0;
}