import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s1=new Scanner(System.in);
      int base=s1.nextInt();
      int exponent=s1.nextInt();
      int rem=1;
      for(int i=0;i<exponent;i++)
      {
        rem=rem*base;
      }
      System.out.println(rem);
    }
}