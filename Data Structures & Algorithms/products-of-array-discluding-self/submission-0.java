class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] results = new int [nums.length];
        int aux = 1;
        
        for (int i = 0; i < nums.length; i++) {
            results[i] = aux;
            aux = aux * nums[i];
        }

        aux = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            results[i] = results[i] * aux;
            aux = aux * nums[i];
        }

        return results;
    }
}  
