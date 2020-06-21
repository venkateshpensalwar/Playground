#include<iostream>
using namespace std;
int main()
{
 int num,temp;
 cin>>num;
 temp=0;
 int Num=num;
int k=num;
int p=0;
while(k>0)
{
    k=k/10;
    p++;
}

 for(int i=1;i<=p;i++)
 {
     temp+=num%10;

     num=num/10;
 }
if(Num%temp==0)
{
  cout<<"Harshad Number";
 }
else
{
  cout<<"Not Harshad Number";
}
    return 0;
}
