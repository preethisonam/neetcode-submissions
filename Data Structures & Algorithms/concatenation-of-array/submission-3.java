class Solution {
    public int[] getConcatenation(int[] nums) {

        // return Stream.concat(Arrays.stream(nums).boxed(),Arrays.stream(nums).boxed())
        // .mapToInt(Integer::intValue)
        // .toArray();
        int n= nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];

        }
        return ans;

        
    }
}