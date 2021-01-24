import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int rem,res=0;
      int n=n1;
      while(n!=0)
      {
        rem=n%10;
        res +=rem*rem*rem;
        n =n/10;
      }
      if(res==n1)
      	System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");

	}
}