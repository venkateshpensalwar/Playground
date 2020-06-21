#include<iostream>
using namespace std;
int main()
{
 int x,first_digit,second_digit;
  cin>>x;
  
  second_digit=x%10;
  
  first_digit=x/1000;
  
  cout<<first_digit+second_digit;
  
  
  return 0;
  
}