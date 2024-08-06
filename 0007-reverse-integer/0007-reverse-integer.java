class Solution {
    public int reverse(int x) {
        int neg = 0 , temp = 0 , n = 0;
        if(x<0)
        {
            neg = 1;
            x = x * -1;
        }
        temp = x;
        while(temp!=0)
        {
            int rem = temp % 10;
           if (n > Integer.MAX_VALUE / 10 || (n == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (n < Integer.MIN_VALUE / 10 || (n == Integer.MIN_VALUE / 10 && rem < -8)) return 0; 
            n = (n*10) + (rem);
            temp = temp / 10;
        }
        if(neg==1)
            n = n * -1;
            
    return n;
    }
}