package com.example.demo.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    // <System Under Test>_<Expected Behavior>_<Condition or State Change>

    // Bad
    @Test
    fun sumPositiveNumber_ok() {
        val calculator = Calculator()
        val result: Int = calculator.sumPositiveNumber(4, 2)
        Assertions.assertEquals(6, result)
    }

    // Better
    @Test
    @DisplayName("throwing exception")
    fun sumPositiveNumber_shouldReturnSumOfIntegers_whenValidIntegers() {
        val calculator = Calculator()
        val result: Int = calculator.sumPositiveNumber(4, 2)
        Assertions.assertEquals(6, result)
    }

    // Bad
    @Test
    fun sumPositiveNumber_ko() {
        val calculator = Calculator()

        assertThrows<IllegalArgumentException> {
            calculator.sumPositiveNumber(-1, 0)
        }
    }

    // Better

    @Test
    fun sumPositiveNumber_shouldThrowIllegalArgumentException_whenInvalidIntegers() {
        val calculator = Calculator()

        assertThrows<IllegalArgumentException> {
            calculator.sumPositiveNumber(-1, 0)
        }
    }
}