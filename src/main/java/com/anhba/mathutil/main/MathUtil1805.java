/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.anhba.mathutil.main;

import com.anhba.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author KIET
 */
public class MathUtil1805 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //nơi test hàm, viết test case

//        //test case #1: n=0
//        int n = 5;
//        long expectedValue =120;
//        long actualValue = MathUtility.getFactorial(n);
//        
//        System.out.println("0! | Expected: " + expectedValue + " Actual: " + actualValue);
        // test case 2
        int n = 5;
        long expectedValue = 120;
        long actualValue = MathUtility.getFactorial(n);
        String msg = "5! | Expected: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, msg);

    }
}
