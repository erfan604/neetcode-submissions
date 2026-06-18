class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        for(int i = 0; i <= nums.length; i++){
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            bucket.get(freq).add(num);
        }

        int[] result = new int[k];
        int count = 0;
        for(int i = bucket.size() - 1; i >= 0 && count < k; i--){
            for (int num : bucket.get(i)){
                result[count++] = num;
                if (count == k) break;

            }
        }
        return result;
    
    }
}
