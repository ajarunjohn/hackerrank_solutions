#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    double mealCost,tip,tax,totalCost;
    int tipPercent,taxPercent;
    //cout<<"Enter the meal cost"<<endl;
    cin>>mealCost;
    //cout<<"Enter the tip percentage"<<endl;
    cin>>tipPercent;
    //cout<<"Enter the tax percentage"<<endl;
    cin>>taxPercent;
    tip=mealCost*tipPercent/100;
    tax=mealCost*taxPercent/100;
    totalCost=mealCost+tip+tax;
    cout<<"The total meal cost is "<<round(totalCost)<<" dollars.";
    return 0;
}
