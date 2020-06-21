#include<iostream>
using namespace std;
int main()
{
int months,n1=0,n2=1,n3;
  cin>>months;
  
  for (int i=2;i<months;i++)
  {
    n3=n2+n1;
    n1=n2;
    n2=n3;
  }
  cout<<n3;
}