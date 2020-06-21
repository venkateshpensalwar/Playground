#include<iostream>
using namespace std;
int main()
{
//The first input is an integer which denotes the number of items

  int number_of_items;
  cin>>number_of_items;


 // The second input is a floating point number which denotes the single item heating time.

float item_heat_time;
  cin>>item_heat_time;


  // Print the recommended heating time in floating point with 2 decimal places.

//  If the number of items is more than three, print "Number of items is more".
if(number_of_items==1)
    {
    cout<<item_heat_time;
    }

 else if(number_of_items==2)
  {
        cout<<item_heat_time+(item_heat_time*50)/100;
  }
else if(number_of_items==3)
    {
        cout<<item_heat_time*2;
    }
else
    {
    cout<<"Number of items is more";
    }

return 0;
}
