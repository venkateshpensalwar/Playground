#include<iostream>
using namespace std;
int main()
{
int num,i;
  cin>>num;
do
{
  num/=10;
  ++i;
}while(num>0);
  cout<<i;




return 0;
}