#include<iostream>
using namespace std;
int main()
{
int r,c;
  cin>>r>>c;
  int a[r][c];
  int a2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>a2[i][j];
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cout<<a[i][j]+a2[i][j]<<" ";
     cout<<"\n";
  }
  
  
  return 0;
}