/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mquan.mathutil.core;

/**
 *
 * @author NITRO 5
 */
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("asdasdkasd");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
