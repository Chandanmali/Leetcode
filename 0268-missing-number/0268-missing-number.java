class Solution {
    public int missingNumber(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i)
            {
                return i;
            }
        }
        int ans = nums[nums.length-1] + 1;
        return ans;
        
    }
}