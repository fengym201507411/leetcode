package com.fym.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2. *
 * Note: *
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Code43 {


    public static void main(String[] args) {
        String a = "8";
        String b = "4";
        List<Integer> list = get2Int(a);
        List<Integer> list2 = get2Int(b);
        System.out.println(Integer.toBinaryString(0));

        System.out.println(Integer.toBinaryString(10));

        System.out.println(Integer.toBinaryString(100));

        System.out.println(Integer.toBinaryString(1000));

        System.out.println(Integer.toBinaryString(10000));
    }

    public String multiply(String num1, String num2) {
        return "123";
    }

    private static List<Integer> get2Int(String num) {
        List<Integer> list = new ArrayList<Integer>();
        List<char[]> valueList = new ArrayList(num.length());
        char[] chars = num.toCharArray();
        for (char ch : chars) {
            String value = Integer.toBinaryString((int) ch);
            valueList.add(value.toCharArray());
        }
        return list;
    }


    private static List<Integer> get10to2(int size) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        final List<Integer> ten = Arrays.asList(0, 1, 0, 1);
        int first = 0;
        if (size == 0) {
            return list;
        }
        while (first < size) {
            first++;
        }
        return list;
    }
}
