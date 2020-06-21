#include<iostream>
using namespace std;
int main()
{
//Input consists of 3 integers.
  int rows,columns,Tree_number;
  cin>>rows>>columns>>Tree_number;
  
  //Display whether “It is a mango tree” or “It is not a mango tree”.
  
  if(rows+columns==Tree_number || (rows+columns)*2==Tree_number )
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  
  return 0;
}