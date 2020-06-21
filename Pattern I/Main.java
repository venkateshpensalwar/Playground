#include<iostream>
using namespace std;
int main()
{
    int num;
    cin>>num;
    int sum=num;
    for(int i=0;i<=3;i++)
    {
        for(int j=0;j<=i;j++)
        {
                 cout<<sum;

        }
        sum++;
     cout<<endl;
        }
sum--;
for(int i=3;i>=0;i--)
{
   for(int j=0;j<=i;j++)
        {
                 cout<<sum;

        }
        sum--;
        cout<<endl;
}

    return 0;
}
