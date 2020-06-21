#include<iostream>
using namespace std;
int main()
{
 //Input consists of 1 float and 2 integers values.
  int petrol,distance_travelled;
  
  float mileage;
  
  //First input corresponds to the mileage which is of float datatype.
  	cin>>mileage;
 //Second input corresponds to liters of petrol available.
	cin>>petrol;
//Third input corresponds to the distance to be travelled.
  	cin>>distance_travelled;
  
  // Display “Can reach” or “Cannot reach” based on the situation.
  
  if(mileage*petrol<=distance_travelled)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
  
  return 0;
}