class Solution {
    public void sortColors(int[] nums) 
    {
        boolean ans = false;
        for(int i = 0; i < nums.length; i++)
        {
            ans = true;

            for(int j = 1; j < nums.length-i; j++)
            {
                if(nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }

            if(ans == false)
            {
                break;
            }
        }
    }
}