public class Fibonacci
{
public static void main(String[] args)
{
int i,x,y;
i=0;
x=1;
y=1;
System.out.println("1 1");
while(i<=50)
{
i=x+y;
System.out.println(i+" ");
x=y;
y=i;
}
}
}
