#include<iostream>
using namespace std;
int main()
{
    int num;
    float marks=0.0;
    int i=0;

do
{
    cin>>num;
    if(num%2==0 && num>=0)
    {
        marks=marks-0.5;

    }
    else if(num%2!=0 && num>=0)
    {
        marks=marks+1;
        i++;
    }
    else if(num<0)
    {
        marks=marks-1;
    }

}while(num>0&&i!=3);
cout<<marks+0.0;
    return 0;
}