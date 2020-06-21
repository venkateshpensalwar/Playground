#include<iostream>
using namespace std;
int main()
{
//Input consists of one integer.
int unit_consumed;
cin>>unit_consumed;
//The output consists of one integer.
 int rupees;
  
 //You need to now calculate the electricity bill based on the units consumed.
  
 if(unit_consumed<=200)
 {
   rupees=unit_consumed*0.5;
   cout<<"Rs."<<rupees;
 }
 else if(unit_consumed<=400)
 {
   rupees=(unit_consumed*0.65)+100;
   cout<<rupees;
 }
 else if(unit_consumed<=600)
 {
   rupees=(unit_consumed*0.80)+200;
   cout<<rupees;
 }
 else
 { 
   rupees=(unit_consumed*1.25)+425;
   cout<<rupees;
 }
 return 0;
}