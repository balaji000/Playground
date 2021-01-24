import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int sod=n*n;
    return sod;
}
  
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int sod=sum(n1);
      n1=sod;
      System.out.println(n1);
      
	} 
}