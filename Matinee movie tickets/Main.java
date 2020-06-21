
#include<iostream>
using namespace std;
int main()
{
  //The first input is an integer which denotes the age.
int age;
  cin>>age;
//The second input is a floating point number which denotes the show timing.
 float time,time1=10.15,time2=13.30,time3=18.00,time4=22.00;
  cin>>time;
  if(age>13 && time==time2)
    cout<<"$5.00";
  else if(age>13 && time==time1 || time==time3 || time==time4)
    cout<<"$8.00";
  else if(age<13 && time==time2)
      cout<<"$2.00";
  else if(age<13 && time==time1 || time==time3 || time==time4)
    cout<<"$4.00";
    	
  
  return 0;
}
