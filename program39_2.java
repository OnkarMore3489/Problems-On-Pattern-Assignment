/*
2. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : 
H e l l o
H e l l *
H e l * *
H e * * *
H * * * *
 */
import java.util.Scanner;
class program39_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String s;

        System.out.println("Enter the string : ");
        s=sobj.nextLine();
        
        Pattern pobj = new Pattern();
        pobj.Pattern(s);
    }
}
class Pattern
{
    public void Pattern(String str)
    {
      char ch[]=str.toCharArray();
      int i=0,j=0;

      for(i=0;i<ch.length;i++)
      {
          for(j=0;j<ch.length;j++)
          {
              if((i+j)<ch.length)
              {
                  System.out.print(ch[j]+" ");
              }
              else
              {
                  System.out.print("* ");
              }
          }
          System.out.println();
      }
    }
}