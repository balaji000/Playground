#include<iostream>
using namespace std;
int main()
{
  int temp,n1,n2;
  cin>>n1>>n2;
  cout<<"Before swapping a= "<<n1<<" and b="<<n2;
  temp=n1;
  n1=n2;
  n2=temp;
  cout<<"\nAfter swapping a= "<<n1<<" and b="<<n2;
}