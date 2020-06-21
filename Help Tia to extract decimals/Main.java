#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  int last;
	std::string fnum,k;
	getline(cin,fnum);
  
  last=fnum.find(".");
  if(last!=-1)
  {
  cout<<"Floating part is : ";
  for(int i=last+1;i<fnum.length();i++)
  {
    
    cout<<fnum.at(i);
    
  }
  }
  else
  {
   cout<<"Floating part is : " ;
  }

  return 0;
}