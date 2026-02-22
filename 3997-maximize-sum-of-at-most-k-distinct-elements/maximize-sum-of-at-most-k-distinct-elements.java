class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0,i=n-1;
        ArrayList<Integer> li=new ArrayList<>();
        while(i>=0 && li.size()<k ){
                                    li.add(nums[i]);
                                    int current=nums[i];


                    while(i>=0 && current==nums[i]){
                        i--;
                    }
                    
            }
            
        
       // if(pre==nums[0] && i==0){ 
       // li.add(nums[0]);
        //}
        int[] arr=new int[li.size()];
        for(int l=0;l<li.size();l++){
            arr[l]=li.get(l);
        }
        return arr;
    }
}