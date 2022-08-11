/*
2. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : 
H e l l o
H e l l
H e l
H e
H
 */
import java.util.Scanner;
class program38_2
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
        int i=0,j=0,k=0;
        char ch[]=str.toCharArray();
        
    try
    {
        for(i=0;i<ch.length;i++)
        {
            for(j=i;j<ch.length;j++)
            {
              System.out.print(ch[k]+" ");
              k++;
            }
            k=0;
            System.out.println();
        }
    }
    catch(Exception e)
    {}
    }
}