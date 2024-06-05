/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhba.mathutil.test;

import com.anhba.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author KIET
 */
public class MathUtilityDDTTEst {

    // chuẩn bị data
    // data phải nằm trong hàm static
    // test case
    // 0! -> 1; 1! -> 1; 2 3! => 6
    public static Object[][] initData() {
        return new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};   
    }
    
    // viết test case so sánh coi hàm có trả đúng như kì vọng ko
    @ParameterizedTest // tham số hóa testcase
    @MethodSource("initData")
    public void testFactorialGivenWrightAgrumentReturnGood(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
