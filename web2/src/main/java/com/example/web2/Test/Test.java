package com.example.web2.Test;


import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 20, 40, 55};//需要遍历的数组
        int target = 60;//目标值

        test1(nums, target);
        test2(nums, target);
    }

    public static void test1(int[] nums, int target) {
        long datestart = System.currentTimeMillis();
        int indexA = -1;//记录中间的下标A
        int indexB = -1;//记录中间的下标B
        int x = -1;//记录数组的中间下标
        int start = 0;//记录数组的起始下标
        int end = nums.length - 1;//记录数组的最后下标
        do {
            x = (start + end) / 2;
            if (nums[x] > target) {
                end = x - 1;
                break;
            } else {
                start = x + 1;
            }
        } while (start >= end);

        for (int i = 0; i < end; i++) {
            for (int j = i; j < end; j++) {
                if (nums[j] + nums[j + 1] == target) {
                    indexA = j;
                    indexB = j + 1;
                    break;
                }
            }
        }
        System.out.println("A下标" + indexA);
        System.out.println("B下标" + indexB);
        long dateend = System.currentTimeMillis();
        System.out.println(dateend - datestart);
    }

    public static void test2(int[] nums, int target) {
        long start = System.currentTimeMillis();
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (Integer num : map.keySet()) {
            if (map.get(target - num) != null) {
                System.out.println("A下标" + map.get(num));
                System.out.println("B下标" + map.get(target - num));
                break;
            }
        }
        long end = System.currentTimeMillis();

        System.out.println(String.format("耗时：%s", end - start));
    }
}
