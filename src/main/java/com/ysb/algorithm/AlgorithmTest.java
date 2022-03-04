package com.ysb.algorithm;

/**
 * @author Huang Bangbang
 * @date 2022/3/3 - 23:29
 * 快慢指针的一个应用,利用各位的平方和=1这个特性,到达结果的时间 快指针>慢指针  结果（1: 等于1 返回true 2: 成环 返回false）
 */
public class AlgorithmTest {
    public static void main(String[] args) {
        int num = 1234556789;
        boolean f = isHappyNum(num);
        System.out.println(num+" is a happy number ? " +"--> "+f);
    }

    private static boolean isHappyNum(int num) {
        int slow = num;
        int fast = num;
        int count1 =0;
        int count2 =0;
        do {
            slow = calculate(slow);
            System.out.println("slow pointer "+(++count1)+"th time is "+slow);
            if (slow/10==0){
                return true;
            }
            fast = calculate(fast);
            System.out.println("quick pointer "+(++count2)+"th time is "+fast);
            if (fast/10==0){
                return true;
            }
            fast = calculate(fast);
            System.out.println("quick pointer "+(++count2)+"th time is "+fast);
            if (fast/10==0){
                return true;
            }
            if (fast==1){
                return true;
            }
        }while (slow!=fast);

        return false;
    }

    private static int calculate(int num) {
        int square = 0;
        while (num!=0){
            square+=(num%10)*(num%10);
            num/=10;
        }
        return square;
    }
}
