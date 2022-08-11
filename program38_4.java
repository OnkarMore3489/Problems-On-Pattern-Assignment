/*
4. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : 
H e l l o
H e l l
H e l
H e
H
H e
H e l
H e l l
H e l l 0
 */
import java.util.*;
class program38_4 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=sobj.nextLine();
        
        Pattern pobj=new Pattern();
        pobj.pattern(str);
    }
    
}
class Pattern
{
    public void pattern(String str)
    {
        char ch[]=str.toCharArray();
        int i=0,j=0,k=0;
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
        for(i=1;i<ch.length;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}
