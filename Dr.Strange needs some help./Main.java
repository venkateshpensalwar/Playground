#include<iostream>
#include<math.h>
using namespace std;
int m,n,req,b=1;
int bacteria(int m, int n)
{
for(int y=1;y<=n;y++)
{
    b*=m;

}

}

int main()
{
  cin>>m;
  cin>>n;
  cin>>req;
  bacteria(m,n);
  if(b>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }

}
