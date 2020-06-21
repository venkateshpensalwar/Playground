#include<iostream>
using namespace std;
int main()
{

int num,num1=6,k=5;
cin>>num;

for(int i=0;i<num;i++)
{
    cout<<num1<<" ";
    num1=num1+k;
    k=k+5;

}


    return 0;
}