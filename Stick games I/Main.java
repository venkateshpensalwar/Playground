#include<iostream>
using namespace std;
int main()
{
  int n,m,result;
  cin>>n>>m;
  
  if(n<m)
  {
    result=n;
  }
  else
  {
    result=m;
  }
  if(result%2==0)
  {
    cout<<"Mani Iyer";
  }
  else
  {
    cout<<"Arun Gupta";
  }
}