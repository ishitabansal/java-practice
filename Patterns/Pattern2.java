public class Pattern2
{
public static void main(String[] args)
{
for(int a=1;a<=5;a++)                  //no. of rows
{
for(int b=1;b<=5;b++)                 //no. of columns
{
if(a==1 || a==5 || b==1 || b==5)     //wherever we need to print the stars, we write in if statement
{
System.out.print("* ");
}
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}



//
* * * * *
*       *
*       *
*       *
* * * * *
