class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
            int[] arr=new int[n];
            int j=0;;
            for(int k=0;k<n;k++){
                if(nums[k]>0){
                    arr[j++]=nums[k];

                }
            
        }
        return arr;
        
    }
}