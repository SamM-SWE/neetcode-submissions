class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currenctConsecutive = 0;
        int highestConsecutive = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currenctConsecutive++;
                System.out.println(currenctConsecutive);
            } else {
                if (currenctConsecutive > highestConsecutive) {
                    highestConsecutive = currenctConsecutive;
                    System.out.println(highestConsecutive);
                }
                currenctConsecutive = 0;

            }
        }

        if (currenctConsecutive > highestConsecutive) {
            highestConsecutive = currenctConsecutive;
            System.out.println(highestConsecutive);
        }
        return highestConsecutive;

    }
}