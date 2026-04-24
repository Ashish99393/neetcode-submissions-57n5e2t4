class MovingAverage {
    int size;
    List<Integer> list=new ArrayList<>();
    public MovingAverage(int size) {
        this.size=size;
    }
    
    public double next(int val) {

        list.add(val);

        int windowSum=0;
        for(int i=Math.max(0, list.size() - size);i<list.size();i++){
            windowSum+=list.get(i);
        }
        
        int min=Math.min(list.size(),size);
        return  (windowSum*1.0)/min;

    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
