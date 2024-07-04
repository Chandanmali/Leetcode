class Solution {
    public int hammingWeight(int n) 
    {
        String binary = "";
        int count = 0;
        while(n != 0)
        {
            int digit = n % 2;
            binary = digit + binary; //1011
            n = n / 2;
        }

        for(int i = 1; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                count++;
            }
        }
        return count+1;
        
    }
}