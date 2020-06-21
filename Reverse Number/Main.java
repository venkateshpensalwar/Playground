#include <iostream>
#include<math.h>
using namespace std;
int main() 
{
int num,sum=0,num1;
cin>>num;

while(num!=0)
  {
    num1=num%10;
      sum=sum*10+num1;
      num=num/10;
  }
cout<<sum;
return 0;
}