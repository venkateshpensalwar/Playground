#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
string name;
getline(cin,name);
for(auto i=name.rbegin();i!=name.rend();i++)
{
   cout<<*i;
}

  return 0;
}