/*
1. Accept number from user and display below pattern.
Input : 5
Output : A B C D E
*/
#include<stdio.h>
void display(int iNo)
{
    char ch='A';
    for(int i=1;i<=iNo;i++)
    {
        printf("%c ",ch);
        ch++;
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