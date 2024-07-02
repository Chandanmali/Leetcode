class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        int rev = 0;
        int num = Math.abs(x);
        //int temp = x;
        while(num != 0)
        {
            int digi = num % 10;
            if(rev > (Integer.MAX_VALUE - digi) / 10)
            {
                return 0;
            }
            rev = rev * 10 + digi;
            num= num / 10;
        }
        return sign*rev;

    }
}