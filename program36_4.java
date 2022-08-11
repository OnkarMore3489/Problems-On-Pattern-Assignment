/*
4. Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 4 iCol = 5
Output : 
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
 */
import java.util.Scanner;
class program36_4
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
        int i=0,j=0,iNo=iRow;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
              System.out.print(iNo+" ");
            }
            iNo--;
            System.out.println();
        }
    }
}