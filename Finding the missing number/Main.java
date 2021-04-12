import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int id=0;id<=n-1;id++)
      {
        	arr[id]=in.nextInt();
      }
      int mval=0;
      for(int val=1;val<=n;val++)
      {
        boolean found=false;
       for(int id=0;id<=n-1;id++)
      	{
         	if(arr[id]==val)
            {
              found=true;
              break;
            }
       }
        if(found==false)
        {
          mval=val;
          break;
        }
      }
      System.out.print(mval);
    
  
    }
}