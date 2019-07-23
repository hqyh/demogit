package com.demo;

public class RemoveElement2 {
    public static void main(String[] args){
        int[] n = {0,1,2,2,3,0,4,2};
        int v = 2;
        int l = removeElement(n,v);
        //System.out.println(l);
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
                if (j == nums.length) {
                    System.out.println(i);
                    return i;
                }
            }
        }
        System.out.println(nums.length);
        return nums.length;
    }
}
