#include<iostream>
using namespace std;
int power(int x,int y)
{
  int power=1;
  for(int i=0;i<y;i++)
  {
    power*=x;
  }
  return power;
}

int main()
{
int n,a;
cout<<"Enter the value of a";
 cin>>a;
 cout<<endl;
cout<<"Enter the value of n";
  cin>>n;
  cout<<endl;
cout<<"The value of "<<a<<" power "<<n<< " is "<<power(a,n);

}