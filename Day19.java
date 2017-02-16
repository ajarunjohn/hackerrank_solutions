class Calculator implements AdvancedArithmetic {
    
    public int sum;
    
    Calculator() {
        sum = 0;
    }
    public int divisorSum(int n) {
        for(int m = n; m > 0; m--) {
            if(n%m ==0) {
                sum+= m;
            }
        }
        return sum;
    }
}
