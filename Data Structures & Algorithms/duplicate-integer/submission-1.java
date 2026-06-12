class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> newSet = new HashSet<>();

        for (int n:nums){
            newSet.add(n);
        }

        if (newSet.size() == nums.length){
            return false;
        }
        return true; 
    }
}