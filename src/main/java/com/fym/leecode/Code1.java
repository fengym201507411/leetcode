package com.fym.leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2017/8/17.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target. *

 * You may assume that each input would have exactly one solution, and you may not use the same element twice. *

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9, *

 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Code1 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[100];
        for (int index = 0; index < 100; index++) {
            nums[index] = random.nextInt(100);
        }
        int target = random.nextInt(100);
        long start = System.currentTimeMillis();
        int[] result = twoSum(nums, target);
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start));
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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int otherNum = target - nums[i];
            Integer otherFlag = map.get(otherNum);
            if (otherFlag != null) {
                result[0] = otherFlag;
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
