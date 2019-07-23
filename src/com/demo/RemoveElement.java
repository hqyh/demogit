package com.demo;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int len = removeElement(nums,val);
        System.out.println(len);
    }
    public static int removeElement(int[] nums, int val) {
        int len = 0;//用来记录最后得到的数组长度
        int j = 0;//
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                len++;//不相等，标记+1
                nums[j] = nums[i];//把不相等的数字往前移，从数组的第一位开始排
                j++;
	         }
        }
        return len;
 }
}
