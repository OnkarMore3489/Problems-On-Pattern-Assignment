/*
5. Write a java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
1 2 3 4 5
1 2     5
1   3   5
1     4 5
1 2 3 4 5
 */
import java.util.*;

class program40_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1=0,iValue2=0;
        System.out.println("Enter the Rows : ");
        iValue1=sobj.nextInt();
        System.out.println("Enter the Column : ");
        iValue2=sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.pattern(iValue1,iValue2);
    }
}
class Pattern
{
    public void pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
              if(i==1 || j==1 || i==iRow || j==iCol || i==j)
              {
                  System.out.print(j+" ");
              }
              else
              {
                  System.out.print("  ");
              }
            }
            System.out.println();
        }
    }
}