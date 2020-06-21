#include<iostream>
using namespace std;

int swap(int &a,int &b)

{
a=a+b;
b=a-b;
a=a-b;

    return 0;
}


int main()
{
int x,y;
cin>>x;
cin>>y;
cout<<"Before swapping a= "<< x<<" and b="<<y<<endl;
swap(x,y);
cout<<"After swapping a= "<<x <<" and b="<<y;
return 0;
}
