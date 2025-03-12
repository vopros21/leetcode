package com.company.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class A1137NTribonacciNumberTest {

    @Test
    void tribonacci() {
        A1137NTribonacciNumber instance = new A1137NTribonacciNumber();
        assertEquals(4, instance.tribonacci(4));
        assertEquals(1389537, instance.tribonacci(25));
    }
}