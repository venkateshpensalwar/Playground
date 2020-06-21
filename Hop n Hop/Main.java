#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int x,y,hope_n_hop,X,Y;
  
  // Taking input i.e Final Coordinates.
 cin>>x;
 cin>>y;
  
 // (3,4) is Bunnys House location i.e Initial Coordinates 
 X=x-3;
 Y=y-4;

  // Power of X and Y for distance formula
  X*=X;
  Y*=Y;
  
// Addition of X + Y and Taking squre root.
 //	using sqrt() Function.
  
  hope_n_hop=sqrt(X+Y);
  cout<<hope_n_hop;
}