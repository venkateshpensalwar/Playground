#include<iostream>
using namespace std;
int main()
{
  //Input consists of 4 integers.
 int D1,C1,D2,C2,total_Dollar,total_Cent;
  
  //First two inputs correspond to the value of the first dollar and cent.
cin>>D1>>C1;
 //Next two inputs correspond to the value of the second dollar and cent.  
 cin>>D2>>C2;
  
  // Output should print the sum of dollar and cent.
 total_Dollar=D1+D2;
 total_Cent=C1+C2;
if(total_Cent>100)
{
while(total_Cent>=100)
{
    total_Cent=total_Cent-100;
    total_Dollar=total_Dollar+1;
    break;
}
cout<<total_Dollar<<endl;
cout<<total_Cent;
}
else
    {
        cout<<total_Dollar<<endl;
        cout<<total_Cent<<endl;
    }

}