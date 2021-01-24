import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int fact=0;
    int i;
    for(i=1;i<=num;i++)
    {
    fact=fact+i;
      
    }
    return fact;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact=sum(n);
      n=fact;
      System.out.println(n);
	}
}