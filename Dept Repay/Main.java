#include<iostream>
using namespace std;
int main()
{
  //Input consists of 3 integers.
int X,Y,R;
  
 //The output consists of 4 floating point values. 
float interest,amount,discount,final_settlement;
  
  //The first integer corresponds to the principal amount borrowed by Alice.
  cin>>X;
  
  //he second integer corresponds to the rate of interest.
  cin>>R;
  
  //The third integer corresponds to the number of years.
  cin>>Y;
  
  //The first value corresponds to the interest.
  interest=(X*Y*R)/100;
  cout<<interest<<"\n";
  
  //The second corresponds to the amount.
  amount=X+interest;
  cout<<amount<<"\n";
  
  //The third value corresponds to the discount.
  discount=(interest*2)/100;
  cout<<discount<<"\n";
  
  
  //The last value corresponds to the final settlement.
  final_settlement=amount-discount;
  cout<<  final_settlement<<"\n";
  
  
  return 0;
}