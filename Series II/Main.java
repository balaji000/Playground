#include<iostream>
using namespace std;
int main()
{
  int n,a=11;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int b=a*a;
    cout<<b<<" ";
    a=a+4;
  }
}