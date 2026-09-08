class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor=xor^i;
            xor=xor^nums[i];
        }
        return xor;
    }
    public void main(String[]args){
        int[] nums={1,2,3};
        System.out.println(missingNumber(nums));
    }
}
