#include<iostream>
using namespace std;
int main(){
  
 int max_weight,florence_weight;
  
 // The input should be the maximum weight and weight of Florence.  
cin>>max_weight;
cin>>florence_weight;

 // Required Conditions.
  
 if(max_weight>florence_weight)
 {
   cout<<"Yes, you can enter.";
 }
 else if(max_weight==florence_weight)
 {
   cout<<"Yes, you can enter. Kindly use a rope.";
 }
 else
 {
   cout<<"Sorry, you can't enter";
 }



return 0;
}