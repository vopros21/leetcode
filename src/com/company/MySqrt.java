package com.company;

/**
 *  * <a href="https://leetcode.com/problems/sqrtx/">69. Sqrt(x)</a>
 *  * Runtime: 35ms, beats: 12.24%; Memory: 39.7MB, beats: 50.96%.
 * @author Mike Kostenko on 20/03/2023
 */

public class MySqrt {

    static int calculate(int number){
        if (number < 2) {
            return number;
        }
        long i = 1;
        while (i <= number) {
            if (i * i >= number) {
                if (i * i > number) {
                    return (int)i - 1;
                }
                return (int)i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            System.out.println(i + "\t" + calculate(i));
//        }
        int k = 2147483646;
        System.out.println(calculate(k));
    }
}
