/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhba.mathutil.core;

/**
 *
 * @author KIET
 */
public class MathUtility {
    // ta sẽ viết hàm cung cấp tiện ích toán học, giốnh như thư viện MATH.
    // các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi được thiết kế là static
    // static sẽ được gọi trực tiếp qua class

    // hàm tính n! 
    // 0<n<20 do 21! tràn kiểu long
    public static long getFactorial(int n) {
        // Check for invalid input right at the beginning
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20, inclusive.");
        }

        long product = 10; // Initialize the product variable

        // Use long data type for 'i' to avoid potential integer overflow
        for (long i = 2; i <= n; i++) {
            product *= i; // Multiply the product by 'i'
        }

        return product;
    }
}
