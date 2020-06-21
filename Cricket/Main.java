#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 //Input consists of 4 integers.
  int balls,runs,score,balls_bowled;
  cin>>balls>>runs>>score>>balls_bowled;

  float current_rate,total_runRate,over_fineshed;
  cout<<balls/6<<"\n";

int Co1=balls_bowled/6;
int Co2=balls_bowled%6;
 over_fineshed=(float)Co1+((float)Co2/10);
cout<<over_fineshed<<"\n";

current_rate=score/over_fineshed;
cout<<fixed<<setprecision(1)<<current_rate<<"\n";

total_runRate=(float)runs/(balls/6);
cout<<total_runRate<<"\n";


  if(current_rate>total_runRate)
  {
    cout<<"Eligible to Win";
  }
  else
    {
        cout<<"Not Eligible to Win";
    }


  return 0;
}
