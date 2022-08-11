/*
3. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : 
H
H e
H e l
H e l l
H e l l o
 */
import java.util.Scanner;
class program38_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String s;

        System.out.println("Enter the String : ");
        s=sobj.nextLine();

        Pattern pobj = new Pattern();
        pobj.Pattern(s);
    }
}
class Pattern
{
    public void Pattern(String str)
    {
        int i=0,j=0;
        char ch[]=str.toCharArray();

        for(i=0;i<ch.length;i++)
        {
            for(j=0;j<=i;j++)
            {
              System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}