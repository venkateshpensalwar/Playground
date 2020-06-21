#include<iostream>
using namespace std;
int main()
{
 int n,s,sum_mug=0;
  cin>>n>>s;
  int mug[n];
  for(int i=0;i<n;i++)
  {
    cin>>mug[i];
  }
  for(int i=0;i<n;i++)
  {
    sum_mug+=mug[i];
  }
  if(sum_mug<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
  
  return 0;
}