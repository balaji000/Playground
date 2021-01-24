import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int r=n1/10;
      int r2=r%10;
      System.out.println(r2);
	}
}