/*
2. Write Java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 4 iCol = 3
Output : 1 2 3
1 2 3
1 2 3
1 2 3
 */
import java.util.Scanner;
class program37_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow=0,iCol=0;

        System.out.println("Enter thr Rows : ");
        iRow=sobj.nextInt();

        System.out.println("Enter thr columns : ");
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
            int iNo=1;
            for(j=1;j<=iCol;j++)
            {
                System.out.print(iNo+" ");
                iNo++;
            }
            System.out.println();
        }
    }
}