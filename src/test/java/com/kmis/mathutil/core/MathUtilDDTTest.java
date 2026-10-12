package com.kmis.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {

    //Chuẩn bị riêng Data Test ra 1 chỗ DDT
    public static Object[][] initTestData() {
        Object[][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
//                {6, 720}
        };
        return testData;
    }

    @ParameterizedTest //Sánh ngang vai DDT
    @MethodSource("initTestData")
    public void testFactorialGivenValidNRunsWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}