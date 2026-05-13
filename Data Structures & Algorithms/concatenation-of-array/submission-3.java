class Solution {
    public int[] getConcatenation(int[] nums) {
        int lnums =nums.length;
        int[] ans = new int[lnums*2];
        for(int i=0;i<lnums;i++){
            ans[i] = nums[i];
            ans[i+lnums] = nums[i];
        }
    return ans;
    }
}