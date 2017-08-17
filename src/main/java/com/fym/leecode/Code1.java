package com.fym.leecode;

import java.util.Random;

/**
 * Created by Administrator on 2017/8/17.
 */
public class Code1 {


    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[100];
        for (int index = 0; index < 100; index++) {
            nums[index] = random.nextInt(100);
        }
        int target = random.nextInt(100);
        int[] result = twoSum(nums, target);
        System.out.println("随机数组为：");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        String p = String.format("第一个和为%s的两个数的下标为，return [%s,%s],值为 %s,%s", target, result[0], result[1], nums[result[0]], nums[result[1]]);
        System.out.println(p);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
