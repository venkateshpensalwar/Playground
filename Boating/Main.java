#include<iostream>
using namespace std;
int main()
{
 //Input consists of 3 integers.
  int adults,childern,weight_boat_can_handle;
  
  //Taking input
  
  //First input corresponds to the weight that the boat can handle.
  cin>>weight_boat_can_handle;
  
  //Second input corresponds to the number of adults.
  cin>>adults;
    
  //Third input corresponds to the number of children.
  cin>>childern;

// If the weight is normal, display Boat is stable, else display Boat will drown.
  
if((adults*75)+(childern*30)<=weight_boat_can_handle)
{
  cout<<"Boat is stable";
}
else
{
  cout<<"Boat will drow";
}
  
  return 0;
}