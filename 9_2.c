/*
2. Accept number from user and display below pattern.
Input : 5
Output : 5 # 4 # 3 # 2 # 1 #
*/
#include<stdio.h>
void display(int iNo)
{
    for(int i=iNo;i>=1;i--)
    {
        printf("%d # ",i);
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