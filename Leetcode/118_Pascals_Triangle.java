class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
    ArrayList<Integer> firstrow=new ArrayList<>();
    firstrow.add(1);
    arr.add(firstrow);
    
    for(int i=1;i<numRows;i++){
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(1);
        
        for(int j=1;j<i;j++){
            int ans=arr.get(i-1).get(j-1) +arr.get(i-1).get(j);
            temp.add(ans);
            
        }
       
        temp.add(1);
       arr.add(temp);
    }
    
    
    
    return arr;
    }
}
