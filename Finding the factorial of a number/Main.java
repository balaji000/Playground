import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int fact=1;
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
      
  }
    System.out.println(fact+" ");
}
}
