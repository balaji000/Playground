import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int index=0;index<n;index++)
    {
      list[index]=in.nextInt();
    }
    bubble_sort(n,list);
  }
    public static void bubble_sort(int n,int list[])
  {
    for(int i=0;i<=2;i++)
    {
     int key=list[i];
      int j=i-1;
      while((j>=0)&&(list[j]>key))
      {
        list[j+1]=list[j];
        j--;
      }
      list[j+1]=key;
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(list[i]+" ");
    }
  
	    
  }
}