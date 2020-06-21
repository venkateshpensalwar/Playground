#include<iostream>
using namespace std;
int main()
{
 int num;
  cin>>num;
  int squre=7;
 int numbers=0;
  for(int i=0;i<num;i++)
  {
    squre=squre+4;
    numbers=squre*squre;
    cout<<numbers<<" ";
  }
  return 0;
}