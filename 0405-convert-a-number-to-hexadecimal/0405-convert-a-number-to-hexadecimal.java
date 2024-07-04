class Solution {
    public String toHex(int num) 
    {
        String hexa = "";
        if(num == 0)
        {
            return "0";
        }

        long val = num;
        if(val < 0){
            val = (long)Math.pow(2,32)+num;
        }
    
        while(val != 0)
        {
            int digit = (int)Math.abs(val % 16);
            if(digit < 10)
            {
                hexa = digit + hexa;
            }
            else
            {
                hexa = (char)(digit + 87) + hexa;
            }
            val = val / 16;
        }
        return hexa;
    }
}