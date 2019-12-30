package com.moqi.jianzhi;

public class Sulotion3 {


        public int asf(int n) {
            int sum = n;
            //boolean b = (n > 0) && (sum += sum_solution1(n-1)) > 0;
            boolean b = (n == 0) || (sum += asf(n - 1)) > 0;
            return sum;
        }

    public static void main(String[] args) {
        Sulotion3 sulotion3 = new Sulotion3();
        System.out.println(sulotion3.asf(100));
    }

}
