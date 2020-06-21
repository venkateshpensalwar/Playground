#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int a,b,c;
	cin>>a>>b>>c;
    if(a>=b && a>=c)
    {
        if(b>=c)
        {
            cout<<"The treasure is in box which has number "<<b<<"\n";
        }
        else
        {
            cout<<"The treasure is in box which has number " <<c<<"\n";
        }
    }
    else if(b>=a && b>=c)
    {
        if(a>=c)
        {
            cout<<"The treasure is in box which has number "<<a<<"\n";

        }
        else
        {
            cout<<"The treasure is in box which has number "<<c<<"\n";
        }
    }
    else if(c>=a && c>=b)
    {
        if(a>=b)
        {
             cout<<"The treasure is in box which has number "<<a<<"\n";
        }
        else
        {
            cout<<"The treasure is in box which has number "<<b<<"\n";
        }
    }
int HCF=__gcd(a,b);
cout<<"The code to open the box is "<<__gcd(HCF,c);
}