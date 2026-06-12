class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> allNums = new HashMap<>();

        int[] returnNums = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (allNums.containsKey(diff)){
                returnNums[0] = allNums.get(diff);
                returnNums[1] = i;

            }
            allNums.put(nums[i], i);
        }
        return returnNums;
    }
}

