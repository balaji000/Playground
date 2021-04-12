#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,s,m,mul,d,mod;
  cin>>a>>b;
  s = a + b;
  m = a - b;
  mul = a * b;
  d = a / b;
  mod = a % b;
  cout<<"a+b="<<s;
  cout<<"\n";

    cout<<"a-b="<<m;
    cout<<"\n";
  
  cout<<"a*b="<<mul;
  cout<<"\n";
  cout<<"a/b="<<d;
  cout<<"\n";
  cout<<"a%b="<<mod;
  cout<<"\n";
  return 0;
}