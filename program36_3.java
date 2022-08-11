/*
3. Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 
A A A A A
B B B B B
C C C C C
 */
import java.util.Scanner;
class program36_3
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
        char ch='A';
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
              System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}