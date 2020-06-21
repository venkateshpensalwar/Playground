#include<iostream>
using namespace std;

int digi(int x)
{
 int div,Rem,total=0;
    while(x!=0)
    {
    div=x%10;
   total=total+div;
   x=x/10;
    }
    Rem=(total/10)+(total%10);
    if((Rem)<10)
    {
    return Rem;
    }
    else
    {
        return 0;
    }

}
int main()
{
    int num;
    cin>>num;
    cout<<digi(num);

}
