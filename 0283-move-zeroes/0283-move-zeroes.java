class Solution {
    public void moveZeroes(int[] nums) {
       int arr = 0;
       for(int i=0; i<nums.length; i++){
       if(nums[i]!=0){
     nums[arr]=nums[i];
      arr++;
       }
    }
    for(int i=arr; i<nums.length; i++){
        nums[i] = 0;
    }
}
}