import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int rev=0,rem;
    while(num>0)
    {
       rem=num%10;
      rev=rev*10+rem;
      num=num/10;
      
    }
    System.out.println(rev);
      
  }
}