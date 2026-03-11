class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int[] bi=new int[2];
        int j=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                bi[j++]=i;
            }
        }
        return bi;
    }
}