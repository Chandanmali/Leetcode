class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        int ans = 0;
        if(num == 0)
        {
            return true;
            
        }
        else
        {
            if(num % 10 == 0)
            {
                return false;
            }
            else{
                return true;
            }
        }
    }
}