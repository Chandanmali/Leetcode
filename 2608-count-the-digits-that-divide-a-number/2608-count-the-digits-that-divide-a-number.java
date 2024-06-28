class Solution {
    public int countDigits(int num) {
        
        int count =0;
        int temp=num;
        while (0<temp) {

            int ans= temp%10;
            
            if(num%ans==0){
                count++;
            }
        

        temp=temp/10;

       }

        return count;

    }
}