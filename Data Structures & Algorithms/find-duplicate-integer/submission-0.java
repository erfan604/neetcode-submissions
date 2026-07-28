class Solution {
    public int findDuplicate(int[] nums) {
        int res = -1;
        Set dupes = new HashSet<>();
        for ( int n : nums){
            if (dupes.contains(n)){
                res = n;
            } else{
                dupes.add(n);
            }
        }
        return res;
    }
}
