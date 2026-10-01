class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequencyBucket = new List[nums.length + 1];

        for (int i = 0; i < frequencyBucket.length; i++) {
            frequencyBucket[i] = new ArrayList<>();
        }

        for (int key: countMap.keySet()) {
            int freq = countMap.get(key);   
            frequencyBucket[freq].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = frequencyBucket.length - 1; i >= 0; i--) {
            for (int num: frequencyBucket[i]){
                result[index++] = num;
            }
            if (index == k) {
                return result;
            }
        }
        return result;
    }
}
