class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        //sliding window
        long prod = 1;
        int ans = 0, j=0;
        for(int i=0;i<n;i++){
            prod= prod*a[i];
            while(j<n && prod>=k){
                prod/=a[j];
                j++;
            }
            ans+=(i-j+1);
        }
        return ans;
    }
}
