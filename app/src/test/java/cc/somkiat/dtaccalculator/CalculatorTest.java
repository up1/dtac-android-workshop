package cc.somkiat.dtaccalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test(expected = XXXXException.class)
    public void
    หารเลข_2กับ_เลข_0_ต้องเกิดข้อผิดพลาดขึ้นมา() {
        calculator.หาร(2, 0);
    }

    @Test public void
    หารเลข_2กับ_เลข_2_ต้องได้_1() {
        int actualResult = calculator.หาร(2, 2);
        assertEquals(1, actualResult);
    }

    @Test public void
    คูณเลข_2กับ_เลข_2_ต้องได้_4() {
        int actualResult = calculator.คูณ(2, 2);
        assertEquals(4, actualResult);
    }

    @Test public void
    ลบเลข_2กับ_เลข_2_ต้องได้_0() {
        int actualResult = calculator.ลบ(2, 2);
        assertEquals(0, actualResult);
    }

    @Test public void
    บวกเลข_2กับ_เลข_2_ต้องได้_4() {
        int actualResult = calculator.บวก(2, 2);
        assertEquals(4, actualResult);
    }

    @Test public void
    บวกเลข_1กับ_เลข_1_ต้องได้_2() {
        int actualResult = calculator.บวก(1, 1);
        assertEquals(2, actualResult);
    }

}