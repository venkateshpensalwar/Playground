#include<iostream>
using namespace std;
int main()
{
//Input consist of 1 integer.
  int year;
  cin>>year;
  
//Output consist of 1 string.
  
  
// If her birth year is 2016 and it is a leap year display “2016 is a leap year.”
// Else display “2016 is not a leap year.”
  
  if(year%4==0)
    if(year%100==0)
      if(year%400==0)
        cout<<year<<" is a leap year";
  	  else
        cout<<year<<" is not a leap year";
    else
      cout<<year<<" is a leap year";
  else
    cout<<year<<" is not a leap year";

return 0;
}