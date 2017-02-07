#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long getPairs(vector<int> &a)
{ 
    long long sum = 0;
    sort(a.begin(), a.end());
    for(int i=1; i < a.size(); i++) {
        int c = 1; 
        while(i < a.size() && a[i] == a[i-1]) {
            c++;
            i++; } 
        sum += ((long long)c * (c-1)); //cP2 
    } 
    return sum; 
} 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
     int t, n;
    cin >> t; 
    while(t--) {
        cin >> n;
        vector<int> a(n);
        for(int i=0; i < n; i++)
            cin >> a[i];
        cout << getPairs(a) << endl; 
    }
    return 0;
}
