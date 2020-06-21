#include<iostream>
using namespace std;
int main()
{
//Input consist of 9 integers.
  int Flip_rs,Flip_dis,Flip_charge,Snap_rs,Snap_dis,Snap_charge,Amz_rs,Amz_dis,Amz_charge;

  //First three input corresponds to Flipkart details such as the amount of the shirt, discount offered and shipping charges.

  cin>>Flip_rs>>Flip_dis>>Flip_charge;

  //Next three input corresponds to Snapdeal details such as the amount of shirt, discount offered and shipping charge.

  cin>>Snap_rs>>Snap_dis>>Snap_charge;

  //Last three input corresponds to amazon details such as the amount of shirt, discount offered and shipping charge.

cin>>Amz_rs>>Amz_dis>>Amz_charge;


// Required Calculation To Find Final Amount.

 int Flip_total,Snap_total,Amz_total;

  Flip_total=Flip_rs+Flip_charge-(Flip_rs*Flip_dis)/100;

  Snap_total=Snap_rs+Snap_charge-(Snap_rs*Snap_dis)/100;

  Amz_total=Amz_rs+Amz_charge-(Amz_rs*Amz_dis)/100;


  // he decided to buy the shirt from the website which offers it at the least price.

cout<<"In Flipkart Rs."<<Flip_total<<endl;
cout<<"In Snapdeal Rs."<<Snap_total<<endl;
cout<<"In Amazon Rs."<<Amz_total<<endl;


  if(Flip_total<=Snap_total && Flip_total<=Amz_total)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(Snap_total>Amz_total)
  {
    cout<<"He will prefer Amazon";
  }
  else{
  	cout<<"He will prefer Snapdeal";
  }
  return 0;
}

// Test  Input
/*
1000
50
50
900
50
70
800
10
200
*/
