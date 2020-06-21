#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char a[50];
  int count;
  cin>>a;
  for(int i=0;i<strlen(a);i++)
  {
    
    count++;
  }
  cout<<"The number of letters in the name is "<<count;
  return 0;
}