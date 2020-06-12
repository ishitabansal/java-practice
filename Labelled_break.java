public class Labelled_break
{
public static void main(String[] args)
{
navin:
for(int a=1;a<=10;a++)
{
for(int b=1;b<=10;b++)
{
if(a==7)
break navin;                //labelled break
System.out.print("* ");
}
System.out.println("");
}
}
}
