package com.example.demo.math

class Calculator {

    fun sumPositiveNumber(int1: Int, int2: Int): Int {
        if (int1 < 0 || int2 < 0) {
            throw IllegalArgumentException()
        }
        return int1 + int2;
    }
}