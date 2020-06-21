#include<iostream>
using namespace std;


int GCD(int x, int y)
{
    if(x==0)
    {
        return y;
    }
    else
    {
        return GCD(y%x,x);
    }
}
int main()
{
    int num1,num2;
    cin>>num1;
    cin>>num2;
    cout<<"G.C.D of "<<num1<<" and "<<num2 <<" = "<< GCD(num1,num2);
    return 0;

}
