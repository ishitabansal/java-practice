public class Pattern3
{
  public static void main(String[] args)
  {
   for(int i=1;i<=5;i++)                    //no. of rows
   {
     for(int j=1;j<=i;j++)                    //no. of columns
     {
       if((i+j)%2==0)                            //observe the position 
        System.out.print("1");
       else
        System.out.print("0");
      }
    System.out.println(" ");
   }
 }
}




//
1
01
101
0101
10101
