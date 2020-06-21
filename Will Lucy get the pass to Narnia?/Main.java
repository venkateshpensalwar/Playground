#include<iostream>
using namespace std;
int main()
{
int a,b,option;
  
  //The input should consists of two integers 
  //and the operation to be performed which should be corresponding integer.
cout<<"Enter first number :";
cout<<" Enter second number :";
cin>>a>>b; 

  
  // Main menu
  
cout<<" Menu\n";
cout<<"1.Addition\n";
cout<<"2.Subtraction\n";
cout<<"3.Multiplication\n";
cout<<"4.Division\n";
cout<<"5.Remainder\n";
cin>>option;   
 // Conditions.
switch(option)
{
  case 1:
    cout<<a+b;
    break;
  case 2:
    cout<<a-b;
    break;
  case 3:
    cout<<a*b;
    break;
  case 4:
    cout<<a/b;
    break;
  case 5:
    cout<<a%b;
    break;
  default:
    cout<<"Invalid operation";
}
return 0;
}