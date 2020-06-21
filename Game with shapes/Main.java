#include<iostream>
using namespace std;
int main()
{
//Input consist of 2 integers.
  int x,r;
 //First input corresponds to the radius of a circle.
  cin>>r;
 //Second input corresponds to the length of a square.
  cin>>x;
  // If the circle fits, display “circle can be inside a square” else display “circle cannot be inside a square”.
  if(x<r*2)
  {
    cout<<"circle cannot be inside a square";
  }
  else
  {
    cout<<"circle can be inside a square";
  }
}