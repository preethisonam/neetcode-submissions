class Solution {
    public boolean hasDuplicate(int[] nums) {

System.out.println(Arrays.stream(nums).distinct().count() + "-" +nums.length);
      return Arrays.stream(nums).distinct().count()<nums.length;

    }


}
        
        
