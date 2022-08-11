/*
2. Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
A B C D
a b c d
A B C D
a b c d
 */
import java.util.Scanner;
class program36_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow=0,iCol=0;

        System.out.println("Enter No Of Rows : ");
        iRow=sobj.nextInt();
        
        System.out.println("Enter No Of Columns : ");
        iCol=sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Pattern(iRow,iCol);
    }
}
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            char ch1='A';
            char ch2='a';
            for(j=1;j<=iCol;j++)
            {
               if(i%2==0)
               {
                   System.out.print(ch1+" ");
                   ch1++;
               }
               else
               {
                   System.out.print(ch2+" ");
                   ch2++;
               }
            }
            System.out.println();
        }
    }
}