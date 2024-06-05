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

// quy ước đặt tên theo package java
// tên miền đảo ngược
// com.tên_côngty.tên_dự_án.module.tên_class  ( com.microsoft.sqlserver.jdbc.login )
// C# viết theo chiều xuôi ( Microsoft.Swlserver....)
/**
 *
 * @author KIET
 */
public class MathUtilTest {

    public MathUtilTest() {
        // ở đây chứa các lệnh dùng để test các hàm main ở code chính,
        // ở bên thư mục sourse phía trên coi chạy ổn ko?
        // ở đây ta làm các hàm ứng với các cặp test case

    }

    //framework (chưa cần dùng)
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    // testcase 1: check getFactorial with N= 0 
    
    @Test
    // tên hàm mang luôn ý nghịa test case
    public void testFactorialGivenRightArgReturnWell() {
        int n = 0;
        long expectedValue = 1;
        long actualValue ;
        
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        // 
    }
    
    //TestCase 2: check getFactorial()N = 1
    @Test
    public void testFactorialGivenRightArg1ReturnWell() {
        int n = 1;
        long expectedValue = 1;
        long actualValue ;
        
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        // 
    }
    
    //TestCase 2: check getFactorial()N = 2,3,4,5
    @Test
    public void testFactorialGivenRightArg2ReturnWell() {
        int n = 2;
        long expectedValue = 2;
        long actualValue ;
        
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
//        assertEquals(6, actualValue);
//        assertEquals(120, actualValue);
        // 
    }
    // test ngoại lệ
    
    //#Test 4: check if getFactorial() return exception if we pass n<0
    @Test
    public void testFactorialGivenWrongAgrument(){
        // Input n<0 ; n = -1 expected result: Illegal  Agrument Exception
        // màu xanh: đúng như kì vọng,  màu đỏ: không như kì vọng
        // Exception ko phải value,
        
        assertThrows(IllegalArgumentException.class, 
                () -> {MathUtility.getFactorial(-1);});
        
        
    }
    
}

