package com.kmis.mathutil;

import com.kmis.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TDD - VIẾT CODE BẮT ĐẦU TỪ VIẾT TEST
        testFactorialGivenValidN5ReturnsWell120();
    }

    //Test hàm tính giai thừa n = 5
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n =5;
        long actual = MathUtil.getFactorial(5);

        System.out.println("Check 5! | expected: "
                + expected + " | actual: " + actual);
    }
    //Code này là Code
}
