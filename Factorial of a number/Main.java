#include<iostream>
using namespace std;
int main(){
int num,Factorial=1;
  cin>>num;
  for(int i=1;i<=num;i++)
  {
    Factorial*=i;
   
  }
  cout<<Factorial;
  
  return 0;
}