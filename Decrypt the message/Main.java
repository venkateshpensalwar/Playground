#include<iostream>
using namespace std;
int main()
{
int encry_num,terrorist_num,final_num,temp;
  cin>>encry_num>>terrorist_num;

  final_num=encry_num+terrorist_num;

  for(int i=1;i<final_num;i++)
  {
    if(final_num%i==0)
    {
      temp+=i;
    }
      }
    if(temp==final_num)
    {
      cout<<"They can read the message";
    }
  else
  {
    cout<<"They can't read the message";
  }

return 0;
}