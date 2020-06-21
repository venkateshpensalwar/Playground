#include<iostream>
using namespace std;
int main(){

  int id,marks=10;
  
  //Taking input
  cin>>id;
  cin>>marks;
  
  // Condition
  if(marks>0 && marks<=10)
  {
    cout<<id<<" is eligible for reward.";
  }

return 0;
}