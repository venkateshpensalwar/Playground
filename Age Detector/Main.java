#include<iostream>
using namespace std;
int main()
{
 //Input consists of 2 integers.
  int DOB,current_year;
  cin>>DOB;
  cin>>current_year;
  
  // Write a program to find the users current age in years.
  
  if(DOB<current_year)
  {
    cout<<(2000+current_year)-(DOB+2000);
  }
  else
  {
    cout<<(2000+current_year)-(DOB+1900);
  }
  
}