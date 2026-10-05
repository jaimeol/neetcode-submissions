class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];

        int totalWater = 0;

        while (left < right)
        {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);

                int boxWater = maxLeft - height[left];
                totalWater += boxWater;
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);

                int boxWater = maxRight - height[right];
                totalWater += boxWater;
            }
        }
        return totalWater;
    }
}
