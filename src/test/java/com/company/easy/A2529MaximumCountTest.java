package com.company.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A2529MaximumCountTest {

    @Test
    void maximumCount_mixedPositiveAndNegative1() {
        A2529MaximumCount instance = new A2529MaximumCount();
        int[] nums = {-2,-1,-1,1,2,3};
        assertEquals(3, instance.maximumCount(nums));
    }

    @Test
    void maximumCount_mixedPositiveAndNegative2() {
        A2529MaximumCount instance = new A2529MaximumCount();
        int[] nums = {-3,-2,-1,0,0,1,2};
        assertEquals(3, instance.maximumCount(nums));
    }

    @Test
    void maximumCount_allPositive() {
        A2529MaximumCount instance = new A2529MaximumCount();
        int[] nums = {5,20,66,1314};
        assertEquals(4, instance.maximumCount(nums));
    }
}