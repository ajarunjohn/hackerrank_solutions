public Difference(int[] e){
        this.elements = e;
    }
    
    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length-1] - elements[0]);
 
    }
