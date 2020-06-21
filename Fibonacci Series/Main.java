#include<iostream>
using namespace std;

int fib(int n)
{
    int x=0;
    int y=1;
    int z=0;
    for(int i=2;i<n;i++)
    {
        z=x+y;
        x=y;
        y=z;
    }
    return z;
}
int main()
{
    int n;
    cin>>n;
    cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
}
