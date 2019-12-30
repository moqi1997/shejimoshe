package com.moqi.jianzhi;

import java.util.ArrayList;

/**
 *输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */

public class Solution2 {
    static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length < k || input.length == 0) {
            return arrayList;
        }
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j+1]) {
                    int tem = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tem;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int y [] = {3,4,5,65,767,6,3,7};
        ArrayList<Integer> arrayList = Solution2.GetLeastNumbers_Solution(y, 3);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
