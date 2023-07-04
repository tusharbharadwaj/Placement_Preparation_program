/*https://leetcode.com/problems/find-the-duplicate-number/*/

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=i+1)
            {
                if(nums[i]!=nums[correct])
                {
                    int temp=nums[correct];
                    nums[correct]=nums[i];
                    nums[i]=temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

}