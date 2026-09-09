class Solution {
    public boolean hasDuplicate(int[] nums) {

Set<Integer> seen = new HashSet<>();
for (int num : nums) {
    if (!seen.add(num)) {
        return true; // add() failed because num was already there
    }
}
return false;
        
    }
}
        
        
