#include<iostream>
using namespace std;
int main()
{
int start,End,sum;
cin>>start>>End;
for(int i=start;i<=End;i++)
{
sum=0;
    for(int j=1;j<i;j++)
    {
        if(i % j==0)
        {
            sum +=j;
        }
    }
      if(sum == i)
        {
            cout<<i<<" ";
        }
}

     return 0;
}
